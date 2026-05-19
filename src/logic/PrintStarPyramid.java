package logic;

public class PrintStarPyramid {

	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1; i <= rows; i=i+1) 
		{
			for (int j = 1; j <= rows-i; j=j+1) 
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= (2*i-1); k=k+1) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
