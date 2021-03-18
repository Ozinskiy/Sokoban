package Sokoban.model;

public abstract class CollisionObject extends GameObject{
    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction){

        return switch (direction) {
            case UP -> this.getY() - Model.FIELD_CELL_SIZE == gameObject.getY() && this.getX() == gameObject.getX();
            case DOWN -> this.getY() + Model.FIELD_CELL_SIZE == gameObject.getY() && this.getX() == gameObject.getX();
            case RIGHT -> this.getX() + Model.FIELD_CELL_SIZE == gameObject.getX() && this.getY() == gameObject.getY();
            case LEFT -> this.getX() - Model.FIELD_CELL_SIZE == gameObject.getX() && this.getY() == gameObject.getY();
        };
    }
}
