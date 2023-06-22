package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstimateRepair extends JFrame{
    private JPanel EstimateRepairPanel;
    private JButton backButton;
    private JTextField RepairIDText;
    private JTextField RepairCostText;
    private JLabel RepairID;
    private JLabel RepairCost;
    private JTextField EngineerNameText;
    private JLabel EngineerName;
    private JButton submitButton;

    public EstimateRepair()
    {
        setContentPane(EstimateRepairPanel);
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
                String RepairCostAsString = RepairCostText.getText();
                String EngineerNameAsString = EngineerNameText.getText();
                String RepairIDAsString = RepairIDText.getText();

                if (RepairIDAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Repair ID cannot be null", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!RepairCostAsString.isEmpty()) {
                    if (!(RepairCostAsString.charAt(0) == '€')) {
                        JOptionPane.showMessageDialog(null, "Cost must begin with a € Symbol", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (RepairCostAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Repair cost cannot be null", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (EngineerNameAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Engineer name cannot be null", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (!RepairIDAsString.isEmpty() && !RepairCostAsString.isEmpty() && RepairCostAsString.charAt(0) == '€' && !EngineerNameAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Repair has been updated and a price has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    new EstimateRepair();
                    setVisible(false);
                }
            }
        });
    }
}
