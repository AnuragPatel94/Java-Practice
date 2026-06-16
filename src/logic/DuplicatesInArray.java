package logic;

import java.util.Scanner;

public class DuplicatesInArray {

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50,60,70,80,90,100,10,20};

        int count = 0;
        //int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for duplicates:");
        int num = sc.nextInt();

        for(int i = 0; i < a.length; i++) {

            if(a[i] == num) {
                count++;
            }
        }

        System.out.println(num + " is present " + count + " times");
    }
}