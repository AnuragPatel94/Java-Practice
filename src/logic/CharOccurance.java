package logic;

import java.util.HashMap;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "HelloWorld";
		char chrArr[] =str.toCharArray();
		
		HashMap<Character, Integer> Map = new HashMap<>();
		for (char c : chrArr) {
			if (Map.containsKey(c)) {
				int count = Map.get(c);
				count++;
				Map.put(c, count);
			} else {
				Map.put(c, 1);
			}
		}
		System.out.println("Character Occurrence in the string: " + Map);
		

	}}
