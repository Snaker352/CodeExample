package alone.aspects.entities.structures;

import java.awt.image.BufferedImage;

import alone.aspects.entities.Entity;
import alone.aspects.entities.Object;

public class Structure extends Object implements Entity {

    public Structure() {
        //
    }

    public void tick() {
        // TODO: Maybe do more stuff here?
    }

    public BufferedImage getSprite() {
        return renderer.getSprite(this);
    }

    public double getPositionX() { return posX; }
    public double getPositionY() { return posY; }
}