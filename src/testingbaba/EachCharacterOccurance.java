package testingbaba;

import java.util.Scanner;

public class EachCharacterOccurance {
	public void countCharacterOccurance(String str) 
	{
		int[] charCount = new int[256]; 
		
		for (char c : str.toCharArray()) 
		{
			charCount[c]++;
		}
          System.out.println("Character Occurrence:");
		for (int i = 0; i < charCount.length; i++) 
		{
			if (charCount[i] > 0) 
			{
				System.out.println((char) i + ": " + charCount[i]);
			}
		}
	}
		
		

	public static void main(String[] args) {
		EachCharacterOccurance oc = new EachCharacterOccurance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		oc.countCharacterOccurance(str);
		

	}

}
