package logic;

import java.util.Scanner;

public class SearchingElementinArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		//int searchElement = 50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search:");
		int searchElement = sc.nextInt();
		boolean found = false;

		for(int i = 0; i < a.length; i++) {
			if(a[i] == searchElement) {
				found = true;
				System.out.println("Element " + searchElement + " found at index: " + i);
				break;
			}
		}

		if(!found) {
			System.out.println("Element " + searchElement + " not found in the array.");
		}
	}

}
