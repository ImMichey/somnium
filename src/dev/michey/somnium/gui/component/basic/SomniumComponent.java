package dev.michey.somnium.gui.component.basic;

import dev.michey.somnium.constants.SomniumConstants;
import dev.michey.somnium.gui.component.listener.ComponentDragListener;
import dev.michey.somnium.gui.window.SomniumWindow;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class SomniumComponent {

    private long somniumComponentId;
    private String somniumComponentName;
    private List<SomniumComponent> childComponents;
    private SomniumComponent parentComponent;

    public SomniumComponent() {
        somniumComponentId = SomniumConstants.somniumController.generateComponentId();
        somniumComponentName = "somnium-component-" + somniumComponentId;
        childComponents = new LinkedList<>();
        SomniumConstants.somniumController.registerComponent(this);
    }

    public abstract Component getSwing();

    public abstract void setDefaultSomniumTheme();

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

    public void setParentComponent(SomniumComponent parentComponent) {
        this.parentComponent = parentComponent;
    }

    public SomniumComponent getParentComponent() {
        return parentComponent;
    }

    public void addSomniumComponent(SomniumComponent somniumComponent) {
        childComponents.add(somniumComponent);
        somniumComponent.setParentComponent(this);

        if(this instanceof SomniumWindow) {
            // It's a window.
            SomniumWindow window = (SomniumWindow) this;
            window.getSwing().add(somniumComponent.getSwing());
        } else {
            // Anything else. Panel, Label, etc.
            JComponent jComponent = (JComponent) getSwing();
            jComponent.add(somniumComponent.getSwing());
        }
    }

    public void removeSomniumComponent(SomniumComponent somniumComponent) {
        childComponents.remove(somniumComponent);
    }

    public void setDraggable() {
        ComponentDragListener componentDragListener = new ComponentDragListener(this);
        getSwing().addMouseListener(componentDragListener);
        getSwing().addMouseMotionListener(componentDragListener);
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
