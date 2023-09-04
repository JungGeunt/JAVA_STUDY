package day09.encapsulation.goodcase;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	//getter 
	public int getDay() {
		return day;
	}
	
	//setter : 입력 값 검증 
	public void setDay(int day) { //날자를 입력값으로 받아서 처리 
		if((day <= 31) &( day>=1)) {
		this.day = day;
		System.out.println("My birth day is " + day);
	}else {
	
	 this.day = 1;
	 System.out.println("잘못 된 날짜를 입력했습니다." );
	}
	}
	
	
}
