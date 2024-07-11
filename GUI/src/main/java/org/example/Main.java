package org.example;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {
       public static void main(String[] args) {
        OopFrame frame = new OopFrame();
        frame.setTitle("OOP Principles");
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(l);
        frame.setSize(400, 400);
        frame.pack();
        frame.setVisible(true);
    }
}
