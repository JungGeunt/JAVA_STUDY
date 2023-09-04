package day08.inheritance.goodcase;

import day08.inheritance.Person;

public class Student extends Person {

	public String StudentId;
	public String major;
	
	
	public Student() {
		//기본 생성자 , super(); 만드는 단축기 컨트롤 쉬프트
		
	}
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name , int age, String studentId , String major) {
		super(name ,age);
		this.StudentId =studentId;
		this.major=major;
	}
	
	
	
	public String getDetails() {
		return "이름 : " + name +"\t나이:"+age +"\t학번:" +StudentId +"\t전공:" +major;
	}
	
}
