import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton add = new JButton("Add");
    JButton sub = new JButton("Sub");

    void renderForm() {
        t1.setBounds(10, 10, 100, 30);
        t2.setBounds(10, 40, 100, 30);
        t3.setBounds(10, 70, 100, 30);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);

        add.setBounds(10, 100, 100, 30);
        add.addActionListener(this);
        add.setFocusable(false);
        frame.add(add);

        sub.setBounds(10, 140, 100, 30);
        sub.addActionListener(this);
        sub.setFocusable(false);
        frame.add(sub);
    };
    void render() {
        renderForm();
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        if(e.getSource() == add) {
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum));
        } else {
            int sub = num1 - num2;
            t3.setText(String.valueOf(sub));
        }
    }
}
