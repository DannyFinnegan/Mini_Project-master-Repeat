package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepairMenu extends JFrame{
    private JPanel RepairMenuPanel;
    private JButton logRepairButton;
    private JButton estimateRepairButton;
    private JButton confirmRepairButton;
    private JButton completeRepairButton;
    private JButton returnRepairButton;
    private JButton backButton;

    public RepairMenu() {

        setContentPane(RepairMenuPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                setVisible(false);
            }
        });

        logRepairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RepairStore repairStore = new RepairStore();
                new LogRepair(repairStore);
                setVisible(false);
            }
        });

        estimateRepairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EstimateRepair();
                setVisible(false);
            }
        });
        confirmRepairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConfirmRepair();
                setVisible(false);
            }
        });
        completeRepairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CompleteRepair();
                setVisible(false);
            }
        });
        returnRepairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReturnRepair();
                setVisible(false);
            }
        });
    }
}

