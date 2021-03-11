package Sokoban.controller;

import Sokoban.model.Model;
import Sokoban.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
        model = new Model();
        view = new View(this);
    }

    public static void main(String[] args) {

    }
}
