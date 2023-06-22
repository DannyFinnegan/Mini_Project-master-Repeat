package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompleteRepair extends JFrame{
    private JButton backButton;
    private JTextField CustomerEmailText;
    private JLabel CustomerEmail;
    private JLabel RepairComplete;
    private JTextField RepairCompleteText;
    private JButton submitButton;
    private JPanel ConfirmRepairPanel;

    public CompleteRepair() {
        setContentPane(ConfirmRepairPanel);
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
                String CustomerEmailAsString = CustomerEmailText.getText();
                String RepairCompleteAsString = RepairCompleteText.getText().toLowerCase();
                if (CustomerEmailAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Email Cannot Be Null","Error",JOptionPane.ERROR_MESSAGE);
                    if (!(CustomerEmailAsString.endsWith("@gmail.com") || CustomerEmailAsString.endsWith(".ie")||CustomerEmailAsString.endsWith("@hotmail.com")))
                    {
                        JOptionPane.showMessageDialog(null,"Email must end with @gmail.com, @hotmail.com, or .ie","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (RepairCompleteAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Repair complete cannot Be Null","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    if (RepairCompleteAsString.charAt(0)=='y')
                    {
                        JOptionPane.showMessageDialog(null,"Repair has been marked as complete and the customer has been notified","Success",JOptionPane.INFORMATION_MESSAGE);
                        new CompleteRepair();
                        setVisible(false);
                    }
                    if (RepairCompleteAsString.charAt(0)=='n')
                    {
                        JOptionPane.showMessageDialog(null,"Repair must be completed before the customer can be notified", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (!(RepairCompleteAsString.charAt(0) =='y') || !(RepairCompleteAsString.charAt(0) =='n'))
                    {
                        JOptionPane.showMessageDialog(null,"Answer is not valid, Please use Yes/No", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                }
            }
        });
    }
}
