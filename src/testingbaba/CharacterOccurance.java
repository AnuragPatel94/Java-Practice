package testingbaba;

import java.util.Scanner;

public class CharacterOccurance {

    public void charOccurance(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The occurrence of character '" + ch + "' is: " + count);
    }

    public static void main(String[] args) {
    	CharacterOccurance co = new CharacterOccurance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        co.charOccurance(str, ch);

        
    }
}