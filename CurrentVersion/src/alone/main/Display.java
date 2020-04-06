package alone.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import alone.aspects.dungeon.Dungeon;
import alone.aspects.dungeon.Tile;
import alone.aspects.entities.*;
import alone.aspects.textures.rendering.SpriteSheets;
import alone.utils.Camera;

public class Display {

    // TODO: Display tiles in the distance with less light, make them have a darker color

    private int width, height;
    private BufferedImage screen;
    private BufferedImage window;

    public Camera camera;
    
    public Display(int width, int height) {

        // TODO: Might not need to intake width and height when it resizes upon startup
        setSize(width, height);

        // Unscaled screen
        screen = new BufferedImage(960, 544, BufferedImage.TYPE_INT_ARGB);

        //TODO:  Might want to make this a variable
        new SpriteSheets();
        camera = new Camera();
    }

    public BufferedImage getScreen() {
        return window;
    }

    public void loadScreen() {
        
        // TODO: Temporary
        System.out.println("DISPLAY: camera: (" + camera.posX + ", " + camera.posY + ")");

        // Creates the graphics
        Graphics g = screen.getGraphics();

        // Draws the screen
        drawTiles(g);
        drawEntities(g);

        // Disposes of graphics
        g.dispose();

        // TODO: If the screen scales and there's extra space, figure out what can be extended to fill the entire area
        // TODO: Draw the screen scaled based on the camera zoom
        Graphics s = window.getGraphics();
        s.drawImage(screen, 0, 0, null);
        s.dispose();
    }

    private void drawTiles(Graphics g) {

        Dungeon dungeon = Engine.dungeon;

        for (int x = 0; x < dungeon.WIDTH; x++) {
            for (int y = 0; y < dungeon.HEIGHT; y++) {
                
                Tile tile = dungeon.tileGrid[x][y];
                g.drawImage(tile.getSprite(), x * 30, y * 30, null);
            }
        }
    }

    private void drawEntities(Graphics g) {

        // TODO: Before drawing, sort entities from top to bottom
        // TODO: Maybe use this after sorting: entityList.forEach(Entity::tick);

        for (int i = 0; i < Engine.entityList.size(); i++) {

            Entity e = Engine.entityList.get(i);

            g.drawImage(e.getSprite(), (int) e.getPositionX(), (int) e.getPositionY(), null);

            // TODO: NOTE - How to rescale something
            //g.drawImage(e.getSprite(), (int) e.getPositionX(), (int) e.getPositionY(), e.getSprite().getWidth() * 3, e.getSprite().getHeight() * 3, null);
        }
    }

    public void setSize(int width, int height) {

        // Sets dimensions
        this.width = width;
        this.height = height;

        // Resizes the screen
        window = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
    }
}