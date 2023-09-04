package day09.polymorphism;

public class PolymorphismExample2 {

	public static void main(String[] args) {
		
		Person p;
		p= new Teacher("홍선생 ",22,"Java Programming");   // 출력값
		System.out.println(p instanceof Person);        //		true
		System.out.println(p instanceof Teacher);		//		true
		System.out.println(p.getDetails());				//      이름 : 홍선생 	나이:22	교번:null	과목:Java Programming
		
		p= new Employee("홍사원",23,"교무처");
		System.out.println(p instanceof Person);		//		true
		System.out.println(p instanceof Employee);		//		true
		System.out.println(p.getDetails());				//		이름: 홍사원	나이: 23	사번:null	부서:교무처

		p= new Student("홍학생",17, "2023001", "도술");
		System.out.println(p instanceof Person);		//		true
		System.out.println(p instanceof Student);		//		true
		System.out.println(p.getDetails());				//		이름 : 홍학생	나이:17	학번:2023001	전공:도술
		p.walk();										//		홍학생는 걸어가요
//		p.study();
		
		


	}

}
