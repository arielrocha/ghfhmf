package panels1;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanEnt extends JPanel {

    PanDisp panDisp;
    String sWord;
    public static JTextField txtName = new JTextField(10);
    public static JButton btnName = new JButton("Name");

    public PanEnt(PanDisp _panDisp) {
        add(txtName);
        panDisp = _panDisp;
        JButton btn3;
        btn3 = new JButton("Name");
        add(btn3);
        ActionListener labelChangeListener = new LabelChangeListener();
        btn3.addActionListener((ActionListener) labelChangeListener);
        //ClickTestListener clickTestListener = new ClickTestListener();
        //btnName.addActionListener((ActionListener) clickTestListener);
    }

    class LabelChangeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton btn = (JButton) event.getSource();
            sWord = btn.getText(); // gets the text value of the button
            panDisp.UpdateLabel(sWord);
        }

    }

}
