import java.awt.Color;
import java.awt.event.*;
import javax.swing.JTextField;
public class hidenText implements FocusListener {
    private String hidenText;
    private JTextField jTextField;

    public hidenText(JTextField jTextField ,String hidenText){
        this.jTextField = jTextField;
        this.hidenText = hidenText;
        jTextField.setText(hidenText);
        jTextField.setForeground(Color.gray);
    }
    

    @Override
    public void focusGained(FocusEvent e) {
        //获取焦点时，清空提示内容
        String temp = jTextField.getText();
        if(temp.equals(hidenText)){
            jTextField.setText("");
            jTextField.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        // 失去焦点时，没有输入内容，显示提示内容
        String temp = jTextField.getText();
        if(temp.equals("")){
            jTextField.setForeground(Color.GRAY);
            jTextField.setText(hidenText);
            
             
            
        }
        
    }
    
}
