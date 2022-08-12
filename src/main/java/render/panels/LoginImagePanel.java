package render.panels;

import javax.swing.*;
import java.awt.*;

public class LoginImagePanel extends JPanel {

    public LoginImagePanel() {
        setSize(880, 720);
        setLocation(400, 0);
        setVisible(true);
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 사진출처 : http://news.tf.co.kr/read/economy/1765779.html
        ImageIcon image = new ImageIcon("/Users/leejaeyun/Desktop/akali.jpeg");
        g.drawImage(image.getImage(), 0, 0, 880, 720, null);
    }
}
