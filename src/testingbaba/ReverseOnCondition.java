package testingbaba;

import java.util.Scanner;

public class ReverseOnCondition {
	public void reverseSpecific(String sen, String word) //my name is aman, java
	
	//split string into array of string, check if word is present in array, 
	//if present reverse whole string else reverse only word
	{
		String[] str = sen.split(" "); 
		boolean flag = false;
		String out = "";
		for(int i=0; i<str.length; i++)
		{
			if(str[i].equals(word))
			{
				flag = true;
			}
		}
		
		
		if(flag==true)
		{
			for(int i=str.length-1; i>=0; i--)
			{
			  char[] ch = str[i].toCharArray();
			  for(int j=ch.length-1; j>=0; j--)
			  {
				  out =out +ch[j];
			  }
			  out=  out + " ";
			}
		}
		else
		{
			char[] ch = word.toCharArray();
			for(int i=ch.length-1; i>=0; i--)
			{
				out = out + ch[i];
			}
		}
		
		System.out.println(out.trim());
	}
	
	

	public static void main(String[] args) {
		ReverseOnCondition rev = new ReverseOnCondition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String word=sc.next();
		rev.reverseSpecific(str, word);

	}

}
