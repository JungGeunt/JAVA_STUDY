package quiz_class.quiz08_10_2;


public class quiz_08 {

	public static void main(String[] args) {
		// 생성자 this를 사용
		System.out.println("-------마법사 ---------");
       Wizard wizard = new Wizard("구르미그린달빛");
		
		wizard.info();
		
		System.out.println("-------전사----------");
		Warrior warrior = new Warrior("강한친구대한전사");

		warrior.info();
	}

}
