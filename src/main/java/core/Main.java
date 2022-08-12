package core;

import network.MessagingQueue;
import render.frames.LogFrame;
import render.frames.MainFrame;
import render.panels.LoginPanel;
import render.panels.RegisterPanel;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        MainFrame mainframe = new MainFrame();
        LogFrame logFrame = new LogFrame();
        logFrame.repaint();
//        mainframe.repaint();

        Context.RequestsMessagingQueue = new MessagingQueue("Requests");
    }
}