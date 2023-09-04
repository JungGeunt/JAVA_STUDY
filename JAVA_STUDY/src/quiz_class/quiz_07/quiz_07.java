package quiz_class.quiz_07;

public class quiz_07 {

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		
		cal.add(1);
		System.out.println("call의 누적값:" +cal.result);
		cal.add(2, 3);
		System.out.println("call의 누적값:" +cal.result);
		cal.add(1, 2, 3);
		System.out.println("call의 누적값:" +cal.result);
		cal.add(1, 2, 3, 4);
		System.out.println("call의 누적값:" +cal.result);

	}

}
