package Laba2;

public class Random {
	public static Integer rand() {
		Integer min = 50; // ����������� ����� ��� ���������
		Integer max = 95; // ������������ ����� ��� ���������
		max -= min;
		Integer Random = (int) (Math.random() * ++max) + min;
		return Random;
	}

}
