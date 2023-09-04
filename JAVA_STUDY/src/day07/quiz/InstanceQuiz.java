package day07.quiz;

public class InstanceQuiz {

	/*
	 * 다음에 설명하는 객체에 클래스를 생성하여 확인하세요.
	 * 
	 * 모니터 클래스를 생성 !!! 
	 *  -모니터는 해상도, 크기 ,밝기 ,상태 (on/off)속성을 사짐
	 * - 모니터는 기본적으로 해상도, 크기 ,밝기 값을 100. 상태는 off를 가리킴
	 * - 모니터에는 버튼을 누르는 메서드. 즉, 전원 on/off기능이 존재함.
	 * 	해단 메서드 실행시 전원이 켜져있다면 꺼지고 ,꺼져있다면 켜져야함.
	 */
	
	public static void main(String[] args) {
		
	Monitor monitor =new Monitor( "4K", 32, 100, false);
	
	System.out.println("모니터 기본 값 : 해상도- " + monitor.getResolution()+ ", 사이즈-"+ monitor.getSize()+ 
								", 밝기-"+ monitor.getBrightness()+ ", 전원-"+ monitor.on_off );
	
	//전원 버튼 클릭
	monitor.pressPowerButton();
	System.out.println(monitor.on_off);
}
}
