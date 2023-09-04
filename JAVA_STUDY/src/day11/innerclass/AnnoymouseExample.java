package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnnoymouseExample {

	
	private Frame f;
	
	public AnnoymouseExample() {
		f = new Frame("Annonymous Class");
	}
	
	public void launcherFrame() {
		//익명 클래스 사용!!! - 익명클래스는 이름이 없기 때문에 생성자도 가지지 않고 , 호출 및 상속을 할 수 없음
		//생성자를 가지지 않고, 인스턴스를 만들어야 하기 때문에 이미 만들어진 인터페이스나 클래스를 상속 또는 구현
		//해서 만들어야 합니다. 내부 클래스와 달리 호출도 필요없는 , 여러번이 아닌 한 번만 사용 할 클래스에 
		//주로 사용됩니다. 또는 클래스 내부에 메서드를 재정의 하기 용이해 함수형 프로그램과 비슷하게 활용 할 수 있습니다.
		//인터페이스와 익명 클래스를 같이 사용한다면 여러 상황에서 쓰일 수있느는 유틸리티 클래스를 만들 수 있음.
								
												 //익명 클래스 -(임시 객체) 객체형태를 취하면서 특정 동작을 할 수있음. 		
		f.addWindowListener(new WindowAdapter() { //WidowAdaprer(추상 클래스) - 구현하는 코드가 없음     
			@Override							  //기능에 대한 명세를 정의해줘야 쓸수 있음  
			public void windowClosing(WindowEvent e) { 
				System.out.println("종료버튼을  눌렀어요!!!");		//한 번 쓰고 버리는 형태 
				System.exit(0);
			}
		});
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AnnoymouseExample le =new AnnoymouseExample();
		le.launcherFrame();
		

	}

}
