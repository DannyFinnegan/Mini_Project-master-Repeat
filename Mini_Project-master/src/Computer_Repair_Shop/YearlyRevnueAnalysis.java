package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YearlyRevnueAnalysis extends JFrame{
    private JPanel YearlyRevenueAnalysisPanel;
    private JButton backButton;
    private JLabel Year;
    private JLabel TotalIncome;
    private JLabel TotalExpenditure;
    private JLabel TotalProfitLoss;
    private JLabel Year1;
    private JLabel Income1;
    private JLabel Expenditure2;
    private JLabel Profit1;
    private JLabel Year2;
    private JLabel Income2;
    private JLabel Profit2;
    private JLabel Year3;
    private JLabel Income3;
    private JLabel Expenditure3;
    private JLabel Profit3;
    private JLabel Year4;
    private JLabel TotalIncome4;
    private JLabel Year5;
    private JLabel Income5;
    private JLabel Expenditure5;
    private JLabel Profit5;

    public YearlyRevnueAnalysis() {

        setContentPane(YearlyRevenueAnalysisPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminMenu();
                setVisible(false);
            }
        });
    }
}
