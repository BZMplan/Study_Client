package com.mplan;

import javax.swing.*;

import java.awt.*;
public class JD extends JDialog{
    public JD(JFrame frame){
        super(frame,"标题",true);
        Container c = getContentPane();
        c.add(new JLabel("这是一个对话框"));
        setBounds(600,400,200,200);
        setVisible(true);
        //这是一个测试
    }
    
    
}
