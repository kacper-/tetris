package com.km.game;

public class Shape {
    private ShapeType type;
    private int rotation = 0;

    Shape(ShapeType type) {
        this.type = type;
    }

    ShapeType getType() {
        return type;
    }

    public int[] getData() {
        return type.getData();
    }

    void turnRight() {
        rotation = (rotation + 1) % 4;
    }

    void turnLeft() {
        rotation = (rotation - 1) % 4;
    }
}
