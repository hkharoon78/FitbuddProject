package JavaProgram;

public class FinalMethod {
	
	 void intMed1() {
		
		System.out.println("Final medhod is a class");
		
	}
	
	class FinalMedhod1 extends FinalMethod {
		
		 void intMed1() {
			
			System.out.println("Final Method is a calass 2");
		}
		
		}

	public static void main(String[] args) {
		
		FinalMethod fm = new FinalMethod();
		fm.intMed1();
		

	}

}
