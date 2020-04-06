package alone.aspects.entities.characters;

import java.awt.image.BufferedImage;

import alone.aspects.entities.*;
import alone.aspects.entities.Object;

public class Character extends Object implements Entity {

    private double speed = 0.5;

    public Character() {
        //
    }

    protected void move(int x, int y) {
        posX += x * speed;
        posY += y * speed;
    }

    public void tick() {
        renderer.nextFrame(this);
    }

    public BufferedImage getSprite() {
        return renderer.getSprite(this);
    }

    public double getPositionX() { return posX; }
    public double getPositionY() { return posY; }
}