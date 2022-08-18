package com.zzy.test;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {
    public KeyListener(){
        JFrame jf = new JFrame();
        jf.setSize(608,680);
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.addKeyListener(this);
        jf.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("1");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("2");
        int keyCode = e.getKeyCode();
        if(keyCode == 65)   System.exit(0);
    }
}
