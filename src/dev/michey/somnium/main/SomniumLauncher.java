package dev.michey.somnium.main;

import dev.michey.somnium.gui.builder.SomniumWindowBuilder;
import dev.michey.somnium.gui.window.SomniumWindow;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumLauncher {

    public static void main(String[] args) {
        System.out.println("--=={ Running [" + SOMNIUM_NAME + " v" + SOMNIUM_VERSION + " • b" + SOMNIUM_BUILD + "] }==--");

        // Approach with builder
        SomniumWindow somniumWindow = new SomniumWindowBuilder()
                .setDraggable()
                .hideWindowButtons()
                .build();
        somniumWindow.show();
    }

}
