package testingbaba;

public class PrintTable{
	
	public void printnumber()
	{
		for (int i = 1; i <= 10; i=i+1) 
		{
		System.out.println(i);
		}
	}
	
	public void printreversenumber()
	{
		for (int i = 10; i >= 1; i=i-1) 
		{
		System.out.println(i);
		}
	}
	
	public void printtable()
	{
		for (int i = 1; i <= 10; i=i+1) 
		{
		System.out.println("2*"+i+"="+ (2*i));
		}
	}
	
	public void printStr()
	{
	    for (int i = 1; i <= 10; i=i+1) 
		{
		System.out.println("Piyush"+i);
		}
	}
	
	

	public static void main(String[] args) {
		PrintTable objt = new PrintTable();
		objt.printnumber();
		objt.printreversenumber();
		objt.printtable();
		objt.printStr();
		
		
		
		}
	
	
	
	}
	


