package Laba2;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class Information implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String message = "��� � ������ �������� ������\n";
        message += "-------------------------------\n";
        message += "���������� ������� | 20150096\n";
        message += "������ ������� | 20130087\n";
        message += "������� ������� | 20130485\n";
        message += "������������ ������� | 20130840\n";
        
        JOptionPane.showMessageDialog(null, message , "���������" , JOptionPane.PLAIN_MESSAGE);
    }
}