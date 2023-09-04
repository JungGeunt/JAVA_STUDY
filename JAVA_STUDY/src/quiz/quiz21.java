package quiz;

public class quiz21 {

	public static void main(String[] args) {
		
		System.out.println("7~9d의 사이의 수의 합" + sumNum(7,9));
	}


	static int sumNum(int a, int b) {
		int ab =0;
		if(a==b) {
			return a;	
	}
		int c;
		for(int i = a>b? b:a; i <= (c= a>b? a:b); i++) {
			ab += i;
		}
		return ab;
	}
 
}

   

