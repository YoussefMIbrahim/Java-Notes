package MovieRatingGUI;

import jdk.jfr.StackTrace;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieRating extends JFrame {
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    MovieRating(){
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandles();

    }

    private void configureEventHandles() {

        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider.getValue() + "Stars";
                sliderValueLabel.setText(valueLabelText);
                updatedOpinion();
            }
        });

        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updatedOpinion();
            }

        });

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updatedOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e){
                updatedOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e){}


        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void updatedOpinion(){
        String title = movieTitleTextField.getText();

        if(title.trim().length() == 0){
            movieOpinionLabel.setText("Enter a movie title");
        }else{
            int rating = ratingSlider.getValue();

            boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

            String template = "you rated %s %d stars. You %s see %s again";

            String seeAgainStr = seeAgain ? "Would" : "would not";

            String opinion = String.format(template,title,rating,seeAgainStr,title);

            movieOpinionLabel.setText(opinion);

        }

    }
}
