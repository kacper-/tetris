package com.km.game;

import com.km.painter.GameStatePainter;

public class Game {
    private GameStatePainter painter;
    private GameState gameState;

    public Game(GameStatePainter painter) {
        this.painter = painter;
        gameState = new GameState();
    }

    public void start() {
        painter.paint(gameState);
    }
}
