package dev.michey.somnium.main;

import dev.michey.somnium.gui.builder.SomniumWindowBuilder;
import dev.michey.somnium.gui.window.SomniumWindow;

import static dev.michey.somnium.constants.SomniumConstants.*;

public class SomniumLauncher {

    public static void main(String[] args) {
        System.out.println("--=={ Running [" + SOMNIUM_NAME + " v" + SOMNIUM_VERSION + " • b" + SOMNIUM_BUILD + "] }==--");

        // Approach #1
        SomniumWindow somniumWindow = new SomniumWindow(640, 480, "Debug Somnium Window");
        somniumWindow.show();

        // Approach #2
        SomniumWindow somniumWindow2 = new SomniumWindowBuilder()
                .withSize(640, 480)
                .withTitle("Debug Somnium Window 2")
                .build();
        somniumWindow2.show();
    }

}
