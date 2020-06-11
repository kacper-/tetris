package com.km.game;

import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    static final int TICK = 50;
    private final GameState gameState;
    private int counter = 0;

    Controller(GameState gameState) {
        this.gameState = gameState;
    }

    void turnLeft() {
        gameState.getShape().turnLeft();
    }

    void turnRight() {
        gameState.getShape().turnRight();
    }

    void putDown() {

    }

    void moveRight() {

    }

    void moveLeft() {

    }

    public void createShape() {
        ShapeType type = ShapeType.values()[ThreadLocalRandom.current().nextInt(ShapeType.values().length)];
        gameState.setShape(new Shape(type));
    }

    public void updateState() {
        counter++;
        if (counter % 20 == 0)
            gameState.nextLevel();
    }
}
