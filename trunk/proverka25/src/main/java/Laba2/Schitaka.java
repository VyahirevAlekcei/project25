package Laba2;

import java.io.FileReader;
import java.util.Scanner;

public class Schitaka {
	public static String schitka(int j) throws Exception {
		FileReader fr = new FileReader("src/main/resources/Просканируй_меня.txt");
		Scanner scan = new Scanner(fr);
		
		int i = 1;
		String string = scan.nextLine();
		String string2 = scan.nextLine();
		fr.close();
		if (j == 1) {
			return string;
		} else  {
			return string2;
		}
		
	}

}
