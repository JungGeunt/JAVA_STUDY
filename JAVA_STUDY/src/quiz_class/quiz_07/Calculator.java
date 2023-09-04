package quiz_class.quiz_07;

public class Calculator extends Add{

	int result ;
	
	@Override
	int add(int a) {
		return result += a;
	}
	
	int add(int a, int b) {
		
		return result +=(a +b);
	}
	
	int add(int a, int b ,int c) {
		return result +=(a +b +c);
	}
	int add(int a, int b ,int c , int d) {
		return result +=(a +b +c +d);
	}
	
}
