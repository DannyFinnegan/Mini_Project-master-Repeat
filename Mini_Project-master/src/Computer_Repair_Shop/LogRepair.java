package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogRepair extends JFrame {
    private static int repID = 1;
    private JPanel LogRepairPanel;
    private JButton backButton;
    private JLabel RepairID;
    private JLabel CustomerEmail;
    private JTextField CustomerEmailText;
    private JLabel RepairDetails;
    private JTextField RepairDetailsText;
    private JButton submitButton;
    private JLabel RepairIDNum;
    private RepairStore repairStore;

    public LogRepair(RepairStore repairStore) {
        this.repairStore = repairStore;

        setContentPane(LogRepairPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        RepairIDNum.setText(String.valueOf(repID));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RepairMenu().setVisible(true);
                setVisible(false);
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CustomerEmailAsString = CustomerEmailText.getText();
                String RepairDetailsAsString = RepairDetailsText.getText();

                if (CustomerEmailAsString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Customer Email Cannot Be Null", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!(CustomerEmailAsString.endsWith("@gmail.com") || CustomerEmailAsString.endsWith(".ie") || CustomerEmailAsString.endsWith("@hotmail.com"))) {
                    JOptionPane.showMessageDialog(null, "Email must end with @gmail.com, @hotmail.com, or .ie", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (RepairDetailsAsString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Repair details cannot be Null", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    repairStore.addRepair(repID, CustomerEmailAsString, RepairDetailsAsString, 0, "L");

                    JOptionPane.showMessageDialog(null, "The repair has been logged and added to the database", "Success", JOptionPane.INFORMATION_MESSAGE);
                    incrementRepID();

                    repairStore.displayRepairs();

                    new LogRepair(repairStore);
                    setVisible(false);
                }
            }
        });
    }

    private void incrementRepID() {
        repID++;
        RepairIDNum.setText(String.valueOf(repID));
    }
}
