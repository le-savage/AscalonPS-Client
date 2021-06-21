package com.janus;

import java.awt.*;
import java.net.URL;
import java.util.HashMap;

/**
 * This class grabs resources from the 'images' folder in the res package.
 *
 * @author Gabriel Hannason
 */
public class ResourceLoader {

    private static final HashMap<String, Image> loadedImages = new HashMap<String, Image>();

    public Image getImage(String imageName) {
        if (loadedImages.containsKey(imageName))
            return loadedImages.get(imageName);
        Image img = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + "" + imageName + ".png");

        if (img != null)
            loadedImages.put(imageName, img);
        return img;
    }

    static ResourceLoader rl = new ResourceLoader();

    public static Image loadImage(String imageName) {
        URL url = rl.getClass().getResource("images/" + imageName);

        if (url == null) {
            System.out.println(imageName);
            return null;
        }
        return Toolkit.getDefaultToolkit().getImage(url);
    }

}
