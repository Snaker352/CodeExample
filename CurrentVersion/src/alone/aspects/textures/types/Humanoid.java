package alone.aspects.textures.types;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import alone.aspects.entities.Object;
import alone.aspects.textures.rendering.Animated;
import alone.aspects.textures.rendering.RenderType;
import alone.aspects.textures.rendering.SpriteSheets;

public class Humanoid extends Animated implements RenderType {

    // TODO: Maybe set a Texture class which stores a spritesheet of every frame and whenever the character equips a new item, it reloads the sheet
    // TODO: Add armor and items to the animation

    // Dimensions
    private static final int
        HEAD_WIDTH = 24, HEAD_HEIGHT = 16,
        BODY_WIDTH = 24, BODY_HEIGHT = 16,
        HAND_WIDTH = 6, HAND_HEIGHT = 6,
        FOOT_WIDTH = 6, FOOT_HEIGHT = 6
    ;

    public Humanoid() {
        animationMaxFORWARD = 80;
        animationMaxBACKWARD = 80;

        animationMaxLEFT = 60;
        animationMaxRIGHT = 60;

        animationMaxIDLE = 40;
    }

    public BufferedImage getSprite(Object object) {

        // Creates the canvas to work on
        BufferedImage sprite = new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB);
        Graphics canvas = sprite.getGraphics();

        // TODO: Temporary - Shows the image dimensions by making the background solid
        canvas.setColor(Color.ORANGE);
        canvas.fillRect(0, 0, sprite.getWidth(), sprite.getHeight());

        // Draws the animation frame of the character
        animate(object, canvas);

        // Returns the sprite
        return sprite;
    }

    private void animate(Object object, Graphics canvas) {

        // Sets the col based on the direction the hero is facing
        int dir;
        switch (object.direction) {
            case "FORWARD": dir = 0; break;
            case "BACKWARD": dir = 1; break;
            case "LEFT": dir = 2; break;
            case "RIGHT": dir = 3; break;
            default: dir = 0;
        }

        // Gets the sprite sheet
        BufferedImage spriteSheet = SpriteSheets.sheetMap.get(object.texture);

        // TODO: Make a more effective way to do this
        switch (currentDirection) {
            case "FORWARD":
                switch (animationFrame) {
                    case 0:
                        drawHead(8, 3, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 1:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(9, 24, dir, spriteSheet, canvas);
                        drawRightHand(24, 23, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 32, dir, spriteSheet, canvas);
                        drawRightFoot(19, 33, dir, spriteSheet, canvas);
                        break;
                    case 2:
                        drawHead(8, 5, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 31, dir, spriteSheet, canvas);
                        drawRightHand(23, 23, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawRightFoot(19, 34, dir, spriteSheet, canvas);
                        drawLeftHand(11, 24, dir, spriteSheet, canvas);
                        break;
                    case 3:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(9, 24, dir, spriteSheet, canvas);
                        drawRightHand(24, 23, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 32, dir, spriteSheet, canvas);
                        drawRightFoot(19, 33, dir, spriteSheet, canvas);
                        break;
                    case 4:
                        drawHead(8, 3, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 5:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(10, 23, dir, spriteSheet, canvas);
                        drawRightHand(25, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 33, dir, spriteSheet, canvas);
                        drawRightFoot(19, 32, dir, spriteSheet, canvas);
                        break;
                    case 6:
                        drawHead(8, 5, dir, spriteSheet, canvas);
                        drawLeftHand(11, 23, dir, spriteSheet, canvas);
                        drawRightFoot(18, 31, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawRightHand(23, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 34, dir, spriteSheet, canvas);
                        break;
                    case 7:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(10, 23, dir, spriteSheet, canvas);
                        drawRightHand(25, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 33, dir, spriteSheet, canvas);
                        drawRightFoot(19, 32, dir, spriteSheet, canvas);
                        break;
                    default: break;
                }
                break;
            case "BACKWARD":
                switch (animationFrame) {
                    case 0:
                        drawHead(8, 3, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 1:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(9, 24, dir, spriteSheet, canvas);
                        drawRightHand(24, 23, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 32, dir, spriteSheet, canvas);
                        drawRightFoot(19, 33, dir, spriteSheet, canvas);
                        break;
                    case 2:
                        drawHead(8, 5, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 31, dir, spriteSheet, canvas);
                        drawRightHand(23, 23, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawRightFoot(19, 34, dir, spriteSheet, canvas);
                        drawLeftHand(11, 24, dir, spriteSheet, canvas);
                        break;
                    case 3:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(9, 24, dir, spriteSheet, canvas);
                        drawRightHand(24, 23, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 32, dir, spriteSheet, canvas);
                        drawRightFoot(19, 33, dir, spriteSheet, canvas);
                        break;
                    case 4:
                        drawHead(8, 3, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 5:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(10, 23, dir, spriteSheet, canvas);
                        drawRightHand(25, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 33, dir, spriteSheet, canvas);
                        drawRightFoot(19, 32, dir, spriteSheet, canvas);
                        break;
                    case 6:
                        drawHead(8, 5, dir, spriteSheet, canvas);
                        drawLeftHand(11, 23, dir, spriteSheet, canvas);
                        drawRightFoot(18, 31, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawRightHand(23, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 34, dir, spriteSheet, canvas);
                        break;
                    case 7:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(10, 23, dir, spriteSheet, canvas);
                        drawRightHand(25, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(15, 33, dir, spriteSheet, canvas);
                        drawRightFoot(19, 32, dir, spriteSheet, canvas);
                        break;
                    default: break;
                }
                break;
            case "LEFT":
                switch (animationFrame) {
                    case 0:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawLeftHand(13, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(16, 33, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(19, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(19, 34, dir, spriteSheet, canvas);
                        break;
                    case 1:
                        drawHead(8, 6, dir, spriteSheet, canvas);
                        drawLeftHand(9, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(13, 34, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawLeftHand(23, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(21, 33, dir, spriteSheet, canvas);
                        break;
                    case 2:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawLeftHand(13, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(16, 34, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(19, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(19, 33, dir, spriteSheet, canvas);
                        break;
                    case 3:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawLeftHand(19, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(16, 33, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(13, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(19, 34, dir, spriteSheet, canvas);
                        break;
                    case 4:
                        drawHead(8, 6, dir, spriteSheet, canvas);
                        drawLeftHand(9, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(13, 34, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawLeftHand(23, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(22, 33, dir, spriteSheet, canvas);
                        break;
                    case 5:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawLeftHand(19, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(16, 34, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(13, 26, dir, spriteSheet, canvas);
                        drawLeftFoot(19, 33, dir, spriteSheet, canvas);
                        break;
                    default: break;
                }
                break;
            case "RIGHT":
                switch (animationFrame) {
                    case 0:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawRightHand(21, 26, dir, spriteSheet, canvas);
                        drawRightFoot(15, 34, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawRightHand(15, 26, dir, spriteSheet, canvas);
                        drawRightFoot(18, 33, dir, spriteSheet, canvas);
                        break;
                    case 1:
                        drawHead(8, 6, dir, spriteSheet, canvas);
                        drawRightHand(25, 26, dir, spriteSheet, canvas);
                        drawRightFoot(12, 33, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawRightHand(11, 26, dir, spriteSheet, canvas);
                        drawRightFoot(21, 34, dir, spriteSheet, canvas);
                        break;
                    case 2:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawRightHand(21, 26, dir, spriteSheet, canvas);
                        drawRightFoot(15, 33, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawRightHand(15, 26, dir, spriteSheet, canvas);
                        drawRightFoot(18, 34, dir, spriteSheet, canvas);
                        break;
                    case 3:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawRightHand(15, 26, dir, spriteSheet, canvas);
                        drawRightFoot(18, 33, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawRightHand(21, 26, dir, spriteSheet, canvas);
                        drawRightFoot(15, 34, dir, spriteSheet, canvas);
                        break;
                    case 4:
                        drawHead(8, 6, dir, spriteSheet, canvas);
                        drawRightHand(25, 26, dir, spriteSheet, canvas);
                        drawRightFoot(21, 34, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawRightHand(11, 26, dir, spriteSheet, canvas);
                        drawRightFoot(12, 33, dir, spriteSheet, canvas);
                        break;
                    case 5:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawRightHand(15, 26, dir, spriteSheet, canvas);
                        drawRightFoot(15, 33, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawRightHand(21, 26, dir, spriteSheet, canvas);
                        drawRightFoot(18, 34, dir, spriteSheet, canvas);
                        break;
                    default: break;
                }
                break;
            case "IDLE":
                switch (animationFrame) {
                    case 0:
                        drawHead(8, 3, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 1:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 2:
                        drawHead(8, 5, dir, spriteSheet, canvas);
                        drawBody(8, 20, dir, spriteSheet, canvas);
                        drawLeftHand(8, 25, dir, spriteSheet, canvas);
                        drawRightHand(26, 25, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    case 3:
                        drawHead(8, 4, dir, spriteSheet, canvas);
                        drawBody(8, 19, dir, spriteSheet, canvas);
                        drawLeftHand(8, 24, dir, spriteSheet, canvas);
                        drawRightHand(26, 24, dir, spriteSheet, canvas);
                        drawLeftFoot(14, 33, dir, spriteSheet, canvas);
                        drawRightFoot(20, 33, dir, spriteSheet, canvas);
                        break;
                    default: break;
                }
                break;
            default: break;
        }
    }

    private void drawHead(int x, int y, int dir, BufferedImage sheet, Graphics canvas) {

        // Head
        BufferedImage head = sheet.getSubimage(dir * HEAD_WIDTH, 0, HEAD_WIDTH, HEAD_HEIGHT);
        canvas.drawImage(head, x, y, null);

        // Helmet
        // BufferedImage helmet = sheet.getSubimage(dir * HEAD_WIDTH, 0, HEAD_WIDTH, HEAD_HEIGHT);
        // canvas.drawImage(helmet, x, y, null);
    }

    private void drawBody(int x, int y, int dir, BufferedImage sheet, Graphics canvas) {

        // Body
        BufferedImage body = sheet.getSubimage(dir * BODY_WIDTH, HEAD_HEIGHT, BODY_WIDTH, BODY_HEIGHT);
        canvas.drawImage(body, x, y, null);

        // Chestplate
        // BufferedImage chestplate = sheet.getSubimage(dir * HEAD_WIDTH, 0, HEAD_WIDTH, HEAD_HEIGHT);
        // canvas.drawImage(chestplate, x, y, null);
    }

    private void drawLeftHand(int x, int y, int dir, BufferedImage sheet, Graphics canvas) {

        // Left hand
        BufferedImage hand = sheet.getSubimage(0 * HAND_WIDTH, HEAD_HEIGHT + BODY_HEIGHT, HAND_WIDTH, HAND_HEIGHT);
        canvas.drawImage(hand, x, y, null);
    }

    private void drawRightHand(int x, int y, int dir, BufferedImage sheet, Graphics canvas) {

        // Right hand
        BufferedImage hand = sheet.getSubimage(1 * HAND_WIDTH, HEAD_HEIGHT + BODY_HEIGHT, HAND_WIDTH, HAND_HEIGHT);
        canvas.drawImage(hand, x, y, null);
    }

    private void drawLeftFoot(int x, int y, int dir, BufferedImage sheet, Graphics canvas) {

        // Left foot
        BufferedImage foot = sheet.getSubimage(2 * HAND_WIDTH, HEAD_HEIGHT + BODY_HEIGHT, FOOT_WIDTH, FOOT_HEIGHT);
        canvas.drawImage(foot, x, y, null);
    }

    private void drawRightFoot(int x, int y, int dir, BufferedImage sheet, Graphics canvas) {

        // Right foot
        BufferedImage foot = sheet.getSubimage(2 * HAND_WIDTH + FOOT_WIDTH, HEAD_HEIGHT + BODY_HEIGHT, FOOT_WIDTH, FOOT_HEIGHT);
        canvas.drawImage(foot, x, y, null);
    }
}