package TshirtsGUIP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TShirtGUI extends JFrame {
    private JPanel mainPanel;
    private JComboBox sizeComboBox;
    private JLabel selectedSizeLabel;
    private JComboBox<String> colorComboBox;
    private JLabel selectedColorLabel;

    TShirtGUI(){

        sizeComboBox.addItem("Extra Small");
        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");
        sizeComboBox.addItem("Extra Large");

        String[] colors = {"Purple","Green","White"};
        DefaultComboBoxModel<String> colorModel = new DefaultComboBoxModel<>(colors);
        colorComboBox.setModel(colorModel);


        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300,150));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        selectedSizeLabel.setText((String) sizeComboBox.getSelectedItem());

        sizeComboBox.addActionListener(event -> {
           String selectedSize = (String) sizeComboBox.getSelectedItem();
           selectedSizeLabel.setText("You selected "+ selectedSize);
        });

        // don't need the {} if it's just one short line of code in listener
        colorComboBox.addActionListener(event -> {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            selectedColorLabel.setText("You selected "+ selectedColor);
        });
    }
}
