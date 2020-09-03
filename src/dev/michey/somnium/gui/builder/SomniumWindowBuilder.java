package dev.michey.somnium.gui.builder;

import dev.michey.somnium.gui.window.SomniumWindow;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumWindowBuilder {

    private SomniumWindow somniumWindow;

    public SomniumWindowBuilder() {
        somniumWindow = new SomniumWindow(WINDOW_DEFAULT_WIDTH, WINDOW_DEFAULT_HEIGHT);
    }

    public SomniumWindowBuilder withTitle(String title) {
        somniumWindow.getSwing().setTitle(title);
        return this;
    }

    public SomniumWindowBuilder withSize(int width, int height) {
        somniumWindow.getSwing().setSize(width, height);
        return this;
    }

    public SomniumWindow build() {
        return somniumWindow;
    }

}
