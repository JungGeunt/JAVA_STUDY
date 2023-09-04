package quiz_class.quiz08_10_2;

public class Warrior extends Player{
	
	
	public Warrior(String name) {
		super(name);
		setHp(1000);
		setMp(500);
		
	}
	
	
	
 	public Warrior(String name, int hp, int mp) {
		super(name, hp, mp);
		
	}
	
@Override
public void info() {
	
	super.info();
}
 	
//	
	
	public void  bash(Player play) {
		if(getMp()>=100) {
	System.out.println(name +"배쉬 스킬 적중");
	
	if(play instanceof Warrior ) {
		 play.setHp(play.getHp()-200);
		 return;
	}else if (play instanceof Wizard) {
		play.setHp(play.getHp()-400);
		return;
	}
	  this.setMp(getMp()-100);
	  return;
	}else {
		System.out.println("마나가 부족합니다.");
		return;
	}
	}
	@Override
	public void action() {
		System.out.println("-----전사-----");
		System.out.println("전사는 멋진 동작을 합니다.");
		
		
		
	}
}
