package Laba2;

public class Massive1 {
	
	public static Integer[] Massive2(int j){
	
	Integer[] Massive = new Integer[j];
	Integer schet = 0;
	//Integer i = 0;
	//max -= min;
	for (Integer i = 0; i <= 6; i++) {
		Integer min = 50; // Минимальное число для диапазона
		Integer max = 95; // Максимальное число для диапазона
		max -= min;
		Massive[i] = (int) (Math.random() * ++max) + min;
		//i++;
		schet++;
		
	}
	return Massive;
}

}
