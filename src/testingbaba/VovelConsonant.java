package testingbaba;

import java.util.Scanner;

public class VovelConsonant {
	public void checkVowelConsonant(char ch)
	
	
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch + " is a Vowel");
		}
		else
		{
			System.out.println(ch + " is a Consonant");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VovelConsonant vc = new VovelConsonant();
		System.out.println("Enter a Character: ");
		char ch = sc.next().charAt(0);
		vc.checkVowelConsonant(ch);
		

	}

}
