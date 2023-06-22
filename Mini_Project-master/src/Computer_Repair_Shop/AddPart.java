package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPart extends JFrame {
    private JPanel AddPartPanel;
    private JTextField PartPrice;
    private JTextField PartDescription;
    private JButton backButton;
    private JTextField PartName;
    private JButton submitButton;
    private JTextField textField1;
    private static int Counter = 0;

    public AddPart()
    {
        setContentPane(AddPartPanel);
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
                String PartPriceAsString = PartPrice.getText();
                String PartNameAsString = PartName.getText();
                String PartDescriptionAsString = PartDescription.getText();
                if (PartNameAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Part Must Have a Name", "Error",JOptionPane.ERROR_MESSAGE);
                }
                if (PartPriceAsString.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Part must have a price", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!PartPriceAsString.isEmpty()) {
                    if (!(PartPriceAsString.charAt(0) == '€')) {
                        JOptionPane.showMessageDialog(null, "Price must begin with a € Symbol", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (PartDescriptionAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Part Must Have a Description", "Error",JOptionPane.ERROR_MESSAGE);
                }
                if (!PartNameAsString.isEmpty() && !PartPriceAsString.isEmpty() && PartPriceAsString.charAt(0) == '€' && !PartDescriptionAsString.isEmpty())
                {
                    Counter++;
                    JOptionPane.showMessageDialog(null, "Part Has Been added to the database"+"\nThe part Details are: "+"\n"+"Part Name: "+PartNameAsString+"\n"+"Part Price: "+PartPriceAsString+"\n"+"Part Description: "+PartDescriptionAsString +"\nPart ID: "+ Counter, "Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    new AddPart();
                }
            }
        });
    }
}
