package day08.inheritance.badcase;

public class Student {

	
	//이름 , 나이 , 학번 , 학과 
	String name;
	int age;
	String StudentId;
	String major;
	
	public String getDetails() {
		return "이름 : " + name +"\t나이:"+age +"\t학번:" +StudentId +"\t전공:" +major;
	}
	
	
	
}
