package alone.aspects.textures.rendering;

import alone.aspects.entities.Object;

public class Animated {

    protected String currentDirection;

    protected int animationFrame;
    private int animationTimer;

    private int animationMax;
    // TODO: Maybe find a way to make these variables final
    protected int animationMaxFORWARD;
    protected int animationMaxBACKWARD;
    protected int animationMaxLEFT;
    protected int animationMaxRIGHT;
    protected int animationMaxIDLE;

    public Animated() {
        animationTimer = 0;
        animationFrame = 0;
    }

    public void nextFrame(Object object) {

        if (object.direction == currentDirection) {
            
            animationTimer = animationTimer == animationMax - 1 ? 0 : animationTimer + 1;
            animationFrame = (int) Math.floor(animationTimer / 10);
        } else {

            System.out.println("ANIMATED - Direction changed");

            animationTimer = 0;
            animationFrame = 0;
            currentDirection = object.direction;

            switch (currentDirection) {
                case "FORWARD": animationMax = animationMaxFORWARD; break;
                case "BACKWARD": animationMax = animationMaxBACKWARD; break;
                case "LEFT": animationMax = animationMaxLEFT; break;
                case "RIGHT": animationMax = animationMaxRIGHT; break;
                case "IDLE": animationMax = animationMaxIDLE; break;
                default: animationMax = 0;
            }   
        }
    }
}