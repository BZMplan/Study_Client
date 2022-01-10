package com.mplan;

import javax.swing.JDialog;
import javax.swing.*;

import java.awt.*;
public class JD extends JDialog{
    public JD(){
        Container c = getContentPane();
        c.add(new JLabel("这是一个对话框"));
        setVisible(true);
        setBounds(600,400,100,100);
        //这是一个测试
    }
    
    
}
