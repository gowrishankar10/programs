package whileloop;

public class star2 {

	public static void main(String[] args) {

		for (int row = 5; row >= 1; row--) {
			for (int colm = 1; colm <= row; colm++) {
				System.out.print(" * ");
			}

			for (int c = 1; c<=6-row; c++) {
				System.out.print(" 1 ");
			}
			System.out.println();

		}
	}

}

