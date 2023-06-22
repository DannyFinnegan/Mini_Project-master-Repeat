package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends JFrame {

    private JButton revenueAnalysisButton;
    private JButton partAnalysisButton;
    private JPanel AdminMenuPanel;
    private JButton backButton;

    public AdminMenu() {
        setContentPane(AdminMenuPanel);
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
        revenueAnalysisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new YearlyRevnueAnalysis();
                setVisible(false);
            }
        });
        partAnalysisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new YearlyPartAnalysis();
                setVisible(false);
            }
        });
    }
}
