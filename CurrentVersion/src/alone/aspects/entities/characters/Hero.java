package alone.aspects.entities.characters;

import alone.main.Game;
import alone.utils.*;

public class Hero extends Character {

    public Hero() {
        //
    }

    public void tick() {
        super.tick();

        // TODO: Don't know if this works very well
        moveChar();
    }

    private void moveChar() {
        
        // Moves the character
        if (KeyManager.upPressed) {
            move(0, 1);
        }
        if (KeyManager.downPressed) {
            move(0, -1);
        }
        if (KeyManager.leftPressed) {
            move(-1, 0);
        }
        if (KeyManager.rightPressed) {
            move(1, 0);
        }

        // Sets the direction of the character
        boolean x = false;
        boolean y = false;

        if (KeyManager.leftPressed ^ KeyManager.rightPressed) {
            x = true;
        }
        if (KeyManager.upPressed ^ KeyManager.downPressed) {
            y = true;
        }

        if (x || y) {
            if (x) {
                if (KeyManager.leftPressed) {
                    direction = "LEFT";
                }
                if (KeyManager.rightPressed) {
                    direction = "RIGHT";
                }
            } else {
                if (KeyManager.upPressed) {
                    direction = "BACKWARD";
                }
                if (KeyManager.downPressed) {
                    direction = "FORWARD";
                }
            }
        } else {
            direction = "IDLE";
        }

        // Updates the camera
        Game.display.camera.move(posX, posY);
    }
}