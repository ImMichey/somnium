package dev.michey.somnium.gui.window;

import javax.swing.*;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumWindow {

    private JFrame frame;

    public SomniumWindow(int width, int height) {
        this(width, height, WINDOW_DEFAULT_TITLE);
    }

    public SomniumWindow(int width, int height, String title) {
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JFrame getSwing() {
        return frame;
    }

}
