package render.frames;

import service.system.Environment;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("League of Legends - 2D");
        setSize(Environment.RESOLUTION_1280_720);
        setLayout(null);
//        setUndecorated(true);
        setVisible(true);
    }
}