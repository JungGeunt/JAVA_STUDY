package day11.quiz.animal;

public class Shark extends MarineAnimal implements Animal {

	@Override
	public void eat() {
		System.out.println("상어는 물고기를 먹습니다 ");
	}

	@Override
	public void sleep() {
		System.out.println("상어는 잠을 잡니다.");
	}

	

}
