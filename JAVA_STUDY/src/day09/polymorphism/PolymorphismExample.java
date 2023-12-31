package day09.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		// 다형성 테스트
		
		Person p = new Student("홍학생", 17, "20230001", "도술");
		p.walk(); // 부모 클래스인 Person에 있는 메서드 
//		p.study(); // p는 다형적 객체이므로 부모 클래스에 있는 메서드만 사용 할 수 있어요
		Student casting =(Student)p; 
		//study()는 Student만 가진 메서드로 캐스팅을 통해서 형변환 후 사용가능
		casting.study();
		
		//출력값
//		홍학생는 걸어가요
//		홍학생은 학생은 공부합니다.

		
	}

}
