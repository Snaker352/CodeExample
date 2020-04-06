package alone.aspects.textures.rendering;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;


// TODO: This would be one of the classes that isnt static because it should only render all the sprites once and then no matter the game, it should be able to access them
public class SpriteSheets {

    public static HashMap<String, BufferedImage> sheetMap = new HashMap<String, BufferedImage>();

    public SpriteSheets() {
        loadSprites("wearable");
        loadSprites("humanoid");
        loadSprites("tiles");
    }

    private void loadSprites(String path) {

        File file = new File("gfx/" + path);
        String[] fileList = file.list();

        for (int i = 0; i < fileList.length; i++) {

            // Gets the image from the path
            File imageFile = new File("gfx/" + path + "/" + fileList[i]);
            BufferedImage sheet = null;
            try {
                sheet = ImageIO.read(imageFile);
            } catch (IOException e) { }

            // Adds the image to the sheetMap
            String imageName = fileList[i].substring(0, fileList[i].length() - 4);
            sheetMap.put(imageName, sheet);
        }
    }
}