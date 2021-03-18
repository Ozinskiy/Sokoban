package Sokoban.model;

import java.awt.*;

public abstract class GameObject {
    private int x;
    private int y;
    private int height;
    private int width;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        if(height == 0 && width == 0){
            this.height = Model.FIELD_CELL_SIZE;
            this.width = Model.FIELD_CELL_SIZE;
        }else {
            this.height = height;
            this.width = width;
        }
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
        this.height = Model.FIELD_CELL_SIZE;
        this.width = Model.FIELD_CELL_SIZE;
    }

    public abstract void draw(Graphics graphics);
}
