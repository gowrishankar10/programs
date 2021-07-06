public class sqltrainer extends trainer
{
public sqltrainer(String name,String dept)
{
	
super(name,dept);
	
}
	
public static void main(String[] args)
{
sqltrainer ram = new sqltrainer("arun","student");	
System.out.println(ram.dept);

ram.getsalary();
ram.training();
}
	
	
}	
	