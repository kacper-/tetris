package com.km.painter;

import com.km.game.GameState;

import java.awt.*;

public class Painter implements GameStatePainter {
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
        g.drawString("dfdf", 100, 100);
    }
}

