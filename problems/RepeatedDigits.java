import java.lang.Math;

public class RepeatedDigits {

	public static void main(String[] args) {

		int input = 14231;
		int digits = Integer.toString(input).length();

		int found = new int[9];

		for(int i = 0; i < digits; i++) {

			if(found[getNth(input, i+1)] == 1) {

				System.out.println("Failed");
				return;

			} else {

				found[getNth(input, i+1)] = 1;
			}
		}

		System.out.println("Success");
		return;
	}

	public static int getNth(int s, int p) {

		int divisor = Math.max((int)(Math.pow(10, p - 1)), 1); 			

		return ((s / divisor) % 10);	
	}
}