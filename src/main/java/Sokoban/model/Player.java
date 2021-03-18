package Sokoban.model;

import javax.swing.*;
import java.awt.*;

public class Player extends CollisionObject implements Movable{

    Image image = new ImageIcon(getClass().getResource("/player.png")).getImage();

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(image, this.getX() - this.getWidth() / 2, this.getY() - this.getHeight() / 2, null);
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }
}
