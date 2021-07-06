package scenario4;

public class tamilnadu extends southindia

{
	static String capital = "chennai";

	public tamilnadu(String primeminister) {
		super(primeminister);
		
	}
	
	
	public static void main(String[] args)
	{
	System.out.println(india.capital);
	System.out.println(tamilnadu.capital);
	
	southindia si = new tamilnadu("modi");
	si.cultivate();
	si.dress();
	si.eat();
	}
	

	@Override
	public void speaklanguage() {
		System.out.println("tamil");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("rice");
		
		
	}

	@Override
	public void dress() {
		System.out.println("treditional");
	}
	
	public void cultivate()
	{
	System.out.println("rice and sugarcane cultivate");
	}
	
	public void livingstyle()
	{
		System.out.println("above average");
		
	}
}
