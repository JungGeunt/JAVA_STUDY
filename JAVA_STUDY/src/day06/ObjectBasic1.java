package day06;

public class ObjectBasic1 {

	//객체 지향 - 현실세계에 모든 것을 객체로 간주하고, 이  객체를 속성(멤버 변수)과 행위(메서드)를 갖는
	// 			소프트웨어적 개념으로 표현한 갓
	//연필이라는 물체(클래스)에는 연필의 색깔, 굵기 라는 속성(멤버변수)
	//연필이 가지고 있는 쓰는 기능 (메소드)
	
	//클래스는 객체를 만들기 위한"설계도" 또는 "명세서"라고 할 수 도 있음.
	//-실제 물체의 추상화를 통해 프로그램에 사용할 수있는 코드 형태로 만들어 둔것
	
	//객체의 명사적 특징- 변수(멤버병수), 필드, 속성
	//객체의 동사적 특징 - 메서드, 행위 ,기능 
	
	
	//클래스를 사용하는 이유?
	//- 대량으로 코드를 반복적으로 사용하는경우에 사전에 틀을 만들어서 사용하기 위해
	// -코드를 최소화 하여 작업하기 위해서... 
	
	/*구조 (틀)
	 * <modifiers> class ,className{
	 * 	ClassBody;
	 * 	 // attrobutes -멤버변수 ,속성, 필드 
	 * 	// constructors -생성자
	 * 	//methods -메서드 , 행위 ,기능
	 *  }
	 *   	속성 : 객체가 가지고 있는 명사적 특성
	 * 		생성자 : 클래스를 통해 객체를 생성하기 위해서 사용하는것
	 * 		매서드 : 객체가 가지고 있는 동사적 특성.
	 * 
	 * 	< modifiers> : 제한자로 public ,protected ,default(공백) , pravate 등으로 접급 제한자
	 * 					접근 레베을 지정합니다.
	 * 		-public : 같은 퍀키지가 아니여도 어느 클래스에서나 참조 가능하도록 한다.
	 * 	-protected : 같은 패키지 내에 클래스만 참조 가능하고, 자식 클래스가 다른 패키지에 있을 경우,
	 * 				그 자식도 참조가 가능한 경우
	 * 		-default(공백): 같은 패키지 내의 클래스에서만 참조가능.
	 * 		-private: 같은 클래스 내에서만 참조 가능.
	 * 
	 * 
	 * 
	 */		 
	
//	public static void main(String[] args) {
//		// 클래스 class ->  
//		//계산기 사용...
//		
//		Calculator cal1 =new Calculator();
//		cal1 .add(10);
//		int result = cal1.result;
//		
//		Calculator cal2 =new Calculator();
//		
//		System.out.println(cal1.equals(cal2)); //같은 클래스로 만들어졌어도 값이 다르다.
//		
//	}
//	//1번 계산기
//	
//	static int result =0;
//	static int add1 (int n) { //메서드
//			result +=n;
//			return result +1;
//	}
//	
//
//	//2번 계산기
//	static int result2 =0;
//	static int add2 (int n) {
//		result2 +=2;
//		return result2;
//	}
//	
//	 class Calculator {
//
// 		int result =0; // default 접근 제한자 
//		int add(int n) {
//			result +=n;
//			return result;
//		}
//}
}