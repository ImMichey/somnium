package dev.michey.somnium.gui.builder;

import dev.michey.somnium.gui.color.ColorPage;
import dev.michey.somnium.gui.window.SomniumWindow;

import java.awt.*;

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

    public SomniumWindowBuilder withBackground(Color color) {
        somniumWindow.getSwing().getContentPane().setBackground(color);
        return this;
    }

    public SomniumWindowBuilder withBackground(String hex) {
        return withBackground(Color.decode(hex));
    }

    public SomniumWindowBuilder withBackground(ColorPage colorPage) {
        return withBackground(colorPage.getColorMap().get(COLOR_PAGE_KEY_BACKGROUND));
    }

    public SomniumWindowBuilder setDraggable() {
        somniumWindow.setDraggable();
        return this;
    }

    public SomniumWindowBuilder setDraggable(boolean flag) {
        if(flag) return setDraggable();
        return this;
    }

    public SomniumWindowBuilder hideWindowButtons() {
        somniumWindow.getSwing().setUndecorated(true);
        return this;
    }

    public SomniumWindow build() {
        return somniumWindow;
    }

}
