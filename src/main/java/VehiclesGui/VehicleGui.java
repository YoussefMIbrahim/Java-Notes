package VehiclesGui;

import javax.swing.*;
import java.awt.*;

public class VehicleGui extends JFrame {
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField makeTextField;
    private JTextField modelTextField;
    private JCheckBox electricCheckBox;
    private JButton addButton;

    VehicleGui (){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(600,600));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
