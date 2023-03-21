import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setSize(400, 400);

        //jbutton1
        JButton button = new JButton("Eye");
        button.setBounds(50, 40, 100 ,100);
        button.setBackground(Color.pink);
        button.setForeground(Color.white);
        frame.add(button);

        //jbutton2
        JButton button2 = new JButton("Eye");
        button2.setBounds(230, 40, 100 ,100);
        button2.setBackground(Color.pink);
        button2.setForeground(Color.white);
        frame.add(button2);

        //jbutton3
        JButton button3 = new JButton("Nose");
        button3.setBounds(140, 160, 100 ,50);
        button3.setBackground(Color.pink);
        button3.setForeground(Color.white);
        frame.add(button3);

        //jbutton5
        JButton button4 = new JButton("Mouth");
        button4.setBounds(90, 230, 200 ,120);
        button4.setBackground(Color.red);
        button4.setForeground(Color.white);

        //jbutton4
        JButton button5 = new JButton("Mouth");
        button5.setBounds(110, 250, 160 ,80);
        button5.setBackground(Color.pink);
        button5.setForeground(Color.white);

        frame.add(button5);
        frame.add(button4);

        //Bgcolor
        frame.getContentPane().setBackground(Color.cyan);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false); // frame resize false
        frame.setVisible(true);
    }
}