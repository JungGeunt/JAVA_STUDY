package day08.inheritance;

import day08.inheritance.goodcase.Employee;
import day08.inheritance.goodcase.Student;
import day08.inheritance.goodcase.Teacher;

public class inheritanceExample {

	public static void main(String[] args) {
		//상속예제
		
//		Person p = new Person();
//		p.name ="홍길동";
//		p.age =25;
//		p.height =179.8F; // protected
//		p.weight = 70f; // default
		
		//생성자는 객체 동기화를 시켜서 맴버변수를 초기화 작업을 시킴 
		Person p = new Person("홍길동", 25, 179.8f); // 들어간 값은 속성 
		System.out.println(p.getDetails());
		
		
		
//		Student s= new Student();
//		s.name = "이순신";
//		s.age = 30;
		Student s= new Student("이순신", 30, "20230828", "해양학과");
//		s.StudentId = "20230828";
//		s.major = "해양학과";
		s.height = 174.6f;//protected 
//		s.weight =90f; //접근제한자가 default이기 때문에 자식이 상속받지 못함.
		System.out.println(s.getDetails());
		
		Student s2 =new Student();  		//생성자를 만들지 않으면 
		System.out.println(s2.getDetails()); //부모 생성자의 값이 들어옴 

		Teacher t =new Teacher();
		t.name = "강감찬";
		t.age = 40;
		t.subject = "자바 프로그래밍";
		t.teacherId ="202311011";
		System.out.println(t.getDetails());
		
		Employee e= new Employee();
		e.name = "김덕우";
		e.age= 45;
		e.companyId ="20210112000";
		e.department ="강사부";
		System.out.println(e.getDetails());
		
	}

}
