package com.zzy.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(603,680);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        JButton jbc = new JButton("���Ұ�");
        jbc.setBounds(0,0,100,50);
        jbc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("��Ҫ����");
            }
        });
        jf.getContentPane().add(jbc);
        jf.setVisible(true);
        /*        if(keyCode == 37){
            System.out.println("�����ƶ�");
            if(y==3)    return;
            imageData[x][y] = imageData[x][y+1];imageData[x][y+1] = 0;y++;
            initImage();
        } else if (keyCode == 38) {
            System.out.println("�����ƶ�");
            if(x==3)    return;
            imageData[x][y] = imageData[x+1][y];imageData[x+1][y] = 0;x++;
            initImage();
        } else if (keyCode == 39) {
            System.out.println("�����ƶ�");
            if(y == 0)  return;
            imageData[x][y] = imageData[x][y-1];imageData[x][y-1] = 0;y--;
            initImage();
        }else if(keyCode == 40){
            System.out.println("�����ƶ�");
            if(x == 0)  return;
            imageData[x][y] = imageData[x-1][y];imageData[x-1][y] = 0;x--;
            initImage();
        }else if(keyCode == 65){
            initImage();
        }*/
    }


}
