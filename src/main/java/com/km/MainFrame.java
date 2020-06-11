package com.km;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;
    private com.km.painter.Painter painter;

    public MainFrame(com.km.painter.Painter painter) {
        this.painter = painter;
        Display display = new Display();
        painter.setCanvas(display);
        add(display);
    }

    void setUp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    class Display extends Canvas {
        @Override
        public void paint(Graphics g) {
            painter.paint(g);
        }
    }
}

