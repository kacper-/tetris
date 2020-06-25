package com.km.game;

public class Shape {
    private ShapeType type;
    private int[] data;

    Shape(ShapeType type) {
        this.type = type;
        data = type.getData();
    }

    ShapeType getType() {
        return type;
    }

    public int[] getData() {
        return data;
    }

    void turnLeft() {
        // TODO implement pre-calculated versions of turned shape instead of calculating rotation
        int[] turned = new int[data.length];
        for (int y = 0; y < type.getSize(); y++) {
            for (int x = 0; x < type.getSize(); x++) {
                turned[12 + y - (type.getSize() * x)] = data[x + y * type.getSize()];
            }
        }
        data = turned;
    }

    void turnRight() {
        int[] turned = new int[data.length];
        for (int y = 0; y < type.getSize(); y++) {
            for (int x = 0; x < type.getSize(); x++) {
                turned[(type.getSize() - y - 1) + x * type.getSize()] = data[x + y * type.getSize()];
            }
        }
        data = turned;
    }
}
