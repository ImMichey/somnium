package dev.michey.somnium.gui.component;

public class SomniumController {

    private int currentId;

    public synchronized int generateSomniumComponentId() {
        int oldId = currentId;
        currentId++;
        return oldId;
    }

}
