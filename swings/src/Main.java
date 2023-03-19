import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");

        //button
        JButton button = new JButton("Click me!");

        button.setBounds(150,250, 100, 50);
        frame.add(button);

        //Jlabel
        JLabel label = new JLabel("Boomer!!!");
        label.setBounds(150,10, 100, 50);
        frame.add(label);

        frame.setSize(400, 400);
        // layout manager
        frame.setLayout(null);
        frame.setVisible(true);
    }
}