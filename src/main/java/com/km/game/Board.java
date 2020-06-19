package com.km.game;

public class Board {
    private final int x;
    private final int y;
    private final int[] blocks;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
        blocks = new int[x * y];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getBlocks() {
        return blocks;
    }
}
