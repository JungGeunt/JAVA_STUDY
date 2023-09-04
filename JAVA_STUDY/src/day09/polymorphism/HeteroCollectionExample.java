package day09.polymorphism;

public class HeteroCollectionExample {

	public static void main(String[] args) {
		
		Person [] pArr =new Person[4];
		
		pArr[0]= new Person("홍씨",20);
		pArr[1]= new Student("홍학생", 17, "20230001", "도술");
	    pArr[2]= new Teacher("홍선생", 22, "JavaProgramming");
		pArr[3] =new Employee("홍사원",23,"교무처");
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
		
		//출력값
		
//		이름: 홍씨	나이: 20
//		이름 : 홍학생	나이:17	학번:20230001	전공:도술
//		이름 : 홍선생	나이:22	교번:null	과목:JavaProgramming
//		이름: 홍사원	나이: 23	사번:null	부서:교무처
		
		//진화된 포문 
		for (Person p : pArr) {
			System.out.println(p.getDetails());
		}

	}

}
