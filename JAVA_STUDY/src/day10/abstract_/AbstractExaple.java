package day10.abstract_;


// 자바에서의 abstract의 의미
//사용자 정의 클래스를 정의 할 때 , 굳이 abstract를 설계 할 필요 없다.
//하지만 , 자바 내부에 많은 클래스는 abstract클래스로 정의되어 있습니다.
//또한 , 자식 클래스를 생성해서 부모클래스 (추상 클래스)에 저장해서 사용가능 하다는 점에 익숙해져야함.




public class AbstractExaple {   

	public static void main(String[] args) { 
		Shape circle = new Circle(10);		 
											 
		System.out.println("원의 넓이는 : " + circle.getArea());
		System.out.println("도형의 위치는 : " +circle.position());

	}

}
