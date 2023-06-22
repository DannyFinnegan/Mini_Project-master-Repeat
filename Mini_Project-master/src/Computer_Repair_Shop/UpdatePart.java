package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePart extends JFrame {
    private JPanel UpdatePartPanel;
    private JButton backButton;
    private JTextField PartName;
    private JTextField PartPrice;
    private JTextField PartDescription;
    private JTextField PartID;
    private JButton submitButton;

    public UpdatePart() {
        setContentPane(UpdatePartPanel);
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
                String PartIDAsString = PartID.getText();
                if (PartIDAsString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Part ID Cannot be Null", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (PartNameAsString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Part Must Have a Name", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (PartPriceAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Part Must Have a Price", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!PartPriceAsString.isEmpty()) {
                    if (!(PartPriceAsString.charAt(0) == '€')) {
                        JOptionPane.showMessageDialog(null, "Price must begin with a € Symbol", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (PartDescriptionAsString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Part Must Have a Description", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!PartIDAsString.isEmpty() && !PartNameAsString.isEmpty() && !PartDescriptionAsString.isEmpty() && !PartPriceAsString.isEmpty() && PartPriceAsString.charAt(0) == '€') {
                    JOptionPane.showMessageDialog(null, "Part Has Been updated to the database" + "\nThe part Details are: " + "\n" + "Part Name: " + PartNameAsString + "\n" + "Part Price: " + PartPriceAsString + "\n" + "Part Description: " + PartDescriptionAsString + "\nPart ID: " + PartIDAsString, "Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    new AddPart();
                }
            }
        });
    }
}
