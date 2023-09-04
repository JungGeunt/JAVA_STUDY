package day11.quiz.shape;

public class Ractangle extends Shape {

	protected int z;
	protected int w;

	public Ractangle(int x , int y ) {
		this.x=x;
		this.y=y;
		z=0;
		w=0;
	}
	
	
	@Override
	public void showPosition() {
		System.out.println("x 좌표 : "+ x+ "y 좌표 :" + y + "z좌표 :" +z +"a좌표는 : " +w);;
	}
	
	
	@Override
	public double getArea() {
		double result = (x-w)*(y-z);
		return result ;
	}

}
