package testingbaba;

import java.util.Scanner;

public class StudentMarksheet {
	
	public void PrintMarksheet(int Math, int Science, int English, int Computer)
	{
		int totalMarks = Math + Science + English + Computer;
		float percentage = (totalMarks*100)/400;
		
		//System.out.println("Your Name is:"+ Name);
		//System.out.println("Enter Student Roll Number: ");
		System.out.println("Marks in Math: " + Math);
		System.out.println("Marks in Science: " + Science);
		System.out.println("Marks in English: " + English);
		System.out.println("Marks in Computer: " + Computer);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage: " + percentage+"%");
		
	
		if(percentage < 33)
		{
			System.out.println("Fail");
		}
		else if(percentage>=33 && percentage<45)
		{
			System.out.println("3rd Division");
		}
		else if(percentage>=45 && percentage<60)
		{
			System.out.println("2nd Division");
		}
		else
		{
			System.out.println("1st Division");
			
		}}
	public static void main(String[] args) {
		StudentMarksheet ms = new StudentMarksheet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String Name = sc.next();
		System.out.println("Enter Student Roll Number: ");
		int rollNumber = sc.nextInt();
		System.out.println("Enter Student Marks: ");
		int  Math = sc.nextInt();
		int Science = sc.nextInt();
		int English = sc.nextInt();
		int Computer = sc.nextInt();
		ms.PrintMarksheet(Math, Science, English, Computer);
		
		

	}

}
