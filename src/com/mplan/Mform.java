package com.mplan;
import javax.imageio.ImageIO;
import javax.security.auth.callback.TextInputCallback;
import javax.swing.*;
import javax.swing.FocusManager;
import javax.swing.event.EventListenerList;

import org.w3c.dom.events.MouseEvent;

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
        }

        setTitle("这是一个窗体");
        setVisible(true);//设置窗体可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// DISPOSE_ON_CLOSE 释放资源
        setBounds(600,400,600,400);//设置窗体坐标和大小，像素
        setResizable(false);
        
        JLabel lable = new JLabel("这是一个窗体");
        JButton butter_Popup = new JButton("按钮");
        JTextField text_Field = new JTextField(16);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c .setBackground(Color.WHITE);//设置背景颜色
        c.add(lable);//添加组件
        c.add(butter_Popup);
        c.add(text_Field);
        
        butter_Popup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String string = text_Field.getText();
                System.out.println(string);
                new Popup(null,string);
            }
        });
        //验证容器中的组件
        c.validate();
    }
}
