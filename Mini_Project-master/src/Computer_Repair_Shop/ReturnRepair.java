package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnRepair extends JFrame {
    private JPanel ReturnRepairPanel;
    private JButton backButton;
    private JTextField ReturnedRepairText;
    private JButton submitButton;
    private JLabel RepairCollected;

    public ReturnRepair()
    {
        setContentPane(ReturnRepairPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RepairMenu();
                setVisible(false);
            }
        });


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  ReturnedRepairAsString = ReturnedRepairText.getText().toLowerCase();

                if (ReturnedRepairAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Returned repair cannot be null", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    if (ReturnedRepairAsString.charAt(0)=='y')
                    {
                        JOptionPane.showMessageDialog(null, "The repair has been returned and has been marked so in the database", "Success",JOptionPane.INFORMATION_MESSAGE);
                        new ReturnRepair();
                        setVisible(false);
                    }
                    if (ReturnedRepairAsString.charAt(0)=='n')
                    {
                        JOptionPane.showMessageDialog(null, "The repair cannot be marked as returned until the device is returned to the customer", "Error",JOptionPane.INFORMATION_MESSAGE);

                    }
                }

            }
        });
    }
}
