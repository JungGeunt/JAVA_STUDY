package day10.Interface_;

public class Triangle implements Shape {

	
	int width;
	int height;
	
	public Triangle(int width, int height) {
		this.width =width;
		this.height=height;
	}
	
	@Override
	public double getArea() { //추상메서드 반드시 정의
		return  width* height /2;
	}

}
