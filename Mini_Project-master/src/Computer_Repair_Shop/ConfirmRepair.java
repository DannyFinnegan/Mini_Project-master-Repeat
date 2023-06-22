package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmRepair extends JFrame{
    private JPanel ConfirmRepairPanel;
    private JButton backButton;
    private JTextField CustomerEmailText;
    private JLabel CustomerEmail;
    private JButton submitButton;

    public ConfirmRepair()
    {
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
                int RandomNumber = (int)(Math.random() * 3);

                if (CustomerEmailAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Email Cannot Be Null","Error",JOptionPane.ERROR_MESSAGE);
                    if (!(CustomerEmailAsString.endsWith("@gmail.com") || CustomerEmailAsString.endsWith(".ie")||CustomerEmailAsString.endsWith("@hotmail.com")))
                    {
                        JOptionPane.showMessageDialog(null,"Email must end with @gmail.com, @hotmail.com, or .ie","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    if (RandomNumber==1)
                    {
                        JOptionPane.showMessageDialog(null,"The customer has requested the repair be completed","Response",JOptionPane.INFORMATION_MESSAGE);
                        new ConfirmRepair();
                        setVisible(false);
                    }
                    if (RandomNumber==2)
                    {
                        JOptionPane.showMessageDialog(null,"The customer has requested the repair be cancelled","Response",JOptionPane.INFORMATION_MESSAGE);
                        new ConfirmRepair();
                        setVisible(false);
                    }

                }
            }
        });
    }
}
