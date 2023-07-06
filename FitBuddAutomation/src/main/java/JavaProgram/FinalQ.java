package JavaProgram;

public class FinalQ {
	
     int num = 40;
     void inNum() {
    	
    	num = 400;
    	System.out.println(num);
    }

	public static void main(String[] args) {
		
		FinalQ fq = new FinalQ();
		fq.inNum();

	}

}
