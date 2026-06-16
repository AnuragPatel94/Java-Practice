package logic;

public class CountCharacter {

	public static void main(String[] args) {
		String str="Welcome to Java Programming";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of characters in the string is "+count);

	}

}
