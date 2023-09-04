package day08.overloading;

public class OverloadExample {

	public static void main(String[] args) {
		//오버로드 테스트
		
		OverloadClass object =new OverloadClass();
		object.abc(100, "자바 ");               //  정수와 문자열이 입력됨
		double d = object.abc(10.0, 11.0);	  //부동 소수점이 입력됨
		System.out.println(d); 			      // 0.0
		object.abc("자바");					  //문자열이 입력됨
		object.abc(100,200); 				  //double 로 형변환이 됨

	}

}
