package day19.lamda;

public class LamdaFunctionEx {

	public static void main(String[] args) {
		
		InterfaceEx ie = (int x , int y) -> x+y; //람다식 
		
		//기본 자바 표현 
		InterfaceEx ie2 = new InterfaceEx() { //익명클래스로 선언
			@Override
			public int sum(int x, int y) {
				
				return x + y;
			}
		};
		
		System.out.println(ie.sum(1, 2));
		System.out.println(ie2.sum(1, 2));
	}

}


//함수적 인터페이스 : 추상메서드 한 개를 가지고 있는 인터페이스
interface InterfaceEx{
	public int sum(int x, int y);
}