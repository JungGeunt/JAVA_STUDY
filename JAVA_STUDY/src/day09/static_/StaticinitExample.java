package day09.static_;


/*
 * static 정리
 * -변수 ,메서드 , static{} ,클래스에서 사용
 * -static 제한자는 지정된 변수와 메서드를 인스턴스 와 무관하게 만들어 주기 때문에 this를 가질 수 없음.
 * -static 메서드는 non- static 메서드로 재정의 될 수 없음
 * -변수 
 *  >정적 변수 , 여러개의 인스턴스가 모두 동일한 장소를 참조
 *  > final 과 같이 상용되어 상수가 됨
 *  > 객체 생성 없이 참조 가능 
 *  - 메서드 
 *  > 객체 생성 없이 참조(자주 사용하는 메서드들)
 *   >Math 클래스의 메서드들
 *   >static 블럭에서는 non -static 멤버를 직접 참조 못함
 *   > 객체를 생성해해도서도 가능
 *   > static initializer
 *    > static {} 형태
 *    >클래스 가 로딩될 때  딱 한번만 호출, 생성자 호출되기 전에...
 *    -클래스
 *    >내부 클래스 (클래스 안에 클래스)

 */

public class StaticinitExample {

	public static void main(String[] args) {         //출력값
		 StaticInit s1 =new StaticInit();			//static initializer가  수행됨
		 System.out.println(s1);					//Constructor 호출됨
		 StaticInit s2 = new StaticInit();			//day09.static_.StaticInit@2f92e0f4
		 System.out.println(s2);					//Constructor 호출됨
		 System.out.println("main() 메서드 종료!!");	//day09.static_.StaticInit@28a418fc
		 											//main() 메서드 종료!!
		 Instanceinit i1 =new Instanceinit();
		 System.out.println(i1.DATA);  //10 
		 
		 
		 
		 

	}

}
