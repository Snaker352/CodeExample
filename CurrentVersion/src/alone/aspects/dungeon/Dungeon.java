package alone.aspects.dungeon;

public class Dungeon {

    // TODO: Find a way to store dungeon data
    // TODO: Maybe make the dungeon randomized
    // TODO: Add walls as tiles

    public final int WIDTH;
    public final int HEIGHT;

    public Tile[][] tileGrid;

    public Dungeon() {

        // TODO: Temporary - Setting grid sizes based on nothing
        WIDTH = 50;
        HEIGHT = 50;
        tileGrid = new Tile[WIDTH][HEIGHT];

        // TODO: Make this better
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (x > 2 && x <= WIDTH - 2 && y > 2 && y <= HEIGHT - 2) {
                    tileGrid[x][y] = new Tile(Tile.FLOOR);
                } else {
                    tileGrid[x][y] = new Tile(Tile.BLANK);
                }
            }
        }
    }
}