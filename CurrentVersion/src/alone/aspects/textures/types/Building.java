package alone.aspects.textures.types;

import java.awt.image.BufferedImage;

import alone.aspects.entities.Object;
import alone.aspects.textures.rendering.Animated;
import alone.aspects.textures.rendering.RenderType;

public class Building extends Animated implements RenderType {
    
    public Building() {
        
        // TODO: Make these animations and set the values correctly
        animationMaxFORWARD = 0;
        animationMaxBACKWARD = 0;
        animationMaxLEFT = 0;
        animationMaxRIGHT = 0;
        animationMaxIDLE = 0;
    }

    public BufferedImage getSprite(Object object) {

        // TODO: Add in a way to render the sprite
        return null;
    }
}