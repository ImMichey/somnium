package dev.michey.somnium.gui.component.panel;

import dev.michey.somnium.gui.component.basic.SomniumComponent;

import javax.swing.*;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumPanel extends SomniumComponent {

    private JPanel panel;

    public SomniumPanel() {
        panel = new JPanel();
        panel.setSize(PANEL_DEFAULT_WIDTH, PANEL_DEFAULT_HEIGHT);
    }

    @Override
    public void setDefaultSomniumTheme() {
        panel.setBackground(COLOR_PAGE_DARK.getColorMap().get(COLOR_PAGE_KEY_PANEL));
    }

    @Override
    public JPanel getSwing() {
        return panel;
    }

}
