package dev.michey.somnium.gui.component.basic;

import dev.michey.somnium.constants.SomniumConstants;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class SomniumComponent {

    private long somniumComponentId;
    private String somniumComponentName;
    private List<SomniumComponent> childComponents;

    public SomniumComponent() {
        somniumComponentId = SomniumConstants.somniumController.generateComponentId();
        somniumComponentName = "somnium-component-" + somniumComponentId;
        childComponents = new LinkedList<>();
        SomniumConstants.somniumController.registerComponent(this);
    }

    public abstract Component getSwing();

    public long getSomniumComponentId() {
        return somniumComponentId;
    }

    public void show() {
        getSwing().setVisible(true);

        for(SomniumComponent sc : childComponents) {
            sc.show();
        }
    }

    public void hide() {
        getSwing().setVisible(false);

        for(SomniumComponent sc : childComponents) {
            sc.hide();
        }
    }

    public void addSomniumComponent(SomniumComponent somniumComponent) {
        childComponents.add(somniumComponent);
    }

    public void removeSomniumComponent(SomniumComponent somniumComponent) {
        childComponents.remove(somniumComponent);
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

    public List<SomniumComponent> getChildComponents() {
        return childComponents;
    }

}
