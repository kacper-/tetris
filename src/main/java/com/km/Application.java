package com.km;

import com.km.game.Game;
import com.km.painter.Painter;

import javax.swing.*;

public class Application {

    public static void main(String... args) {
        com.km.painter.Painter painter = new Painter();
        MainFrame frame = new MainFrame(painter);
        Game game = new Game(painter);
        SwingUtilities.invokeLater(frame::setUp);
        new Thread(game::start).start();
    }
}
