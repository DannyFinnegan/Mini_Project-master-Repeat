package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletePart extends JFrame {
    private JButton backButton;
    private JTextField DeletePartID;
    private JButton submitButton;
    private JPanel DeletePartPanel;

    public DeletePart() {
        setContentPane(DeletePartPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PartsMenu();
                setVisible(false);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String DeletePartIDAsString = DeletePartID.getText();
                if (DeletePartIDAsString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Part ID Cannot be Empty", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int Response = JOptionPane.showConfirmDialog(null, "Are you sure you wish to delete this part from the database? \nThis Action cannot be Undone", "Are You Sure?",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                     if (Response==0)
                     {
                         JOptionPane.showMessageDialog(null, "Part has been removed","Success",JOptionPane.INFORMATION_MESSAGE);
                         new DeletePart();
                         setVisible(false);
                     }
                     if (Response==1)
                     {
                         JOptionPane.showMessageDialog(null,"Actions has not been Completed", "",JOptionPane.INFORMATION_MESSAGE );
                     }
                }
            }
        });
    }
}
