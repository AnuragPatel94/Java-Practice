package sdet_qa;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][]= {
				    {100,200,300},
					{400,500,600},
					{700,800,900},
					{1000,1100,1200},
					{1300,1400,1500}
					};
	System.out.println("Length of Row:"+a.length); //5
	System.out.println("Length of Column:"+a[0].length); //3
	
	/*for(int r=0; r<a.length; r++) {
		for(int c=0; c<a[r].length; c++) {
			System.out.print(a[r][c]+" ");
		}
		System.out.println();

	}*/
	
	
//Enhanced for loop
	for(int x[]:a) {
		for(int y:x) {
			System.out.print(y+" ");
		}
		System.out.println();
	}
	
	
}}
