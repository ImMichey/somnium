package dev.michey.somnium.gui.window;

import dev.michey.somnium.gui.component.basic.SomniumComponent;

import javax.swing.*;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumWindow extends SomniumComponent {

    private JFrame frame;

    public SomniumWindow() {
        this(WINDOW_DEFAULT_WIDTH, WINDOW_DEFAULT_HEIGHT);
    }

    public SomniumWindow(String title) {
        this(WINDOW_DEFAULT_WIDTH, WINDOW_DEFAULT_HEIGHT, title);
    }

    public SomniumWindow(int width, int height) {
        this(width, height, WINDOW_DEFAULT_TITLE);
    }

    public SomniumWindow(int width, int height, String title) {
        super();

        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        centerOnScreen();
        setDefaultSomniumTheme();
    }

    @Override
    public void setDefaultSomniumTheme() {
        frame.getContentPane().setBackground(COLOR_PAGE_DARK.getColorMap().get(COLOR_PAGE_KEY_BACKGROUND));
        frame.setIconImage(WINDOW_ICONS[2]); // 32px looks the most solid
    }

    public void centerOnScreen() {
        frame.setLocationRelativeTo(null);
    }

    @Override
    public JFrame getSwing() {
        return frame;
    }

}
