package JavaProgram;

import java.util.Scanner;

public class ReverseString {
	
	
	public void revNumber() {
		
		
		
Scanner sc = new Scanner(System.in);
System.out.println("Please enter number : ");

long num = sc.nextInt();

long rev = 0;

while(num!=0) {

rev = rev*10+num%10;
num = num/10;


			
		}
		
		System.out.println(rev);
		
	
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.revNumber();
	
	}
}
