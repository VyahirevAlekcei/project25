package Laba2;

public class Massive1 {
	
	public Integer[] Massive2(int j){
	
	Integer[] Massive = new Integer[j];
	Integer schet = 0;
	for (Integer i = 0; i <= 6; i++) {
		Massive[i] = Random.rand();
		schet++;
		
	}
	return Massive;
}

}
