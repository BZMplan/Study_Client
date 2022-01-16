package com.mplan;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mform extends JFrame {


    public Mform(){
        
        //设置窗体的图标
        String path = "img/icon.png";
        try {
            Image img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }

        
        setTitle("这是一个窗体");
        setVisible(true);//设置窗体可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// DISPOSE_ON_CLOSE 释放资源
        setBounds(600,400,400,400);//设置窗体坐标和大小，像素
        setResizable(false);
        
        JLabel l = new JLabel("这是一个窗体");
        JButton butter_Popup = new JButton("按钮");

        Container c = getContentPane();
        c .setBackground(Color.WHITE);//设置背景颜色
        c.add(l);//添加组件
        c.add(butter_Popup);
        c.validate();//验证容器中的组件
        c.setLayout(new FlowLayout());

        butter_Popup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Popup(null);
            }
        });
    }
}
