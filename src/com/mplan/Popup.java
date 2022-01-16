package com.mplan;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
public class Popup extends JDialog{
    public Popup(JFrame frame,String string){
        super(frame,"标题",true);
        //设置窗体的图标
        String path = "img/icon.png";
        try {
            Image img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }

        JLabel lable_Popup = new JLabel("文字是:"+ string);
        Container c = getContentPane();
        c.add(lable_Popup);
        c.setLayout(new FlowLayout());
        setResizable(false);
        setBounds(600,400,200,200);

        setVisible(true);
        
        //这是一个测试
    }
    
    
}