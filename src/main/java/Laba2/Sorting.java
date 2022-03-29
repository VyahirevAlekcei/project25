package Laba2;

public class Sorting extends Progtam {


	public void sort(Integer[] MassiveI) {
		Integer schet = 7;
		for (int out = schet - 1; out >= 1; out--) {
			for (int in = 0; in < out; in++) {
				if (MassiveI[in] > MassiveI[in+1]) {
					Integer time = MassiveI[in];
					MassiveI[in] = MassiveI[in+1];
					MassiveI[in+1] = time;
				}
			}
		}
	}
}
