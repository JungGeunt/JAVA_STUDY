package day08.inheritance.badcase;

public class Teacher {
	//이름 , 아니 ,교번 ,담당 과목
	
	String name;
	int age;
	String teacherId;
	String subject;
	
	public String getDetails() {
		return "이름 : " + name +"\t나이:"+age +"\t교번:" +teacherId +"\t과목:" +subject;
	}

}
