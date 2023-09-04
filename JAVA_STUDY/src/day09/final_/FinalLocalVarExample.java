package day09.final_;

public class FinalLocalVarExample {
		
	public int data =100;
	
	public static void main (String [] args) {								//출력값
		 new FinalLocalVarExample().doIt("홍길동"); //static 이기 때문에 객체를 생성     //외부 클래스의 멤버변수 data : 100
	}																		//외부 클래스의 파라미터 변수 name : 홍길동
	public void doIt (final String name) {									//외부 클래스의 지역변수 age : 38
			final int age = 38;
			class InnerLocal{
				public void innerDoIt() {
					System.out.println("외부 클래스의 멤버변수 data : " +data);
					System.out.println("외부 클래스의 파라미터 변수 name : " +name);
					System.out.println("외부 클래스의 지역변수 age : " +age);
				}
			}    // 객체             // 메서드
			new InnerLocal().innerDoIt();
	}
	
}
