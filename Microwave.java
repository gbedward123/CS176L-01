import java.util.Scanner;
public class Microwave {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time;
		int level;
		public Microwave()
		{
		level = 1;
		time = 0;
		public void increaseTime()
		{
		time += 30;
		public void switchPower()
		{
		if(level == 2)
		level = 1;
		if(level == 1)
		level = 2;
		public void reset()
		{
		level = 1;
		time = 0;
		public void start()
		{
		System.out.println("Time Button was pressed. Time is " + time + " seconds");
		System.out.println("Time Button was pressed. Time is " + time + " seconds");
		System.out.println("Power Button was pressed. Power level is " + level);
		System.out.println("Cooking for " + time + " seconds at level " + level);
		System.out.println("Reset Button was pressed. Power level is " + time + ". Time is " + time + " seconds."); 
		}
		}
		}
		}
		}
		}
		}
	}
}
