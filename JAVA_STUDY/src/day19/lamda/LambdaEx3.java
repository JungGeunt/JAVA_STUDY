package day19.lamda;

public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 li3 =(String name)-> {
			System.out.println("제 이름은" + name + "입니다.");
		};

		LambdaInterface3 li32 = name -> System.out.println("제 이름은" + name + "입니다.");
		
		li3.print("홍길동");
		li32.print("이순신");
	}

}
@FunctionalInterface
interface LambdaInterface3{
	void print (String name);
	//void print(); 어노테이션으로 함수적 인터페이스를 쓴다고 표시해줬기때문에  오류가뜸
}
