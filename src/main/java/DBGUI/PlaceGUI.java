package DBGUI;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PlaceGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField placeNameText;
    private JTextField elevationText;
    private JButton addButton;
    private JList placeList;
    private JButton deleteButton;

    private Controller controller;

    private DefaultListModel<Place> allPlacesListModel;

    PlaceGUI(Controller controller){

        this.controller = controller;

        allPlacesListModel = new DefaultListModel<>();
        placeList.setModel(allPlacesListModel);

        addListeners();

        setPreferredSize(new Dimension(500,500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }

    void setListData(List<Place> data){

        allPlacesListModel.clear();

        if (data != null){
            for (Place place :data){
                allPlacesListModel.addElement(place);
            }
        }
    }
    private void addListeners() {
        addButton.addActionListener(e -> {
            String place = placeNameText.getText();

            if (place.isEmpty()){
                errorDialog("Enter place name");
                return;
            }
            double elev;

            try{
                elev = Double.parseDouble(elevationText.getText());
            }catch (NumberFormatException nfe){
                errorDialog("Enter a number of elevation");
                return;
            }

            Place placeRecord = new Place(place,elev);
            String result = controller.addPlaceToDatabase(placeRecord);

            if (result.equals(PlaceDB.OK)){
                placeNameText.setText("");
                elevationText.setText("");

                List<Place> allData = controller.getAllData();
                setListData(allData);
            }else {
                errorDialog(result);
            }
        });
    }

    private void errorDialog(String msg){
        JOptionPane.showMessageDialog(PlaceGUI.this,msg,"Error",JOptionPane.ERROR_MESSAGE);
    }

}
