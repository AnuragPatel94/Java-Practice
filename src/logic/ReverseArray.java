package logic;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};

		System.out.println("Original Array:");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\nReversed Array:");
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
