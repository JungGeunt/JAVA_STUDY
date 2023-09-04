package day09.final_;

public class FinalRefVarExample {

	static final MyDate date = new MyDate(); //date 레퍼런스 변수 -> 참조 변수 
	
	public static void main(String[] args) { 
		//date = new MyDate(); // final이여서 객체를 새로 만들 수 없음. 
		date.year =2024;       // 만들어진 객체를 사용하는건 가능  
		System.out.println(date.toString()); //final은 변수 값은 바꿀 수 없지만  주소안에 값은 바꿀 수있음
		

	}

}

class MyDate {
	int year =2023;
	int month =1;
	int day =1 ;
	
	public String toString() {
		 return "[" +year + "-" + month + "-" + day + "]" ;
	}
	
	public void doIt(final int a) {
//		a++;  //final로  변수 설정 했기때문에 Error
	}
}
