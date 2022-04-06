package Laba2;

public class Program {
	public static void progtam(int i) {
		Massiv Massive = new Massiv();
		Integer[] MassiveI = Massive.Massive2(i);
		Sorting sorting = new Sorting();
		sorting.sort(MassiveI);
	}
}
