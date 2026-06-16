package sdet_qa;

public class Array {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			 sum=sum+a[i];
			System.out.println(a[i]);
			
			
		}
		System.out.println("Sum is:"+sum);
		
		

		System.out.println("Reverse Order:");

		for(int i=a.length-1; i>=0; i--) {
		    System.out.println(a[i]);
		}

		System.out.println("Normal Order:");

		for(int j=0; j<a.length; j++) {
		    System.out.println(a[j]);
		}
			
		//Enhanced for loop
		/*for(int x:a)
		{
			System.out.println(x);
		}*/
	}

}
