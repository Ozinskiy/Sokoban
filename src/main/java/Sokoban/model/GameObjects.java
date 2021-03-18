package Sokoban.model;

import java.util.HashSet;
import java.util.Set;

public class GameObjects {
    private Set<Wall> walls;
    private Player player;
    private Set<Box> boxes;
    private Set<Home> homes;

    public Set<Wall> getWalls() {
        return walls;
    }

    public Player getPlayer() {
        return player;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public GameObjects(Set<Wall> walls, Set<Box> boxes, Set<Home> homes, Player player) {
        this.walls = walls;
        this.player = player;
        this.boxes = boxes;
        this.homes = homes;
    }

    public Set<GameObject> getAll(){
        Set<GameObject> gameObjectSet = new HashSet<>();
        gameObjectSet.addAll(walls);
        gameObjectSet.addAll(boxes);
        gameObjectSet.add(player);
        gameObjectSet.addAll(homes);
        return gameObjectSet;
    }
}
