package JavaProgram;

import java.util.Scanner;

public class PrintTheTable {
	
	
	public  void tableOfAnyNum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the correct number: ");
		int j = sc.nextInt();
		
		System.out.println("Table is : ");
		for(int i = 1; i<=10; i++) {
			
			
			System.out.println(i*j);
		
		
		
	}
	}

	public static void main(String[] args) {
		
		
		PrintTheTable pt = new PrintTheTable();
		
		pt.tableOfAnyNum();
			
			
		

	}

}
