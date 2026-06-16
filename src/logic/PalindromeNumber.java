package logic;

public class PalindromeNumber {

	public static void main(String[] args) {
		int original=12321;
		int reverse=0;
		int temp=original;
		
		while(temp!=0)
		{
			int rem=temp%10; //1,2,3,2,1
			reverse=reverse*10+rem; //0*10+1=1, 1*10+2=12, 12*10+3=123, 123*10+2=1232, 1232*10+1=12321
			temp=temp/10; //1232, 123, 12, 1, 0
		}
		
		if(original==reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
	}

}
