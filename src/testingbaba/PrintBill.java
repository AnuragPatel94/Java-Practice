package testingbaba;

import java.util.Scanner;

public class PrintBill {
	
	/*public void printGSTBill(String productName, int price)
	{
		float gstAmount = price*18/100;
		float totalAmount = price + gstAmount;
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("GST Amount: " + gstAmount);
		System.out.println("Total Amount: " + totalAmount);
	}
	
	

	public static void main(String[] args) {
		
		PrintBill bill = new PrintBill();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name: ");
		String productName = sc.next();
		System.out.println("Enter Price: ");
		int price = sc.nextInt();
		bill.printGSTBill(productName, price);*/
	
	
	public float calculateGST(float price)
	{
		float gstAmount = price*18/100;
		return gstAmount;
		
	}
public static void main(String[] args) {
	PrintBill bill = new PrintBill();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Product Name: ");
	String productName= sc.next();
	System.out.println("Enter Price: ");
	int price = sc.nextInt();
	float gstAmount = bill.calculateGST(price);
	float totalPrice = price + gstAmount;
	
	 System.out.println("Your Product is : " + productName);
	 System.out.println("Your Product Price is : " + price);
	 System.out.println("Your GST Calculated : " + gstAmount);
	 System.out.println("Your Total Price : " + totalPrice);
}
}

