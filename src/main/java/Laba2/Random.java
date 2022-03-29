package Laba2;

public class Random {
	public static Integer rand() {
		Integer min = 50; // Минимальное число для диапазона
		Integer max = 95; // Максимальное число для диапазона
		max -= min;
		Integer Random = (int) (Math.random() * ++max) + min;
		return Random;
	}

}
