package Laba2; //????? Java ???????

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //?????????? ??? ??????? ?????????
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.*; // ?????????? ??? GUI (????????? ?? ?????? awt)
import javax.swing.event.MenuKeyEvent;

public class subversion {
	public static void main(String[] args) throws IOException { // ?????????? ???????: http://www.mstu.edu.ru/study/materials/java/
		Properties props = System.getProperties();
		props.setProperty("javax.accessibility.assistive_technologies", "");
		//BufferedImage bufferedImage = ImageIO.read(new File("ugatu.jpg"));   ( ������� � 8 �������.)
		//Image image = bufferedImage.getScaledInstance(300, 149, 0);

		Image image = ImageIO.read(subversion.class.getResource("/ugatu.jpg"));

		JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(500,400,800,600);
		main_GUI.setResizable(false); // ������������� ������ ����


		JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		main_panel.setLayout(null);
		main_GUI.add(main_panel);

		JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
		laba_info.setBounds(300,0,180,30);
		main_panel.add(laba_info);


		ImageIcon icon = new ImageIcon(image);
		JLabel pich = new JLabel();
		pich.setIcon(icon);
		pich.setBounds(430, 30, 300, 150);
		main_panel.add(pich);
		pich.setVisible(false);

		JButton button_exit = new JButton("�����"); // ��������� ������
		button_exit.setBounds(675,450,100,40);
		ActionListener actionListener = new ListenerButton(); //������� ���������
		button_exit.addActionListener(actionListener); // ��������� ��������� � ������
		main_panel.add(button_exit);

		JButton information = new JButton("����������");
		information.setBounds(10,450,150,40);
		ActionListener actionListener1 = new Information();
		information.addActionListener(actionListener1);
		main_panel.add(information);

		JMenuBar menuBar = new JMenuBar();
		JMenu GlavnoeMenu = new JMenu("����");
		GlavnoeMenu.setMnemonic(MenuKeyEvent.VK_F);
		menuBar.add(GlavnoeMenu);
		JMenuItem LogoItem = new JMenuItem("���������� ������� �����");
		JMenuItem FileItem = new JMenuItem("��������� ����");
		GlavnoeMenu.add(LogoItem);
		GlavnoeMenu.add(FileItem);
		JMenuItem Exit = new JMenuItem("�����");
		GlavnoeMenu.add(Exit);
		main_GUI.setJMenuBar(menuBar);

		// ������ �������� � JComboBox
		String [] items = {
			"������",
			"�����",
			"�� ������",
			"������",
			"�����",
			"������������� ������ � �������25"
		};

		// ���������� ������� �� ����������
		ActionListener actionComboBox = e -> {
			JComboBox box = (JComboBox)e.getSource();
			String item = (String)box.getSelectedItem();
			if (item != null) {
				switch (item) {
					case "������":
						pich.setBounds(250, 50,300, 150);
						break;
					case "�����":
						pich.setBounds(20, 100,300, 150);
						break;
					case "�� ������":
						pich.setBounds(250, 150, 300, 150);
						break;
					case "������":
						pich.setBounds(450, 100,300, 150);
						break;
					case "�����":
						pich.setBounds(250, 350,300, 150);
						break;
					case "������������� ������ � ������� 25":
						break;
				}
			}
		};

		// ������������� JComboBox � ���������� ��������� �� �������
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(50, 50, 215, 30);
		comboBox.addActionListener(actionComboBox);
		main_panel.add(comboBox);


		class ShowLogo extends subversion implements ActionListener {
			// TODO Auto-generated constructor stub
			public void actionPerformed(ActionEvent e) {
				pich.setVisible(true);

			}
		}

		ActionListener actionListener2 = new ShowLogo();
		LogoItem.addActionListener(actionListener2);
		ActionListener actionListener3 = new ExitMenu();
		Exit.addActionListener(actionListener3);
		ActionListener FileDownload = new FileDownload();
		FileItem.addActionListener(FileDownload);
		
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

