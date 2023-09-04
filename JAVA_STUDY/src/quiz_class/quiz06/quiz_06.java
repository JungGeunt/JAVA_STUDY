package quiz_class.quiz06;

public class quiz_06 {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("구르미그린달빛", 500, 1000);
		
		Warrior warrior = new Warrior("강한친구대한전사",1000, 500);
		
		wizard.action();
		
		warrior.action();

	}

}
