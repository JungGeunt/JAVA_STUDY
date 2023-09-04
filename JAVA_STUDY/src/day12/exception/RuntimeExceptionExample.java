package day12.exception;

public class RuntimeExceptionExample {

	public static int makeException1(int input) { //  java.lang.ArithmeticException
		int divide = 0;            //수학적으로 0으로 나눌수 없음 
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() {  //java.lang.StringIndexOutOfBoundsException
		String s = "가";						//문자열 배열의 값을 넘어가며 나오는 예외
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception{ // java.lang.ArrayIndexOutOfBoundsException
		int [] a = { 1,2,3};			//인트 배열의 값을 넘어가는 
		System.out.println(a[3]);
	}
	
	public static void makeException4() { // java.lang.NullPointerException 
		String nothing = null;			  
		System.out.println(nothing.split("")); //regex 정규표현식 약자
	}
	
	public static void makeException5 () { // java.lang.NumberFormatException
		String notInt= "가나다";			   // 인트 타입에 다른 타입이 들어가서 나오는 예외
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6 () { //java.lang.StackOverflowError
		for(int i = 0; i< Integer.MAX_VALUE; i++) {  //스택공간을 넘쳐서 다른공간을 침입할때
			makeException6();	// 무한대 				//스택- 변수의 저장공간
		}
	}
	public static void makeException7() { // java.lang.ArrayStoreException: 
		Object[] objArr = new String[3];  //배열의 저장 열외 -> 문자열에 정수를 저장할 수 없어서
		objArr[0] = 0 ;					//다형성 -  선언 자체가 오브젝트로 되어 있기 때문에 컴파일 오류를 발생하지 않는다.
	}
	
	public static void makeException8() {//java.lang.ClassCastException
		Object[] objArr = new String[3]; 
		objArr[0] = "0";                 //문자형을 숫자로 형변환 하려고했기때문에 
		Integer a = (Integer) objArr[0]; 
	}
	
	
	public static void main(String[] args) throws Exception{
		//Runtime Exception -Unchecked Exception 
		try {
			makeException1(5);
			makeException2();
			makeException3();
			makeException4();
			makeException5();
			makeException6();
			makeException7();
			 makeException8();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
