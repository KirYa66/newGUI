import javax.swing.*;
import java.awt.*;

public class Jframe1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Empty");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panelA.setSize(200,200);
        JButton button = new JButton("click me");
        JButton button2 = new JButton("click me2");
        JButton button3 = new JButton("click me3");
        button.setSize(60,20);
        JCheckBox ch = new JCheckBox("выбери меня!");
        JTextField tx = new JTextField("это текстовое поле");
        panelA.add(BorderLayout.NORTH,button);
        panelA.add(BorderLayout.CENTER,ch);
        panelA.add(BorderLayout.SOUTH,tx);
        panelB.add(BorderLayout.EAST,panelA);
        frame.add(panelB);
        frame.add(BorderLayout.WEST,button2);
        frame.add(BorderLayout.EAST,button3);
        frame.setSize(400,300);
        frame.setVisible(true);

    }

}
