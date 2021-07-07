package scenario2.java;

public  class actorsivakumar implements actor
{
	
static String Address = "coimbatore";
	
int age;
String car;
	
public 	actorsivakumar(int age , String car)
{
this.age = age;
this.car = car;	
}
public actorsivakumar()
{	
}
public static void main(String[] args) {
		
actorsivakumar Hero = new actorsivakumar (65,"audi");
Hero.Speaking();
Hero.act();
Hero.Dance();
Hero.Sing();
Hero.act();
	
System.out.println(	actorsivakumar.Address);
	
actor ac = new actorsivakumar();
System.out.println(ac.Address);
	
}
	public void Speaking()
{
		
}
	
	
public void act()
{
System.out.println("best actor");
}		
 public void Dance()
 {
 System.out.println("lite dancer");
		 
 }


public void Sing()
{
System.out.println("not perform well");
	
}

@Override
public void Act()
 {
		
}

}
