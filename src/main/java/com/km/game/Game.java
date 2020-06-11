package com.km.game;

import com.km.painter.GameStatePainter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class Game implements KeyListener {
    private final GameStatePainter painter;
    private final GameState gameState;
    private boolean pause = true;
    private Controller controller;

    public Game(GameStatePainter painter) {
        this.painter = painter;
        gameState = new GameState();
        controller = new Controller(gameState);
    }

    public void start() {
        setUp();
        while (true) {
            timeTick();
            if (pause)
                continue;
            controller.updateState();
            painter.paint(gameState);
        }
    }

    private void setUp() {
        controller.createShape();
        gameState.nextLevel();
    }

    private void timeTick() {
        try {
            Thread.sleep(Controller.TICK);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_SPACE:
                pause = !pause;
                break;
            case VK_A:
                controller.turnLeft();
                break;
            case VK_S:
                controller.turnRight();
                break;
            case VK_D:
                controller.putDown();
                break;
            case VK_RIGHT:
                controller.moveRight();
                break;
            case VK_LEFT:
                controller.moveLeft();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }
}
