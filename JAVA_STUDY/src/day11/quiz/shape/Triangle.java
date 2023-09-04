package day11.quiz.shape;

public class Triangle extends Shape {

	protected int z ;
	public Triangle(int x , int y ) {
		this.x=x;
		this.y=y;
		z=0;
	}
	
	
	@Override
	public void showPosition() {
		System.out.println("x 좌표 : "+ x+ "y 좌표 :" + y + "z좌표 :" +z );
	}
	
	
	
	public double getArea() {
		double result=(x-z)*(y-z)/2;
		return result;
		
	}

}
