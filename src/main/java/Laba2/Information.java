package Laba2;

import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;


public class Information implements ActionListener {
	protected static String message = "";
    public void actionPerformed(ActionEvent e) {
    	message += "ФИО и номера зачетных книжек\n";
        message += "-------------------------------\n";
        message += "Налигацкий Евгений | 20150096\n";
        message += "Аминев Алексей | 20130087\n";
        message += "Вяхирев Алексей | 20130485\n";

     
        JOptionPane.showMessageDialog(null, message , "Сообщение" , JOptionPane.PLAIN_MESSAGE);
       
        
    }
}