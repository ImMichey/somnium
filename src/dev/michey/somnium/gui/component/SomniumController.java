package dev.michey.somnium.gui.component;

public class SomniumController {

    private int currentId;

    public synchronized int generatedComponentId() {
        int oldId = currentId;
        currentId++;
        return oldId;
    }

}
