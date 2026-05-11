package logic;

import java.util.HashSet;

public class FindDuplicateInString {

	public static void main(String[] args) {
		String str = "programming";
		char charArray []= str.toCharArray();
		
		HashSet<Character> unique = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();
		
		for(char c : charArray)
		{
			if(!unique.contains(c))
			
			{ 
				unique.add(c);
				
			}
			else
			{
				duplicates.add(c);
			}
			}
		System.out.println(duplicates);
	}
	}
		
		
		
		
		
		