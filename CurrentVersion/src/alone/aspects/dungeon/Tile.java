package alone.aspects.dungeon;

import java.awt.image.BufferedImage;

import alone.aspects.entities.Object;
import alone.aspects.textures.types.TileTexture;

public class Tile extends Object {

    // TODO: Add different crack or blood textures at random
    // TODO: Maybe create a Textured class for things that aren't objects but are textured. Objects would extend Textured

    public static final String BLANK = "BLANK";
    public static final String FLOOR = "FLOOR";

    public Tile(String type) {
        
        renderer = new TileTexture();

        switch (type) {
            case BLANK: texture = "blank"; break;
            case FLOOR: texture = "tile"; break;
            default: texture = "";
        }
    }

    public BufferedImage getSprite() {
        return renderer.getSprite(this);
    }
}