package panels2;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import Panels2.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class LayoutViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        PanMain panMain = new PanMain();
        frame.setSize(400, 400);
        frame.setTitle("Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panMain);
        frame.setVisible(true);
    }   
}