import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener {
    int x = 150;
    JButton right = new JButton("Move Right!!!");
    JButton left = new JButton("Move Left!!!");

    Box() {
        left.addActionListener(this);
        add(left);

        right.addActionListener(this);
        add(right);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(x, 200, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == right) {
            this.x += 5;
            this.repaint();
        }
        if (e.getSource() == left) {
            this.x -= 5;
            this.repaint();
        }
    }
}
