 package whileloop;

public class fibo1 {

	public static void main(String[] args) {
		int f=-1,s=1;
		
		int count = 1;
		while (count<=5) {
			int t = f+s;
		
		System.out.println(t);	
		f=s;
		s=t;
		
		count++;
		}
		}

}

