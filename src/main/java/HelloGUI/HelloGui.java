package HelloGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGui extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGui(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300,200));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFirstLabel.setText("This is an updated label");
                clickMeButton.setText("click me again coward");
            }
        });
    }
}
