package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class AnnoyVarExample {

	private Frame f;
	
	public AnnoyVarExample() {
		f = new Frame("AnnoymousVar Class");
	}
		//handler 는 인스턴트 변수
	WindowAdapter handler =new WindowAdapter() { //익명클래스 -(임시객체) 중가로가 붙은 이유 ->추상 클래스를 구현 하기위해서   
		public void windowClosing(java.awt.event.WindowEvent e) {
			System.out.println("종료!!");
			System.exit(0);
		};
	};
		public void launchFrame() {
			f.addWindowListener(handler);
			f.setSize(300, 200);
			f.setVisible(true);
		}
	
	public static void main(String[] args) {
		// 익명 클래스를 변수에 넣음
		AnnoymouseExample ave = new AnnoymouseExample();
		ave.launcherFrame();
		
	}

}
