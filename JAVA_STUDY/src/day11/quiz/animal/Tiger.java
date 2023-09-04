package day11.quiz.animal;

public class Tiger extends LandAnimal implements Animal {

	

	@Override
	public void eat() {
		System.out.println("호랑이는 고기를먹습니다");
		
	}

	@Override
	public void sleep() {
		System.out.println("호랑이는 잠을 잡니다 ");
		
	}

	
	
	
}
