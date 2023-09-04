package day10.Interface_;

public class InterfaceExample {

	public static void main(String[] args) {
		Ractangle rect = new Ractangle(20, 34);
		Triangle tri = new Triangle(20,	 34);
		
		Shape s1 = new Ractangle(30, 48) ;  //다형성
																	//출력값
		System.out.println("ract 's Area = " + rect.getArea()); //ract 's Area = 680.0
		System.out.println("tri's Area = " + tri.getArea());	//tri's Area = 340.0
		System.out.println("s1 's Area = " + s1.getArea());		//s1 's Area = 1440.0

	}

}
