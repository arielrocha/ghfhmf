package panels1;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import Panels2.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(800, 800);
        setTitle("Empty Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
}