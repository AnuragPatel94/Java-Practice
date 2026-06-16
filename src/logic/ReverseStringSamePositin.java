package logic;

public class ReverseStringSamePositin {
	//Reverse String with same position (Hello Java  --> olleH  avaJ )

	public static void main(String[] args) {
		//Hello Java  --> olleH avaJ
		String str = "Hello Java";
		String revStr = "";
		
		for (int i = str.length()-1; i >= 0; i=i-1) 
		{
			revStr = revStr + str.charAt(i);
		}
		String[] words = revStr.split(" ");
		String newStr = words[1] + " " + words[0];
		System.out.println("Reverse String with same position: " + newStr);
	}

}
