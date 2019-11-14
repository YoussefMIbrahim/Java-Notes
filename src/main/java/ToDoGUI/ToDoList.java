package ToDoGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ToDoList extends JFrame {
    private JPanel rootPanel;
    private JTextField newToDoTextField;
    private JButton addToDoButton;
    private JList<String> toDoList;
    private JButton deleteSelectedButton;

    private DefaultListModel<String> listModel;

    ToDoList(){
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        getRootPane().setDefaultButton(addToDoButton);

        listModel = new DefaultListModel<>();

        toDoList.setModel(listModel);

        toDoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addListeners();

        pack();
        setVisible(true);


    }

    private void addListeners() {

        addToDoButton.addActionListener(e -> {
            String newToDo = newToDoTextField.getText();
            newToDo = newToDo.trim();

            if (newToDo.isEmpty()){
                JOptionPane.showMessageDialog(ToDoList.this,"Enter a to do item.");
            }else {
                listModel.addElement(newToDo);
                newToDoTextField.setText("");
            }
        });

        deleteSelectedButton.addActionListener(e -> {
            int selectedIndex = toDoList.getSelectedIndex();
            if(selectedIndex != -1){
                listModel.remove(selectedIndex);
            }
        });

        JPopupMenu rightClickMenu = new JPopupMenu();
        JMenuItem deleteMenuItem = new JMenuItem("Delete");
        rightClickMenu.add(deleteMenuItem);

        deleteMenuItem.addActionListener(e -> {
            deleteSelected();
        });

        toDoList.setComponentPopupMenu(rightClickMenu);


        toDoList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selection =  toDoList.locationToIndex(e.getPoint());
                toDoList.setSelectedIndex(selection);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void deleteSelected() {
        int selectedIndex = toDoList.getSelectedIndex();

        if (selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Select an item to delete");
        }else {
            String deleteItem = toDoList.getSelectedValue();
            if (JOptionPane.showConfirmDialog(this,"Delete "+ deleteItem + "?","Delete",JOptionPane.OK_CANCEL_OPTION)
            == JOptionPane.OK_OPTION){
                listModel.remove(selectedIndex);
            }
        }
    }


}
