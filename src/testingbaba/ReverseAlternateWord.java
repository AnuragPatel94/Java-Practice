package testingbaba;

import java.util.Scanner;

public class ReverseAlternateWord {
	public void reverseAlternate(String sen)
	{
		String[] str = sen.split(" ");
		String out = "";
		for(int i=0; i<str.length; i++)
		{
			if(i%2!=0)
			{
				char[] ch = str[i].toCharArray();
				for(int j=ch.length-1; j>=0; j--)
				{
					out =out +ch[j];
				}
				out=  out + " ";
			}
			else
			{
				out = out + str[i] + " ";
			}
		}
		
		System.out.println(out.trim());
		
	}


	public static void main(String[] args) {
		ReverseAlternateWord rev = new ReverseAlternateWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		rev.reverseAlternate(str);
		
		

	}

}
