package com.mplan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JF extends JFrame {

    public JF(){
        setTitle("这是一个窗体");
        setVisible(true);//设置窗体可见
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// DISPOSE_ON_CLOSE 释放资源
        setBounds(600,400,400,400);//设置窗体坐标和大小，像素
        setResizable(false);

        JLabel l = new JLabel("这是一个窗体");
        JButton JB = new JButton("按钮");

        Container c = getContentPane();
        c .setBackground(Color.WHITE);//设置背景颜色
        c.add(l);//添加组件
        c.add(JB);
        c.validate();//验证容器中的组件
        c.setLayout(new FlowLayout());

        JB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new JD();
            }
        });
    }
}
