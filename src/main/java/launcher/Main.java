package launcher;

import gui.Frame;
import gui.Image;

/**
 * @author udayhegde
 * @Date 18/06/23
 */
public class Main {

    public static void main(String[] args) {
     init();
    }

    public static void init() {
        Image image = new Image();
        Frame frame = new Frame(image);
        frame.getJFrame();
    }


}
