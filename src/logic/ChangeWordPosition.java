package logic;

import java.util.Scanner;

public class ChangeWordPosition {
	//Change word position in a string (Hello Java  -->  Java Hello)
	public void changeWordPosition(String str) {
		String[] words = str.split(" ");
		String newStr = words[1] + " " + words[0];
		System.out.println("String with changed word position: " + newStr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		ChangeWordPosition cwp = new ChangeWordPosition();
		cwp.changeWordPosition(str);
	}

}
