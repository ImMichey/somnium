package dev.michey.somnium.controller;

import dev.michey.somnium.gui.component.basic.SomniumComponent;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class SomniumController {

    private AtomicLong currentComponentId;

    private HashMap<String, SomniumComponent> componentMap;

    public SomniumController() {
        currentComponentId = new AtomicLong();
        componentMap = new HashMap<>();
    }

    public long generateComponentId() {
        return currentComponentId.getAndIncrement();
    }

    public void registerComponent(SomniumComponent somniumComponent) {
        componentMap.put(somniumComponent.getSomniumComponentName(), somniumComponent);
    }

    public void updateComponent(SomniumComponent somniumComponent, String oldKey) {
        componentMap.remove(oldKey);
        registerComponent(somniumComponent);
    }

}
