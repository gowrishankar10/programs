package whileloop;

public class divisor {

	public static void main(String[] args) {
		int no1 = 170, no2 = 180;
		int last = 0;
		int small;
		if (no1 < no2)
			small = no2;
		else
			small = no1;
		int i = 2;
		while (i <= small) {
			if (no1 % i == 0 && no2 % i == 0) {
			//	System.out.println(i + "  count ");
				last = i;
			}
			i++;

		}
		System.out.println("  GCD   " + last);

	}

}

