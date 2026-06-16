package logic;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 0, 5, 6 ,-5, -10, 15 };
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);

	}

}
