package com.zzy.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJframe extends JFrame implements KeyListener, ActionListener {
    //��¼ÿ��ͼƬ��˳��
    int[][] imageData = new int[4][4];
    //��¼�հ�λ��
    int x = 0;int y = 0;
    //��¼����
    int step = 0;
    //���������˵�
    JMenuItem replayItem = new JMenuItem("������Ϸ");
    JMenuItem reloginItem = new JMenuItem("���µ�¼");
    JMenuItem exitItem = new JMenuItem("�˳���Ϸ");
    JMenuItem tipsItem = new JMenuItem("�鿴��ʾ");
    String path = "PuzzleGame\\image\\animal\\animal8\\";
    public GameJframe() {
        //��ʼ������
        initJFrame();
        //��ʼ���˵�
        iniJMenuBar();
        //��ʼ������
        iniData();
        //��ʼ��ͼƬ
        initImage();
        //setvisible
        this.setVisible(true);
    }

    private void iniData() {
        int[] tmpArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //�������һά����
        for (int i = 0; i < tmpArr.length; i++) {
            int index = r.nextInt(tmpArr.length);
            int tmp = tmpArr[i];
            tmpArr[i] = tmpArr[index];
            tmpArr[index] = tmp;
        }
        //��һά���鸳ֵ��imageData[][]
        for (int i = 0; i < tmpArr.length; i++) {
            if(tmpArr[i] == 0){x = i/4;y = i % 4;}
            imageData[i/4][i%4] = tmpArr[i];
        }
    }

    private void initImage() {
        //���ͼƬ
        this.getContentPane().removeAll();
        //�ж��Ƿ�ʤ��
        if(checkVictory()){
            JLabel win = new JLabel(new ImageIcon("F:\\Codes\\IDEA\\PuzzleGame\\PuzzleGame\\image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }
        //��ʾ����
        JLabel stepcnt = new JLabel("����"+step);
        stepcnt.setBounds(50,30,100,20);
        this.getContentPane().add(stepcnt);
        //���ͼƬ
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel =
                        new JLabel(new ImageIcon(path + imageData[i][j] + ".jpg"));
                jLabel.setBounds(105 * j+83, 105 * i+134, 105, 105);
                jLabel.setBorder(new BevelBorder(1));
                this.getContentPane().add(jLabel);
            }
        }
        //��ӱ���
        JLabel background = new JLabel(new ImageIcon("PuzzleGame\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        //ˢ��
        this.getContentPane().repaint();
    }

    private void iniJMenuBar() {
        //����JMenuBar����
        JMenuBar jMenuBar = new JMenuBar();
        //�����˵���
        JMenu functionjMenu = new JMenu("����");
        JMenu tipsjMenu = new JMenu("��ʾ");
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        exitItem.addActionListener(this);
        tipsItem.addActionListener(this);

        //�������˵�����
        functionjMenu.add(replayItem);
        functionjMenu.add(reloginItem);
        functionjMenu.add(exitItem);

        tipsjMenu.add(tipsItem);

        //��JMenu��ӵ�JMenuBar��
        jMenuBar.add(functionjMenu);
        jMenuBar.add(tipsjMenu);
        //�����˵�
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //size
        this.setSize(603, 680);
        //title
        this.setTitle("ƴͼ��Ϸv1.0");
        //setlocation
        this.setLocationRelativeTo(null);
        //ontop
        this.setAlwaysOnTop(true);
        //closemodel
        this.setDefaultCloseOperation(3);
        //initcontent
        this.setLayout(null);
        this.addKeyListener(this);
    }

    //���̼���
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(checkVictory())  return;
        int keyCode = e.getKeyCode();
        if(keyCode == 65){
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            JLabel background = new JLabel(new ImageIcon("PuzzleGame\\image\\background.png"));
            all.setBounds(83,134,420,420);
            background.setBounds(40,40,508,560);
            //��ʾ����
            JLabel stepcnt = new JLabel("����"+step);
            stepcnt.setBounds(50,30,100,20);
            this.getContentPane().add(stepcnt);
            this.getContentPane().add(all);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case 37:
                System.out.println("�����ƶ�");
                if(y==3)    return;
                imageData[x][y] = imageData[x][y+1];imageData[x][y+1] = 0;y++;
                step++;initImage();break;
            case 38:System.out.println("�����ƶ�");
                if(x==3)    return;
                imageData[x][y] = imageData[x+1][y];imageData[x+1][y] = 0;x++;
                step++;initImage();break;
            case 39:
                System.out.println("�����ƶ�");
                if(y == 0)  return;
                imageData[x][y] = imageData[x][y-1];imageData[x][y-1] = 0;y--;
                step++;initImage();break;
            case 40:
                System.out.println("�����ƶ�");
                if(x == 0)  return;
                imageData[x][y] = imageData[x-1][y];imageData[x-1][y] = 0;x--;
                step++;initImage();break;
            case 65:
                initImage();break;
            case 87:
                imageData = new int[][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}
                };initImage();
        }
    }
    //��������
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("������Ϸ");
            step = 0;iniData();initImage();
        }else if(obj == reloginItem){
            System.out.println("���µ�¼");
            this.setVisible(false);
            new LoginJframe();
        }else if(obj == exitItem){
            System.out.println("�˳���Ϸ");
            System.exit(0);
        } else if (obj == tipsItem) {
            JDialog jDialog = new JDialog();

        }
    }

    //����Ƿ�ʤ��
    public boolean checkVictory(){
        int[][] win = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if(imageData[i][j] != win[i][j])
                    return false;
            }
        }
        return true;
    }
}
