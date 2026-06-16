package logic;

import java.util.Arrays;


public class AnagramsString {
    public static void main(String[] args) {
		String word1 = "listen";
		String word2 = "silente";
		
		char[] chrArr1 = word1.toCharArray();
		char[] chrArr2 = word2.toCharArray();
		
		Arrays.sort(chrArr1);
		Arrays.sort(chrArr2);

		if (Arrays.equals(chrArr1, chrArr2)) {
			
			System.out.println("The strings are anagrams.");
		} 
		else {
			System.out.println("The strings are not anagrams.");
		}
	}
	
	
		
	}

	

	


