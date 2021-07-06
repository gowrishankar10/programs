package india.chennai; 
import taiwan.ITCompany; 

public class Branch extends ITCompany
// Child - Sub        Parent - Super 
{
int salary  = 11000; // only within package
String currency = "INR"; 
public static void main(String[] args)
{

Branch emp = new Branch();
emp.develop(); 
System.out.println(emp.name); 
System.out.println(emp.salary); 
System.out.println(emp.currency); 

//emp.getCoffee(); 
}

}