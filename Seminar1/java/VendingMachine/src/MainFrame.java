import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    
    
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    
    
    JLabel lbWelcome;

    public void initialize() {
       
        
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
        
        
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

       
        
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        
        
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        
        
        JButton btnOk = new JButton("Ok");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                String firstName = tfFirstName.getText();
                String lastName = tfFirstName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);
                
                
            }

        });

       
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                tfFirstName.setText("");
                tfFirstName.setText("");
                lbWelcome.setText("");
                
            }

        });

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        
        mainPanel.add(formPanel, BorderLayout.NORTH);

        
        mainPanel.add(lbWelcome, BorderLayout.CENTER);

        
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

       
        add(mainPanel);

        
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        
        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arg)
    {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }

}