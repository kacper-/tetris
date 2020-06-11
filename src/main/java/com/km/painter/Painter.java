package com.km.painter;

import com.km.game.GameState;

import java.awt.*;

public class Painter implements GameStatePainter {
    private static final int BLOCK = 10;
    private Canvas canvas;
    private GameState gameState;

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public void paint(GameState gameState) {
        this.gameState = gameState;
        canvas.repaint();
    }

    public void paint(Graphics g) {
        if (gameState == null || gameState.getLevel() == 0) {
            return;
        }
        paintShape(g);
    }

    private void paintShape(Graphics g) {
        int[] data = gameState.getShape().getData();
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (data[x + y * 4] == 1)
                    g.drawRect(100 + (x * BLOCK), 100 + (y * BLOCK), BLOCK, BLOCK);
            }
        }
    }
}

