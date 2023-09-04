package quiz;

public class Quiz13_1 {

	public static void main(String[] args) {

	 for(int i =1; i<10; i+=3) {
		 
		 for(int j=1; j<=9; j++) {
			 System.out.println(i+ " x " + j+ " = " + i*j +"\t"  +  
					 		(i+1) + " x " + j+ " = " + i*(i+1) +"\t" +
					 		(i+2) + " x " + j+ " = " + i*(i+2) +"\t"); 	
		 }
		 System.out.println();
	 }
	
	 }
	}


