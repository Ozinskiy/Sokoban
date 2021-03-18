package Sokoban.model;

import javax.swing.*;
import java.awt.*;

public class Wall extends CollisionObject{

    Image image = new ImageIcon(getClass().getResource("/wall.png")).getImage();

    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(image, this.getX() - this.getWidth() / 2, this.getY() - this.getHeight() / 2, null);
    }
}
