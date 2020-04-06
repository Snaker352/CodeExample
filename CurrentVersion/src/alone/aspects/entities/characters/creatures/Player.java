package alone.aspects.entities.characters.creatures;

import alone.aspects.entities.characters.Hero;
import alone.aspects.textures.types.Humanoid;

public class Player extends Hero {

    public Player() {
        
        // TODO: Temporary - Sets variables
        posX = 100.0;
        posY = 28.5;
        texture = "hero";
        direction = "LEFT";
        renderer = new Humanoid();
    }
}