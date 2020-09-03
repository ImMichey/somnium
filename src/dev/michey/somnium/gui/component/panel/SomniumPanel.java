package dev.michey.somnium.gui.component.panel;

import dev.michey.somnium.gui.component.SomniumComponent;

import javax.swing.*;

public class SomniumPanel extends SomniumComponent {

    private JPanel panel;

    public SomniumPanel() {
        panel = new JPanel();
    }

    @Override
    public JComponent getSwing() {
        return panel;
    }

}
