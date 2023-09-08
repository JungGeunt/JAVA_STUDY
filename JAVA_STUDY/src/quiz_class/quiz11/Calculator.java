package quiz_class.quiz11;

public class Calculator {
     
	int result; //누적 시킬 멤버 변수
	 public static double pi =3.14;
	static double result2;
	 
	 
	int add(int a) {
		result +=a;
		return result;
	}
	
	int add(int a , int b) {
		result += a+b; //result =result +a +b;
		return result;
		
	}
	
	int add(int a , int b, int c) {
		result += a+b+ c; 
		return result;
	}
	
	int add(int a , int b, int c, int d) {
		result += a+b+ c+d; 
		return result;
	}
	
	public static double circle(int a) {
		result2 =2*a*pi;
		return result2;
	}
	
	
	
}
