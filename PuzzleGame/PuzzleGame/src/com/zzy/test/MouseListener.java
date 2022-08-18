package com.zzy.test;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame implements java.awt.event.MouseListener {
    JButton jb1 = new JButton();
    public MouseListener(){
        this.setSize(603,680);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);

        jb1.setBounds(0,0,100,50);
        jb1.setText("click");
        jb1.addMouseListener(this);
        this.getContentPane().add(jb1);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("1");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("2");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("3");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("4");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("5");
    }
}
