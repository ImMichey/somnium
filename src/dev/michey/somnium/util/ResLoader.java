package dev.michey.somnium.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class ResLoader {

    public static BufferedImage getStaticImage(String path) {
        try {
            return ImageIO.read(new FileInputStream("res/" + path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
