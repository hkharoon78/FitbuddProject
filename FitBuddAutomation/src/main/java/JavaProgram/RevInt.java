package JavaProgram;

public class RevInt {
	
	
	public static void revIntegerNum(int num) {
		
		int rev=0;
		//int num = 12345;
		while(num!=0) {
			
			rev = rev*10+num%10;
			num = num/10;
			
			
			
		}
		
		System.out.println(rev);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		revIntegerNum(12345);
		
		

	}

}
