package logic;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		String revStr = "";
		
		for (int i = str.length()-1; i >= 0; i=i-1) 
		{
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println("Reverse String is: " + revStr);
}
}
	