package testingbaba;

import java.util.Scanner;

public class FindEvenOdd {
	
	public void printEvenOdd(int number)
	{
	
	System.out.println("Entered Number: "+ number);
	
	int remainder = number % 2;

	
	if(remainder ==0)
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}}

	public static void main(String[] args) {
		FindEvenOdd evenOdd = new FindEvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		evenOdd.printEvenOdd(number);
	}
	
		
		
	}


