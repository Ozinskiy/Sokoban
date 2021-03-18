package Sokoban.view;

import Sokoban.controller.EventListener;
import Sokoban.model.Direction;
import Sokoban.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Field extends JPanel {
    private View view;
    public EventListener eventListener;
    Image image = new ImageIcon(getClass().getResource("/field.png")).getImage();


    public Field(View view){
        this.view = view;
        KeyHandler keyHandler = new KeyHandler();
        addKeyListener(keyHandler);
        setFocusable(true);
    }

    public void paint(Graphics g){
        g.drawImage(image,0,0,null);
        Set<GameObject> gameObjects = view.getGameObjects().getAll();
        for(GameObject gameObject : gameObjects){
            gameObject.draw(g);
        }
    }

    public void setEventListener(EventListener eventListener){
        this.eventListener = eventListener;
    }

    public class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_RIGHT){
                eventListener.move(Direction.RIGHT);
            }
            if(keyCode == KeyEvent.VK_LEFT){
                eventListener.move(Direction.LEFT);
            }
            if(keyCode == KeyEvent.VK_UP){
                eventListener.move(Direction.UP);
            }
            if(keyCode == KeyEvent.VK_DOWN){
                eventListener.move(Direction.DOWN);
            }
            if(keyCode == KeyEvent.VK_R){
                eventListener.restart();
            }

        }
    }
}


