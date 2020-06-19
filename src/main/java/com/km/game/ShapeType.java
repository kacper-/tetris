package com.km.game;

public enum ShapeType {
    LONG, SQUARE, T;

    int[] getData() {
        switch (this) {
            case LONG:
                return new int[]{
                        0, 1, 0, 0,
                        0, 1, 0, 0,
                        0, 1, 0, 0,
                        0, 1, 0, 0
                };
            case SQUARE:
                return new int[]{
                        0, 1, 1, 0,
                        0, 1, 1, 0,
                        0, 0, 0, 0,
                        0, 0, 0, 0
                };
            case T:
                return new int[]{
                        0, 1, 0, 0,
                        0, 1, 1, 0,
                        0, 1, 0, 0,
                        0, 0, 0, 0
                };
            default:
                return null;
        }
    }

    int getSize() {
        return 4;
    }
}
