package day11.quiz.animal;

public abstract class Test {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Goldfish goldfish = new  Goldfish();
		Tiger tiger = new Tiger();
		Shark shark = new  Shark();
		
		dog.run();
		dog.eat();
		dog.sleep();
		goldfish.swim();
		goldfish.eat();
		goldfish.sleep();

	}

}
