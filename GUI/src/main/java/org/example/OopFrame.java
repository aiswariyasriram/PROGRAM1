package org.example;

import javax.swing.*;
import java.awt.*;

public class OopFrame extends JFrame {
    public OopFrame() {
        String text = new String("This program developed by aiswariya");
        String text2 = text.concat(" using OOP concepts in Java");

        JLabel label = new JLabel(text2);
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);

        getContentPane().add(panel);
        panel.add(label);
    }
}
