package day08.inheritance.overriding;

import java.sql.Struct;

public class OverridngMain {

	public static void main(String[] args) {
		 
		 
		Person p1 =new Person();
		p1.name = "홍길동";
		p1.age = 18;
		System.out.println(p1);
		System.out.println(p1.getDetails());
	
		//day08.inheritance.overriding.Person@2f92e0f4 해쉬값
		//이름: 홍길동	나이: 18

		
		//오버라이드
		Student st1 = new Student();
		st1.name = "홍제자";
		st1.age =14;
		st1.studentId = "first";
		st1.major = "도술";
		System.out.println(st1);
		System.out.println(st1.getDetails());  // -> student의 getDetails
		
		
	}

}
