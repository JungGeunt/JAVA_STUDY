package day09.encapsulation.goodcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth = new MyDate();
//		myBirth.day =32; //접근제한자 :private
		myBirth.setDay(3);
		myBirth.setDay(32);
		

		//출력값
//		My birth day is 3
//		잘못 된 날짜를 입력했습니다.1
	}

}
