package logic;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "malayalam";
		String str1 = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(str1.indexOf(ch) == -1)
			{
				str1 = str1 + ch;
			}
		}
		
		System.out.println("String after remove duplicates =" +str1);

	}

}
