package com.km.game;

import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    private final GameState gameState;
    private final Collision collision;

    Controller(GameState gameState) {
        this.gameState = gameState;
        this.collision = new Collision(gameState);
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
        gameState.setShapeX(gameState.getShapeX() + 1);
    }

    void moveLeft() {
        gameState.setShapeX(gameState.getShapeX() - 1);
    }

    void createShape() {
        ShapeType type = ShapeType.values()[ThreadLocalRandom.current().nextInt(ShapeType.values().length)];
        // TODO save old shape to board
        gameState.setShape(new Shape(type));
        gameState.setShapeX((gameState.getMaxX() / 2) - 2);
        gameState.setShapeY(0);
    }

    int lowerShape() {
        if (collision.canLower()) {
            gameState.setShapeY(gameState.getShapeY() + 1);
            return 1;
        }
        return 0;
    }

}
