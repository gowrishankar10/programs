package condition;

/*
 * scenario is there is a running race
 * who got first place .and the price is price is 5000

 * 
 */
public class runingRace {

	static String race = "running race";

	public static void main(String[] args) {
int arunRunningKM = 55, devaRunningKM = 24, ramRunningKM = 34;
		System.out.println(runingRace.race);

if (arunRunningKM > devaRunningKM && arunRunningKM > ramRunningKM) {
			System.out.println("arun got first place = 5000");

		} else if (devaRunningKM < arunRunningKM && devaRunningKM > ramRunningKM) {
			System.out.println("deva got first place = 5000");
		} else if (ramRunningKM < arunRunningKM && devaRunningKM > ramRunningKM) {
			System.out.println("ram got first place = 5000");
		}

		else

		{
			System.out.println("raCE DRAW");
		}

	}

}