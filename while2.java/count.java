int i = 2;
		int no = 20;
		int count = 0;
		while (i < no) {

			if (no % i == 0) {
				System.out.println(i + " count call");
				count++;

			}

			i++;
	

		}
		
		if (count == 0)
			System.out.println(" =  prime number  ");
		else
			System.out.println(count);

		System.out.println("total count " + " = " + (count));

	}

}

