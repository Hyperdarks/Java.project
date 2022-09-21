package ff;

import java.security.SecureRandom;

public class seismilhoes {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int[] freq = new int[] { 0, 0, 0, 0, 0, 0 };

		for (int roll = 1; roll <= 6000000; roll++) {
			int face = 1 + randomNumbers.nextInt(6);

			switch (face) {
			case 1:
				freq[0]++;
				break;
			case 2:
				freq[1]++;
				break;
			case 3:
				freq[2]++;
				break;
			case 4:
				freq[3]++;
				break;
			case 5:
				freq[4]++;
				break;
			case 6:
				freq[5]++;
				break;
			}
		}
		System.out.println("Face\tFrequencia");
		System.out.println("1-\t" + freq[0]);
		System.out.println("2-\t" + freq[1]);
		System.out.println("3-\t" + freq[2]);
		System.out.println("4-\t" + freq[3]);
		System.out.println("5-\t" + freq[4]);
		System.out.println("6-\t" + freq[5]);

	}
}
