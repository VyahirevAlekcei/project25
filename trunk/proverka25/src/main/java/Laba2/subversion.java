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
	public static String FirstString;
	public static String SecondString;

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
					case "������������� ������ � �������25":
						Program.progtam(7);
						break;
						
				}
			}
		};

		// ������������� JComboBox � ���������� ��������� �� �������
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(50, 50, 215, 30);
		comboBox.addActionListener(actionComboBox);
		main_panel.add(comboBox);
		
		JLabel Visota = new JLabel("������");
		Visota.setBounds(20, 100, 180, 20);
		main_panel.add(Visota);
		Visota.setVisible(true);
		JTextField FirstField = new JTextField();
		FirstField.setBounds(20, 120, 180, 20);
		main_panel.add(FirstField);
		JLabel Radius = new JLabel("������");
		Radius.setBounds(20, 140, 180,20);
		main_panel.add(Radius);
		Radius.setVisible(true);
		JTextField SecondField = new JTextField();
		SecondField.setBounds(20, 160, 180, 20);
		SecondField.setText(SecondString);
		main_panel.add(SecondField);
		
		JButton Zapros = new JButton("���������");
		Zapros.setBounds(100, 180, 100, 30);
		main_panel.add(Zapros);

		class ShowLogo extends subversion implements ActionListener {
			// TODO Auto-generated constructor stub
			public void actionPerformed(ActionEvent e) {
				pich.setVisible(true);

			}
		}
		
		class Data extends subversion implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String H_stroka = FirstField.getText();
				Integer H = Integer.parseInt(H_stroka);
				String R_stroka = SecondField.getText();
				Integer R = Integer.parseInt(R_stroka);
				double H_2 = H * H;
				double R_2 = 3 * R - H;
				double G_2 = 1.05;
				double G = G_2 * H_2 * R_2;
				String message = "����� �������� �������� ����� = " + G;
				JOptionPane.showMessageDialog(null, message , "���������" , JOptionPane.PLAIN_MESSAGE);
			}
		}
		
		class FileDownload extends subversion implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					subversion.FirstString = Schitaka.schitka(1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					subversion.SecondString = Schitaka.schitka(2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				FirstField.setText(FirstString);
				SecondField.setText(SecondString);
			}
		}

		ActionListener actionListener2 = new ShowLogo();
		LogoItem.addActionListener(actionListener2);
		ActionListener actionListener3 = new ExitMenu();
		Exit.addActionListener(actionListener3);
		ActionListener FileDownload = new FileDownload();
		FileItem.addActionListener(FileDownload);
		ActionListener Dannie = new Data();
		Zapros.addActionListener(Dannie);
		
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

