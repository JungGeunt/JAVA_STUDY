package day10.Interface_;

public class InterfaceMemberExample implements ISomething {

	
	
	@Override
	public void run() { // 재정의 해주어야 함 
//		My_INT = 33; // ISomthing 인터페이스의 final 변수임
		System.out.println("run() : " + ISomething.A);

	}
	
	
	public static void main(String [] args) {					//출력값	
		System.out.println(ISomething.My_INT);					//22
		System.out.println(InterfaceMemberExample.My_INT);		//22
		ISomething is = new InterfaceMemberExample();
		is.run();												//run() : 11
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run();												//run() : 11
	}

}
