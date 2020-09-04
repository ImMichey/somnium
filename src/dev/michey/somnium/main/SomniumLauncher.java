package dev.michey.somnium.main;

import dev.michey.somnium.gui.builder.SomniumWindowBuilder;
import dev.michey.somnium.gui.component.panel.SomniumPanel;
import dev.michey.somnium.gui.window.SomniumWindow;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumLauncher {

    public static void main(String[] args) {
        System.out.println("--=={ Running [" + SOMNIUM_NAME + " v" + SOMNIUM_VERSION + " • b" + SOMNIUM_BUILD + "] }==--");

        // Approach with builder
        SomniumWindow window = new SomniumWindow();
        window.setDraggable();

        SomniumPanel panel = new SomniumPanel();
        panel.setDraggable();

        window.addSomniumComponent(panel);
        window.show();
    }

}
