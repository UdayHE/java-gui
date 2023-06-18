package gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author udayhegde
 * @Date 18/06/23
 */
public class Frame {

    private Image image;

    public Frame(Image image) {
        this.image = image;
    }

    public JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("JFrame");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.GRAY);
        jFrame.setIconImage(image.getImageIcon().getImage());
        return jFrame;
    }
}
