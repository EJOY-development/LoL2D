package render.frames;

import render.panels.LoginImagePanel;
import render.panels.LoginPanel;
import service.system.Environment;

import javax.swing.*;
import java.awt.*;

public class LogFrame extends JFrame{

    public LogFrame() {
        setTitle("League of Legends - 2D");
        setSize(Environment.RESOLUTION_1280_720);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        LoginPanel loginpanel = new LoginPanel();
        LoginImagePanel loginimagepanel = new LoginImagePanel();
        add(loginpanel);
        add(loginimagepanel);
    }
}
