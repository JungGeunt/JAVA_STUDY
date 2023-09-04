package day10.Interface_;

// 인터페이스끼리 다중상속 가능
// 가장 하위 인터페이스를 구현 할 경우 상속관계에 있는 인터페이스들의 모든 메서드를 구현해야 함.


public class ToDo implements IToDo3, IToDO4 {
	// 상속 받은 구연체 까지 모두 다 구현해야함.
	
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1()  구현");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2()  구현");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4()  구현");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3()  구현");
	}

}
