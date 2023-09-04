package quiz_class.quiz08_10_2;

public class Wizard extends Player{
	
	
	
	public Wizard(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	 public Wizard(String name) {
		super(name);
		setHp(500);
		setMp(1000);
		
	}

	
	
   
 	
 	@Override
 	public void info() {
 		
 		super.info();
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
