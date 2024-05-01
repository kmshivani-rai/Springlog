package Javaproject.example.Newjava.Birthday;


import javax.swing.*;
import java.awt.*;
import java.awt.HeadlessException;

public class BirthDayc extends JFrame {
    public BirthDayc() {
        // Set up the frame
        setTitle("Happy Birthday!");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Load an image
        ImageIcon cakeIcon = new ImageIcon("C:\\Users\\admin\\Downloads\\bith\\birthadayiage.png");
        JLabel cakeLabel = new JLabel(cakeIcon);

        // Add the image to the frame
        add(cakeLabel, BorderLayout.CENTER);

        // Add a birthday message
        JLabel messageLabel = new JLabel("Happy Birthday!", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(messageLabel, BorderLayout.SOUTH);
        System.setProperty("java.awt.headless", "true");

    }

   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BirthDayc().setVisible(true);
        });
    }*/
}
