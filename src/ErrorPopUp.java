
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ErrorPopUp extends JDialog{
    public ErrorPopUp(JFrame frame,String string){
        super(frame,"错误",true);
        String path = "img/icon.png";
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }
        string.equals("请重新输入");
        JLabel lable_Popup = new JLabel(string);
        Container c = getContentPane();
        c.add(lable_Popup); //添加标签
        c.setLayout(new FlowLayout());
        setResizable(false);
        setBounds(600,400,200,200);
        setVisible(true);
    }
    
}
