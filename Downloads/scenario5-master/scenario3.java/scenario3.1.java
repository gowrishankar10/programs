package scenario3;

public abstract class smartPhone {
	
	public smartPhone()
	{
		System.out.println("smart phone under development");
	}


 public abstract int call (int seconds);
 public abstract void Sendmessage();
 public abstract void recivecall();
 
 public void browse()
 {
	 System.out.println("smart phone browsing");
 }
 
 
}