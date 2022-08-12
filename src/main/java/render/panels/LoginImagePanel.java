package render.panels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

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
        URL url = getClass().getClassLoader().getResource("images/akali.jpeg");
        ImageIcon image = null;
        try {
            image = new ImageIcon(ImageIO.read(url));
            g.drawImage(image.getImage(), 0, 0, 880, 720, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}