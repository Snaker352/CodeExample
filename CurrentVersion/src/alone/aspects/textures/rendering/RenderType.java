package alone.aspects.textures.rendering;

import java.awt.image.BufferedImage;

import alone.aspects.entities.Object;

public interface RenderType {

    public void nextFrame(Object object);
    public BufferedImage getSprite(Object object);
}