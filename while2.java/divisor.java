package whileloop;

public class loop {

	public static void main(String[] args) {

		int no1 = 42;
		int no2 = 120;
		int small;

		if (no1 < no2)

			small = no1;

		else
			small = no2;

		int i = 1;
		while (i <= small)

		{
			if (no1 % i == 0 && no2 % i == 0) {

				System.out.println(i + "  worked");
			}
			i++;

		}
		System.out.println("loop out");

	}

}

