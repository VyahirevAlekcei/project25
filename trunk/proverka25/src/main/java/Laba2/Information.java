package Laba2;

import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;


public class Information implements ActionListener {
	protected static String message = "";
    public void actionPerformed(ActionEvent e) {
    	message += "��� � ������ �������� ������\n";
        message += "-------------------------------\n";
        message += "���������� ������� | 20150096\n";
        message += "������ ������� | 20130087\n";
        message += "������� ������� | 20130485\n";

     
        JOptionPane.showMessageDialog(null, message , "���������" , JOptionPane.PLAIN_MESSAGE);
       
        
    }
}