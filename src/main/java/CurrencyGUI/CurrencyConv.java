package CurrencyGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CurrencyConv extends JFrame {
    private JTextField dollarsTextField;
    private JPanel mainPanel;
    private JButton convertButton;
    private JLabel eurosResultTable;
    private JComboBox currencyComboBox;

    private double dollarsToEurosRate = .84;
    private double dollarsToPounds = .74;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private HashMap<String,Double> exchangeRates = new HashMap<>();


    CurrencyConv(){
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        exchangeRates.put(EUROS,dollarsToEurosRate);
        exchangeRates.put(POUNDS,dollarsToPounds);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dollarString = dollarsTextField.getText();
                try {

                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();


                    double exchangeRate = exchangeRates.get(toCurrency);

                    double converted = dollars * exchangeRate;

                    String resultString = String.format("%.2f dollars is equivilant to %.2f %s", dollars, converted,toCurrency);
                    eurosResultTable.setText(resultString);
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConv.this,
                            "Please enter a number without any symbols or other characters ");
                }
            }
        });
    }
}


