package Sokoban.model;


import javax.swing.*;
import java.awt.*;

public class Box extends CollisionObject implements Movable{
    Image img = new ImageIcon(getClass().getResource("/box.png")).getImage();

    public Box(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(img,this.getX() - this.getWidth() / 2, this.getY() - this.getHeight() / 2, null);
    }
}
