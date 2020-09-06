package dev.michey.somnium.main;

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

        SomniumPanel panel2 = new SomniumPanel();

        SomniumPanel panel3 = new SomniumPanel();
        panel2.addSomniumComponent(panel3);

        SomniumPanel panel4 = new SomniumPanel();

        window.addSomniumComponent(panel);
        window.addSomniumComponent(panel2);
        window.addSomniumComponent(panel4);
        window.show();

        somniumController.printDebugTree();
    }

}
