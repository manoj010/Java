import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI-1");
        String[] arr = {"Apple", "Ball", "Cat", "Dog", "Egg", "Fish"};

        JLabel label = new JLabel("Login Page");
        JTextField username = new JTextField("Enter username");
        JTextField password = new JTextField("Enter password");
        JButton button = new JButton("Login");
        JComboBox<String> comboBox = new JComboBox<>(arr);

        label.setBounds(160, 20, 200, 30);
        username.setBounds(90,60, 200, 30);
        password.setBounds(90,100, 200, 30);
        comboBox.setBounds(90, 140, 200, 30);
        button.setBounds(90, 180, 200, 30);

        frame.add(label);
        frame.add(username);
        frame.add(password);
        frame.add(button);
        frame.add(comboBox);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}