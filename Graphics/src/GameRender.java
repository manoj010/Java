import javax.swing.*;
public class GameRender {
    JFrame frame = new JFrame();
    Box box = new Box();
    GameRender() {
        frame.add(box);
        frame.setSize(400, 700);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

}
