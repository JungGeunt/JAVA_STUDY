package quiz_class.quiz06;

public class Player {

	String name;
	int hp;
	int mp;
	
	 public void info() {
		System.out.println("케릭명 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " +mp);
	}
	
	public void action() {
		System.out.println("동작을 합니다.");
	}
	
}
