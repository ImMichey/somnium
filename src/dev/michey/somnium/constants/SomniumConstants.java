package dev.michey.somnium.constants;

import dev.michey.somnium.gui.color.ColorPage;

public class SomniumConstants {

    /* Version Constants */
    public static final String SOMNIUM_NAME = "Somnium";
    public static final String SOMNIUM_VERSION = "1.0.0";
    public static final int SOMNIUM_BUILD = 1;

    /* Window Constants */
    public static final String WINDOW_DEFAULT_TITLE = "Somnium Window";
    public static final int WINDOW_DEFAULT_WIDTH = 800;
    public static final int WINDOW_DEFAULT_HEIGHT = 600;

    /* Color Constants */
    public static ColorPage COLOR_PAGE_DARK;
    public static final String COLOR_PAGE_KEY_BACKGROUND = "bg";

    static {
        COLOR_PAGE_DARK = new ColorPage();
        COLOR_PAGE_DARK.index(COLOR_PAGE_KEY_BACKGROUND, "#161616");
    }

}
