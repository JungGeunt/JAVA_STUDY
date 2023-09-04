package quiz_class.quiz06;

public class Wizard extends Player{
	public Wizard(String name, int hp ,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
}
 	@Override
 	public void info() {
 		System.out.println("----마법사 ----");
 		System.out.println("케릭명 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " +mp);
 		System.out.println("얼음 화살 사용");
 	}
	
	
	public void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	
	@Override
	public void action() {
		System.out.println("-----마법사-----");
		System.out.println("마법사는 귀여운 동작을 합니다.");
	}
	
}
