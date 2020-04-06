package alone.aspects.entities;

import java.awt.image.BufferedImage;

public interface Entity {

	public void tick();
    public BufferedImage getSprite();

    public double getPositionX();
    public double getPositionY();
}