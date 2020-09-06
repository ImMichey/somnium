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

    // ╔ ╚ ╠ ═

    public void printDebugTree() {
        System.out.println("Printing Somnium Debug Component Tree...\n");

        for(String key : componentMap.keySet()) {
            SomniumComponent base = componentMap.get(key);

            // It's a parent component
            if(base.getParentComponent() == null) {
                System.out.println("═ " + key + " (ID: " + base.getSomniumComponentId() + ") " + base.getClass().getSimpleName());
                recursiveComponentOutput(base, 1);
            }
        }
    }

    private void recursiveComponentOutput(SomniumComponent component, int tabs) {
        for(SomniumComponent child : component.getChildComponents()) {
            print(child, tabs);

            for(SomniumComponent child2 : child.getChildComponents()) {
                print(child2, tabs + 1);
                recursiveComponentOutput(child2, tabs + 1);
            }
        }
    }

    private void print(SomniumComponent child, int tabs) {
        StringBuilder tabBuilder = new StringBuilder();
        for(int i = 0; i < tabs; i++) {
            tabBuilder.append("   ");
        }

        tabBuilder.append("╚═══");

        tabBuilder.append(" ");

        tabBuilder.append(child.getSomniumComponentName() + " (ID: " + child.getSomniumComponentId() + ") " + child.getClass().getSimpleName());
        System.out.println(tabBuilder.toString());
    }

    public SomniumComponent getSomniumComponentByName(String name) {
        return componentMap.get(name);
    }

}
