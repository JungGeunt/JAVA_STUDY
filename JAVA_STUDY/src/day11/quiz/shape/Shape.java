package day11.quiz.shape;

public abstract class Shape {
		
	protected int x;
	protected int y;
	
	public void showPosition( ) {
		System.out.println("x 좌표 : "+ x+ "y 좌표 :" + y);
	}
	
	public abstract double getArea();
	
}
