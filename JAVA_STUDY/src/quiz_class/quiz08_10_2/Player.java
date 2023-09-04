package quiz_class.quiz08_10_2;

public class Player {

	String name;
	 private int hp;
	 private int mp;
	

	public Player(String name, int hp ,int mp ) {
		this.name = name;
		this.hp = hp ;
		this.mp = mp;
	}

	public Player(String name) {
	   this.name =name;
	   getHp();
	  getMp();
	}
	


	public int getHp() {
		return hp;
	}




	public void setHp(int hp) {
		this.hp = hp;
	}




	public int getMp() {
		return mp;
	}




	public void setMp(int mp) {
		this.mp = mp;
	}




	public void info() {
		System.out.println("케릭명 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " +mp);
	}
	
	public void action() {
		System.out.println("동작을 합니다.");
	}
	
}
