package com.zzy.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJframe extends JFrame implements KeyListener, ActionListener {
    //记录每个图片的顺序
    int[][] imageData = new int[4][4];
    //记录空白位置
    int x = 0;int y = 0;
    //记录步数
    int step = 0;
    //创建下拉菜单
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem exitItem = new JMenuItem("退出游戏");
    JMenuItem tipsItem = new JMenuItem("查看提示");
    String path = "PuzzleGame\\image\\animal\\animal8\\";
    public GameJframe() {
        //初始化界面
        initJFrame();
        //初始化菜单
        iniJMenuBar();
        //初始化数据
        iniData();
        //初始化图片
        initImage();
        //setvisible
        this.setVisible(true);
    }

    private void iniData() {
        int[] tmpArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //随机打乱一维数组
        for (int i = 0; i < tmpArr.length; i++) {
            int index = r.nextInt(tmpArr.length);
            int tmp = tmpArr[i];
            tmpArr[i] = tmpArr[index];
            tmpArr[index] = tmp;
        }
        //将一维数组赋值给imageData[][]
        for (int i = 0; i < tmpArr.length; i++) {
            if(tmpArr[i] == 0){x = i/4;y = i % 4;}
            imageData[i/4][i%4] = tmpArr[i];
        }
    }

    private void initImage() {
        //清空图片
        this.getContentPane().removeAll();
        //判断是否胜利
        if(checkVictory()){
            JLabel win = new JLabel(new ImageIcon("F:\\Codes\\IDEA\\PuzzleGame\\PuzzleGame\\image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }
        //显示步数
        JLabel stepcnt = new JLabel("步数"+step);
        stepcnt.setBounds(50,30,100,20);
        this.getContentPane().add(stepcnt);
        //添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel =
                        new JLabel(new ImageIcon(path + imageData[i][j] + ".jpg"));
                jLabel.setBounds(105 * j+83, 105 * i+134, 105, 105);
                jLabel.setBorder(new BevelBorder(1));
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景
        JLabel background = new JLabel(new ImageIcon("PuzzleGame\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        //刷新
        this.getContentPane().repaint();
    }

    private void iniJMenuBar() {
        //创建JMenuBar对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单栏
        JMenu functionjMenu = new JMenu("功能");
        JMenu tipsjMenu = new JMenu("提示");
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        exitItem.addActionListener(this);
        tipsItem.addActionListener(this);

        //将下拉菜单分类
        functionjMenu.add(replayItem);
        functionjMenu.add(reloginItem);
        functionjMenu.add(exitItem);

        tipsjMenu.add(tipsItem);

        //将JMenu添加到JMenuBar中
        jMenuBar.add(functionjMenu);
        jMenuBar.add(tipsjMenu);
        //创建菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //size
        this.setSize(603, 680);
        //title
        this.setTitle("拼图游戏v1.0");
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

    //键盘监听
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
            //显示步数
            JLabel stepcnt = new JLabel("步数"+step);
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
                System.out.println("向左移动");
                if(y==3)    return;
                imageData[x][y] = imageData[x][y+1];imageData[x][y+1] = 0;y++;
                step++;initImage();break;
            case 38:System.out.println("向上移动");
                if(x==3)    return;
                imageData[x][y] = imageData[x+1][y];imageData[x+1][y] = 0;x++;
                step++;initImage();break;
            case 39:
                System.out.println("向右移动");
                if(y == 0)  return;
                imageData[x][y] = imageData[x][y-1];imageData[x][y-1] = 0;y--;
                step++;initImage();break;
            case 40:
                System.out.println("向下移动");
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
    //动作监听
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");
            step = 0;iniData();initImage();
        }else if(obj == reloginItem){
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJframe();
        }else if(obj == exitItem){
            System.out.println("退出游戏");
            System.exit(0);
        } else if (obj == tipsItem) {
            JDialog jDialog = new JDialog();

        }
    }

    //检查是否胜利
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
