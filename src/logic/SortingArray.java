package logic;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[] = {50,60,10,40,50,80,90,100,20,30};
		
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(a));
		}

	}


