package alone.main;

import java.util.LinkedList;

import alone.aspects.dungeon.Dungeon;
import alone.aspects.entities.Entity;
import alone.aspects.entities.characters.creatures.Player;

public class Engine {

    public static LinkedList<Entity> entityList = new LinkedList<Entity>();
    public static Dungeon dungeon;

    public Engine() {

        dungeon = new Dungeon();

        // TODO: Temporary - Remove this later
        entityList.add(new Player());
    }

    public void tick() {

        // Ticks every entity
        entityList.forEach(Entity::tick);
    }
}