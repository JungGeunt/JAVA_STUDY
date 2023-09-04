package day08.inheritance.overriding;

public class Person {

	protected String name;
	protected int age;  //protected는 상속관계에서 접근 o
	
	public String getDetails() {
		return "이름: " +name+"\t나이: "+age;
	}
}
