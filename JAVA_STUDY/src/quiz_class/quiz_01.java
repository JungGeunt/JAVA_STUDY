package quiz_class;

public class quiz_01 {

	public static void main(String[] args) {
		
		info();
		info2();
		
		
	}

	
	
	static void Bread(int price, String name) {
		System.out.println(price + "원");
		System.out.println(name);
	}
	
	static void info() {
		Bread(500 ,"피자빵" );
	}
	
	
	static void info2() {
		Bread(1500, "딸기케잌");
	}
	
}
