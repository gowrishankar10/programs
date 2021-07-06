package whileloop;

public class loop {

	public static void main(String[] args) {

		int i = 2;
		int no = 120;
		int count = 0;
		while (i < no) {

			if (no % i == 0) {
				System.out.println(i);
				count++;
			
			}

			i++;

		}
	

	}

}

