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
        setSize(400, 720);
        setVisible(true);
        setBackground(Color.WHITE);


        // location = (x, y) = 좌표 (좌상단 - 11시)
        // dimension = (w, h) = 너비 & 높이 = 크기
        // rectangle = location + dimension = (x, y, w, h)
        idLabel.setBounds(53, 160, 100, 25);
        idText.setBounds(50, 180, 300, 50);
        pwLabel.setBounds(53, 250, 100, 25);
        pwText.setBounds(50, 270, 300, 50);
        loginBtn.setBounds(54, 340, 100, 20);
        registerBtn.setBounds(175, 340, 100, 20);

        // add component for render
        add(idLabel);
        add(pwLabel);
        add(idText);
        add(pwText);
        add(loginBtn);
        add(registerBtn);
    }
}
