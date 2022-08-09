import render.frames.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, 1200, 800);
//        jPanel.setBackground();

        JLabel text = new JLabel("Hello World!");
        text.setFont(new Font("consolas", Font.PLAIN, 20));
        text.setBounds(50, 50, 600, 30);
        text.setForeground(Color.BLACK);
        jPanel.add(text);

        frame.add(jPanel);
        frame.setVisible(true);

        new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
            while(true) {
                text.setText("Hello World! current time: " + sdf.format(System.currentTimeMillis()));
            }
        }).start();
    }
}