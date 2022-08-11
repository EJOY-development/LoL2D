package core;

import network.MessagingQueue;
import render.frames.MainFrame;
import render.panels.LoginPanel;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        LoginPanel loginPanel = new LoginPanel();
        frame.add(loginPanel);
        frame.repaint();

        Context.RequestsMessagingQueue = new MessagingQueue("Requests");
    }
}