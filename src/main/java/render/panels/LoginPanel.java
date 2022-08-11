package render.panels;

import service.system.Environment;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private JLabel idLabel = new JLabel("아이디");
    private JLabel pwLabel = new JLabel("패스워드");
    private JTextField idText = new JTextField();
    private JPasswordField pwText = new JPasswordField();
    private JButton loginBtn = new JButton("로그인");
    private JButton registerBtn = new JButton("회원가입");

    // 생성자
    public LoginPanel() {
        setLayout(null);
        setLocation(0, 0);
        setSize(Environment.RESOLUTION_1280_720);
        setVisible(true);
        setBackground(Color.WHITE);

        // location = (x, y) = 좌표 (좌상단 - 11시)
        // dimension = (w, h) = 너비 & 높이 = 크기
        // rectangle = location + dimension = (x, y, w, h)
        idLabel.setBounds(50, 215, 100, 25);
        pwLabel.setBounds(50, 325, 100, 25);
        idText.setBounds(50, 250, 300, 50);
        pwText.setBounds(50, 335, 300, 50);
        loginBtn.setBounds(50, 410, 100, 20);
        registerBtn.setBounds(175, 410, 100, 20);

        idText.

        // add component for render
        add(idLabel);
        add(pwLabel);
        add(idText);
        add(pwText);
        add(loginBtn);
        add(registerBtn);
    }

    // 그리는 부분
    @Override
    protected void paintComponent(Graphics gp) {
        super.paintComponent(gp);
        Graphics2D g = (Graphics2D)gp;
    }
}
