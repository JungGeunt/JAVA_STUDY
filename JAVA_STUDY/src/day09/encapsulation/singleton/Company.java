package day09.encapsulation.singleton;

public class Company {

		private String str ;
		private static Company c =new Company(); // 1. Company객체 멤버생성 (클래스 멤버 변수)  
		
		private Company ( ) {						//2. 생성자를 private으로 설정
			str = "company";
			System.out.println(str);
			
		}
		public static Company getCompany() {		//3. public static을 통해서 객체 전달 (클래스 멤버 변수) 
			return c;
		}
	
	// (클래스 멤버 변수) (클래스 멤버 변수) 는 객체를 생성하지 않아도 쓸수는 클래스와 변수가 만들어짐.

}
