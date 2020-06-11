package com.km.game;

public class GameState {
    private int level = 0;
    private int score = 0;
    private Shape shape;

    public int getLevel() {
        return level;
    }

    void nextLevel() {
        level++;
    }

    public int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    public Shape getShape() {
        return shape;
    }

    void setShape(Shape shape) {
        this.shape = shape;
    }
}
