package alone.aspects.textures.types;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import alone.aspects.entities.Object;
import alone.aspects.textures.rendering.RenderType;
import alone.aspects.textures.rendering.SpriteSheets;

public class TileTexture implements RenderType {

    public TileTexture() {
        //
    }

    public BufferedImage getSprite(Object object) {

        // Creates the canvas to work on
        BufferedImage sprite = new BufferedImage(30, 30, BufferedImage.TYPE_INT_ARGB);
        Graphics canvas = sprite.getGraphics();
        BufferedImage spriteSheet = SpriteSheets.sheetMap.get(object.texture);

        // TODO: Temporary - Shows the image dimensions by making the background solid
        canvas.setColor(Color.ORANGE);
        canvas.fillRect(0, 0, sprite.getWidth(), sprite.getHeight());

        // Draw tile
        canvas.drawImage(spriteSheet, 0, 0, null);

        // Returns the sprite
        return sprite;
    }

    public void nextFrame(Object object) {
        //
    }
}