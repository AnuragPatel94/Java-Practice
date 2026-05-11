package logic;

public class PalindromeNumber {

	public static void main(String[] args) {
		int original=12321;
		int reverse=0;
		int temp=original;
		
		while(temp!=0)
		{
			int remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		
		if(original==reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
