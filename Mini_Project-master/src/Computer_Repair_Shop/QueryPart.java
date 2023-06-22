package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QueryPart extends JFrame{
    private JTextField QueryPart;
    private JButton backButton;
    private JButton submitButton;
    private JPanel QueryPartPanel;

    public QueryPart() {

        setContentPane(QueryPartPanel);
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
                String QueryPartAsString = QueryPart.getText();
                int RandomNumber = (int)(Math.random() * 101);
                if (QueryPartAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Part ID cannot be empty", "Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"There is " + RandomNumber + " of Part ID " + QueryPartAsString + " available for use");
                    new QueryPart();
                    setVisible(false);
                }
             }
        });
    }
}
