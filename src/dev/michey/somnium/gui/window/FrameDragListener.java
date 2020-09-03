package dev.michey.somnium.gui.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameDragListener extends MouseAdapter {

    private final JFrame frame;
    private Point mouseDownCompCoords = null;

    public FrameDragListener(JFrame frame) {
        this.frame = frame;
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
        if(frame == null) return;
        if(currCoords == null) return;
        if(mouseDownCompCoords == null) return;
        frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }

}