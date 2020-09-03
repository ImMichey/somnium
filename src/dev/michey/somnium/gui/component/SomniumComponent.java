package dev.michey.somnium.gui.component;

import dev.michey.somnium.constants.SomniumConstants;

import javax.swing.*;

public abstract class SomniumComponent {

    private int somniumComponentId;

    public SomniumComponent() {
        somniumComponentId = SomniumConstants.somniumController.generateSomniumComponentId();
    }

    public abstract JComponent getSwing();

    public int getSomniumComponentId() {
        return somniumComponentId;
    }

    public boolean equals(SomniumComponent other) {
        return somniumComponentId == other.getSomniumComponentId();
    }

}
