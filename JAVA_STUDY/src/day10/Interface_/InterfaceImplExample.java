package day10.Interface_;

/*
 * 인터페이스 정리 
 * - 단일 상속 문제점을 해결 할 수 있음 
 * - 인터페이스 메서드는 추상 메서드 여야 함.
 * - 인터페이스의 변수는 자동으로 상수가 됨
 * - 인터페이스 구현 할 떄는 implements
 * - 인터페이스를 여러개 implements할 수 있다.
 * - 인터페이스는 다른 인터페이스 여러개를 extends 할 수 있다.(상속)
 * *** 기능의 명세를 위해서 사용합니다.***
 * 
 *  
 */


public class InterfaceImplExample {
	
	public static void main(String [] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo ; // 다형성이 적용 됨.
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4();  //Error -IToDo3는 m4()가 없기때문 
		IToDO4 itodo4 = todo;
		itodo4.m4();     //부모객체에 들어 가때 자식이 가지고 있을수 있지만 부모객체는 모르기때문에 쓸수 없음
	}
}
