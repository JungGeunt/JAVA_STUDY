package day09.polymorphism;

public class ObjectCollectionExample {

	public static void main(String[] args) {
		// Object 객체 배열 선언 
		Object[] objArr = new Object[5];
																//출력값
		objArr[0] = new Person("홍길동", 30); 					//Person [name = 홍길동, age =30] 오버라이딩되어있기때문에
		objArr[1] = new Student("홍학생", 25,"20230001","java");  //Student [name = 홍학생, age =25, 학번=20230001, 전공 =java]
		objArr[2] = new Integer(100);							//100;
		objArr[3] = new String("홍길동");							//홍길동;
		objArr[4] = new java.util.Date();						//Tue Aug 29 12:40:43 KST 2023
		
		for(int i =0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
				
		}
	}

}
