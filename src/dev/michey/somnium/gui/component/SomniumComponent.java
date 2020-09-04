package dev.michey.somnium.gui.component;

import dev.michey.somnium.constants.SomniumConstants;

import javax.swing.*;

public abstract class SomniumComponent {

    private long somniumComponentId;
    private String somniumComponentName;

    public SomniumComponent() {
        somniumComponentId = SomniumConstants.somniumController.generateComponentId();
        somniumComponentName = "somnium-component-" + somniumComponentId;
        SomniumConstants.somniumController.registerComponent(this);
    }

    public abstract JComponent getSwing();

    public long getSomniumComponentId() {
        return somniumComponentId;
    }

    public void show() {
        getSwing().setVisible(true);
    }

    public void hide() {
        getSwing().setVisible(false);
    }

    public void setSomniumComponentName(String somniumComponentName) {
        String oldKey = this.somniumComponentName;
        this.somniumComponentName = somniumComponentName;
        SomniumConstants.somniumController.updateComponent(this, oldKey);
    }

    public String getSomniumComponentName() {
        return somniumComponentName;
    }

    public boolean equals(SomniumComponent other) {
        return somniumComponentId == other.getSomniumComponentId();
    }

}
