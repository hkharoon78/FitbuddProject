package JavaProgram;

import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number = ");
		int num = sc.nextInt();
		
		
		if(num%5==0) {
			
			System.out.println("number is divisbile");
			
			
		}
		
		else {
			
			System.out.println("number is not divisible");
		}

	}

}
