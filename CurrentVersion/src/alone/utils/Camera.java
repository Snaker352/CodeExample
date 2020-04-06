package alone.utils;

public class Camera {

    // TODO: Use this to view the character on a spot on the map
    // TODO: Use zoom to specify how far out the screen can see

    // TODO: Might want to make these private
    public double posX;
    public double posY;
    public double zoom = 1;

    public Camera() {
        posX = 0;
        posY = 0;
    }

    public void move(double x, double y) {
        // TODO: Maybe add in a slow effect where the camera catches up to the character
        posX = x;
        posY = y;
    }
}