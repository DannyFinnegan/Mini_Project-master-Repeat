package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PartsMenu extends JFrame{
    private JButton addPartButton;
    private JButton deletePartButton;
    private JButton updatePartButton;
    private JButton queryPartButton;
    private JLabel Welcome;
    private JPanel PartsPanel;
    private JButton backButton;

    public PartsMenu()
    {
        setContentPane(PartsPanel);
        setSize(900,600);
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
        addPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddPart();
                setVisible(false);
            }
        });
        deletePartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeletePart();
                setVisible(false);
            }
        });
        queryPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QueryPart();
                setVisible(false);
            }
        });
        updatePartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdatePart();
                setVisible(false);
            }
        });
    }
}
