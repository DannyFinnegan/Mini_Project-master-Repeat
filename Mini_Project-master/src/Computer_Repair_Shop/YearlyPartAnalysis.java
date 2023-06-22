package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YearlyPartAnalysis extends JFrame {
    private JPanel YearlyPartAnalysisPanel;
    private JButton backButton;
    private JLabel Year;
    private JLabel PartsBought;
    private JLabel PartsUsed;
    private JLabel Remaining;
    private JLabel Year1;
    private JLabel Year5;
    private JLabel Parts5;
    private JLabel Used5;
    private JLabel Year4;
    private JLabel Year3;
    private JLabel Year2;
    private JLabel Parts1;
    private JLabel Parts2;
    private JLabel Parts3;
    private JLabel Parts4;
    private JLabel Used1;
    private JLabel Used2;
    private JLabel Remaining1;
    private JLabel Remaining2;
    private JLabel Used3;
    private JLabel Remaining3;
    private JLabel Used4;
    private JLabel Remaining4;
    private JLabel Remaining5;

    public YearlyPartAnalysis()
    {
        setContentPane(YearlyPartAnalysisPanel);
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
