package dev.michey.somnium.gui.color;

import java.awt.*;
import java.util.HashMap;

public class ColorPage {

    private HashMap<String, Color> colorMap;

    public ColorPage() {
        colorMap = new HashMap<>();
    }

    public void index(String key, String hex) {
        colorMap.put(key, Color.decode(hex));
    }

    public HashMap<String, Color> getColorMap() {
        return colorMap;
    }

}
