
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.UnknownHostException;
public class Popup extends JDialog{
    // public Popup(JFrame frame,String string,String string2)
    public Popup(JFrame frame,String string,String ip ,int port) throws UnknownHostException, IOException{
        super(frame,"标题",true);
        //设置窗体的图标
        String path = "img/icon.png";
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }
        new upInfo(ip,port,string);
        JLabel lable_Popup = new JLabel("你向服务器发送的信息是："+ string);
        Container c = getContentPane();
        c.add(lable_Popup); //添加标签
        c.setLayout(new FlowLayout());
        // JLabel lable_Popup = new JLabel("文字是:"+ string+"文字是:"+string2);
        
        setResizable(false);

        setBounds(600,400,200,200);

        setVisible(true);
        
        //这是一个测试
    }
    
    
}
