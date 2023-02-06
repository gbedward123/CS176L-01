//Import the scanner library
import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//Input data from console
		System.out.print("Please enter the cost per square foot: ");
		int houseCost = sc.nextInt();
		System.out.print("Please enter the length of the house: ");
		int houseLength = sc.nextInt();
		System.out.print("Please enter the width of the house: ");
		int houseWidth = sc.nextInt();
		System.out.print("Please enter the height of the house: ");
		int houseHeight = sc.nextInt();
		System.out.print("Please enter the number of windows: ");
		int windowNumber = sc.nextInt();
		System.out.print("Please enter the length of a window: ");
		int windowLength = sc.nextInt();
		System.out.print("Please enter the width of a window: ");
		int windowWidth = sc.nextInt();
		System.out.print("Please enter the number of doors: ");
		int doorNumber = sc.nextInt();
		System.out.print("Please enter the length of a door: ");
		int doorLength = sc.nextInt();
		System.out.print("Please enter the width of a door: ");
		int doorWidth = sc.nextInt();
		
		//Calculation
		int windowArea = windowNumber * windowLength * windowWidth;
		int doorArea = doorNumber * doorLength * doorWidth;
		int peakSide = (int) (houseLength*houseWidth + (.5)*(houseLength*(houseHeight-houseWidth)));
		int normalSide = houseLength * houseWidth;
	}

}
