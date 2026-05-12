package testingbaba;

import java.util.Scanner;

public class FindWeekDaysIndex {
	public void printWeekDaysIndex(String day)
	{
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		for(int i=0; i<weekDays.length; i++)
		{
			if(weekDays[i].equalsIgnoreCase(day))
			{
				System.out.println("The index of " + day + " is: " + i);
				return;
			}
		}
		
		System.out.println("Invalid day entered: " + day);
	}

	public static void main(String[] args) {
		FindWeekDaysIndex objt = new FindWeekDaysIndex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the day: ");
		String day = sc.nextLine();
		objt.printWeekDaysIndex(day);
		

	}

}
