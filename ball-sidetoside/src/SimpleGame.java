import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGame extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton startButton;
    private Timer timer;
    private int x, y;
    private int vx, vy;
    private final int BALL_SIZE = 50;

    public SimpleGame() {
        setTitle("Simple Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        panel = new JPanel();
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        panel.add(startButton);
        getContentPane().add(panel, BorderLayout.SOUTH);
        x = 50;
        y = 50;
        vx = 5;
        vy = 5;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            timer = new Timer(100, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    x += vx;
                    y += vy;
                    if (x < 0 || x > getWidth() - BALL_SIZE) {
                        vx = -vx;
                        x = (int) Math.max(0, Math.min(getWidth() - BALL_SIZE, x));
                    }
                    if (y < 0 || y > getHeight() - BALL_SIZE) {
                        vy = -vy;
                        y = (int) Math.max(0, Math.min(getHeight() - BALL_SIZE, y));
                    }
                    repaint();
                }
            });
            timer.start();
        }
    }

    public static void main(String[] args) {
        SimpleGame game = new SimpleGame();
        game.setVisible(true);
    }

}
