package JavaProgram;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);	
		System.out.println("Please enter the  value: ");
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		int num3 = sc1.nextInt();
				
		
		if(num1>=num2 && num1>=num3) {
			
		System.out.println("num1 is greater :" + num1);
			
			
		}
		else if(num2>=num1 && num2>=num3) {
			
			
			System.out.println("num2 is greater: " + num2);
		}
		else {
			
			System.out.println("num3 is greater: " + num3);
		}
		
		
	}

}
