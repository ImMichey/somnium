package dev.michey.somnium.gui.component.listener;

import dev.michey.somnium.gui.component.basic.SomniumComponent;
import dev.michey.somnium.gui.window.SomniumWindow;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ComponentDragListener extends MouseAdapter {

    private final SomniumComponent component;
    private Point mouseDownCompCoords = null;

    public ComponentDragListener(SomniumComponent component) {
        this.component = component;
    }

    public void mouseReleased(MouseEvent e) {
        if(e.getButton() != MouseEvent.BUTTON1) return;
        mouseDownCompCoords = null;
    }

    public void mousePressed(MouseEvent e) {
        if(e.getButton() != MouseEvent.BUTTON1) return;
        mouseDownCompCoords = e.getPoint();
    }

    public void mouseDragged(MouseEvent e) {
        Point currCoords = e.getLocationOnScreen();
        if(component == null) return;
        if(currCoords == null) return;
        if(mouseDownCompCoords == null) return;

        if(component instanceof SomniumWindow) {
            component.getSwing().setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        } else {
            // Not implemented yet.
        }
    }

}
