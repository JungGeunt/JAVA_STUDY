package quiz_class.quiz05;

public class Warrior extends Player {

	public Warrior(String name, int hp ,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
}
 	@Override
 	public void info() {
 		System.out.println("-----전사------");
 		System.out.println("케릭명 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " +mp);
 		System.out.println("때리기 스킬 사용");
 	}
	
	
	public void  bash() {
		System.out.println("때리기 스킬 사용");
	}
	
}

