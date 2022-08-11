package render.panels;

import service.system.Environment;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel {
    private JLabel idLabel = new JLabel("아이디");
    private JLabel pwLabel = new JLabel("패스워드");
    private JLabel pwReLabel = new JLabel("패스워드 확인");
    private JTextField idText = new JTextField();
    private JPasswordField pwText = new JPasswordField();
    private JPasswordField pwReText = new JPasswordField();
    private JButton confirmBtn = new JButton("회원등록");
    private JButton clearBtn = new JButton("초기화");

    // 생성자
    public RegisterPanel() {
        setLayout(null);
        setLocation(0, 0);
        setSize(Environment.RESOLUTION_1280_720);
        setVisible(true);
        setBackground(Color.WHITE);

        // location = (x, y) = 좌표 (좌상단 - 11시)
        // dimension = (w, h) = 너비 & 높이 = 크기
        // rectangle = location + dimension = (x, y, w, h)
        idLabel.setBounds(53, 160, 100, 25);
        idText.setBounds(50, 180, 300, 50);
        pwLabel.setBounds(53, 250, 100, 25);
        pwText.setBounds(50, 270, 300, 50);
        pwReLabel.setBounds(53, 340, 100, 25);
        pwReText.setBounds(50, 360, 300, 50);
        confirmBtn.setBounds(54, 430, 100, 20);
        clearBtn.setBounds(175, 430, 100, 20);

        // add component for render
        add(idLabel);
        add(pwLabel);
        add(pwReLabel);
        add(idText);
        add(pwText);
        add(pwReText);
        add(confirmBtn);
        add(clearBtn);
    }

    // 그리는 부분
    @Override
    protected void paintComponent(Graphics gp) {
        super.paintComponent(gp);
        Graphics2D g = (Graphics2D)gp;
    }
}
