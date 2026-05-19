package testingbaba;

import java.util.Scanner;

public class FindWeekDaysIndex {
	
	public void printWeekDaysIndex(String day)
	{
		if (day.equalsIgnoreCase("Monday")) {
			System.out.println("Index of Monday is: 1");
		} else if (day.equalsIgnoreCase("Tuesday")) {
			System.out.println("Index of Tuesday is: 2");
		} else if (day.equalsIgnoreCase("Wednesday")) {
			System.out.println("Index of Wednesday is: 3");
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("Index of Thursday is: 4");
		} else if (day.equalsIgnoreCase("Friday")) {
			System.out.println("Index of Friday is: 5");
		} else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Index of Saturday is: 6");
		} else  {
			System.out.println("Index of Sunday is: Holiday");
		}
		
	}

	public static void main(String[] args) {
		FindWeekDaysIndex objt = new FindWeekDaysIndex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the day: ");
		String day = sc.nextLine();
		objt.printWeekDaysIndex(day);
		

	}

}
