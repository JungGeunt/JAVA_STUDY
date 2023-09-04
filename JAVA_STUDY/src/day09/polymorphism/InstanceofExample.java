package day09.polymorphism;

public class InstanceofExample {

	public static void main(String[] args) {

		Student s= new Student("홍학생",17 , "20230001", "JAVA");   
		printPersonInfo(s);
		Teacher t = new Teacher("홍선생", 22, "java Prograamming");
		printPersonInfo(t);
		Employee e = new Employee("홍직원",23, "교무처");
		printPersonInfo(e);
		//출력 값 
//		*************** Student Info*******************
//		Student [name = 홍학생, age =17, 학번=20230001, 전공 =JAVA]
//		이름 : 홍학생	나이:17	학번:20230001	전공:JAVA
//		***************************************************
//		*************** Teacher Info*******************
//		Person [name = 홍선생, age =22]
//		이름 : 홍선생	나이:22	교번:null	과목:java Prograamming
//		***************************************************
//		*************** Emplyee Info*******************
//		Person [name = 홍직원, age =23]
//		이름: 홍직원	나이: 23	사번:null	부서:교무처
//		***************************************************
	}
	
	// 다형적 인자 별로 출력하는 메서드
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("*************** Student Info*******************");
		}else if(p instanceof Teacher) {
			System.out.println("*************** Teacher Info*******************");
		}else if(p instanceof Employee) {
			System.out.println("*************** Emplyee Info*******************");
		}else {
			System.out.println("*************** Person Info*******************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("***************************************************");
	}

}
