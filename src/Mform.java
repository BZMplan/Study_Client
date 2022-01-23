
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.UnknownHostException;

public class Mform extends JFrame {

    public Mform(String ip,int port){
        
        //设置窗体的图标
        String path = "img/icon.png";
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        } catch (Exception e) {
            System.out.println(e);
        }

        setTitle("这是一个窗体");
        setVisible(true);//设置窗体可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// DISPOSE_ON_CLOSE 释放资源
        setBounds(600,400,600,400);//设置窗体坐标和大小，像素
        setResizable(false);
        
        JLabel lable = new JLabel("这是一个窗体"); //设置一个文本标签
        JButton butter_Popup = new JButton("按钮"); //设置按钮
        JTextField text_Field= new JTextField(16); //设置输入文本框
        // JTextField text_Field_2 = new JTextField(16);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c .setBackground(Color.WHITE);//设置背景颜色
        c.add(lable);//添加组件
        c.add(butter_Popup);
        c.add(text_Field);
        // c.add(text_Field_2);
        
        //当点击按钮时，进行数据传输
        butter_Popup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String temp = text_Field.getText();
                String string = text_Field.getText();

                if(temp.equals("请输入一段文字")){
                    new ErrorPopUp(null,"请重新输入");
                }else{
                    try {
                        new Popup(null, string, ip, port);
                    } catch (UnknownHostException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                
            }
        });
        text_Field.addFocusListener(new hidenText(text_Field, "请输入一段文字"));
        // text_Field_2.addFocusListener(new hidenText(text_Field_2, "请输入一段文字"));
        //验证容器中的组件
        c.validate();
    }
}
