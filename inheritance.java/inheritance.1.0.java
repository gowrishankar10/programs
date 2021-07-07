package taiwan;
import india.chennai.SWcompany;

public class ITCompany
{
protected int patent = 123;
public String name = "ABCD"; 
int salary  = 10000; // only within package
String currency = "NTD"; // only within package
public static void main(String[] args)
{

}
  // protected variable method object class constructor 
protected void develop()
{
System.out.println("Development works"); 
}
  
void getCoffee()  // only within package  - package level modifier (default)
{
  System.out.println("Have a cup of coffee"); 
}

}