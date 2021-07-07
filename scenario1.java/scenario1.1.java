public class trainer
{
String dept ="java", institute = "payilagam";
private int salary = 10000; 

public int getsalary()
{
return this.salary;
}

public void training()
{
	System.out.println("online class");
}
public static void main(String[] args)
{
trainer trainerMuthu  = new trainer("cse","payilagam"); 
}

public trainer(String dept,String institute)
{
	this.dept = dept;
	this.institute = institute;
}

}