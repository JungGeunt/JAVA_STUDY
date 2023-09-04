package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerLocalExample {
		
	private Frame f;
	
	public InnerLocalExample() {
		f =new Frame("Inner Local Class");
	}
	public void launcherFrame() {
		//Inner Local Class : 완전한 클래스 형태이기 때문에 클래스와 같은 기능을 함
		//로컬 이너  클래스는 외부에 있는 클래스의 모든 멤버에 대해서 참조 가능함.
		//다만, 지역변수를 참조 할 때는 지역변수가 Final로 선언 되어야함
		final String btn = "X버튼";   // 서로간의 영향을 줄수 있어서 상수값으로 변화시켜서 넣어줌
		class MyWindowAdapter extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println( btn +"을 클릭했습니다.!!!");
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(500, 600);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		InnerLocalExample le = new InnerLocalExample();
		le.launcherFrame();
	}
	
}
