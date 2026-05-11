package testingbaba;

import java.util.Scanner;

public class Calculator {
	public void Addition(int a, int b) 
    {
		int c=a+b;
		System.out.println("Total of Two Numbers:"+c);
    }

	public static void main(String[] args) {
		 
			Calculator cal=new Calculator();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			int num1=sc.nextInt();
			System.out.println("Enter the second number: ");
			int num2=sc.nextInt();
			cal.Addition(num1, num2);

	}

}
