import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        panel.add(button);
        JButton buttonTwo = new JButton("bliss");
        panel.add(buttonTwo);
        JButton buttonThree = new JButton("huh?");
        panel.add(buttonThree);
        //frame.getContentPane().add(BorderLayout.EAST,panel);

        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
