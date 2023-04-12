import javax.swing.*;
import java.awt.*;

public class Counter {
    JFrame frame = new JFrame("Counter");
    JLabel counterLabel;
    int counterValue;

    Counter() {
        JButton btn_increase = new JButton("Increase");
        JButton btn_decrease = new JButton("Decrease");

        counterValue = 1;
        counterLabel = new JLabel("" + counterValue, JLabel.CENTER);
        frame.add(counterLabel, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.add(btn_decrease);
        panel.add(btn_increase);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
