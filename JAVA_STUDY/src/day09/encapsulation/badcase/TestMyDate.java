package day09.encapsulation.badcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth =new MyDate();
		myBirth.day =32; // 잘못된 데이터 값이 들어갔는데 검증없이 출력 됨
		System.out.println("My birth day is " + myBirth.day);
		
		// 출력 값
		//My birth day is 32

	}

}
