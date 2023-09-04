package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//대표적인 내부 클래스 사용 예제 -JAVA GUI(Graphic User Interface)

//JAVA GUI란?
//- 프로그램을 그래픽화 (프레임창)시켜 작동시키는 것을 말함. 
//AWT(만들기 쉽고 ,무거움) , SWING(만들기 어려움, 가볍움) 패키지
// - Frame 또는 Jframe 클래스를 이용해서 프레임 창을 구현. 각종 이벤트 및 버튼, 패널 , 입력창, 메뉴바, 속성
// 같은 요소들을 각 클래스들을 이용해서 구현
// -Frame (A) 클래스가 각종 구성요소 (B) 클래스 들은 각 프레임 창별로 달라지는 
// 형태로 개별 클래스화 하면 여러 측면에 낭비가 일러날 수 있음.




public class InnerClassExample {

	private Frame f; // Frame 창을 뜻함 
	
	public InnerClassExample( ) {
		f = new Frame("Inner 예제");
	}
	
	public void launchFrame() {                      //내부 클래스 - MyWindowAdaptor 
		f.addWindowListener(new MyWindowAdaptor());  //이벤트 발생을 감지하는  인스턴스 메서드->안에 들어가있는 이벤트 발생 
		f.setSize(300, 200);						   
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		InnerClassExample ie = new InnerClassExample();
		ie.launchFrame();
		
		
	}
	// 멤버 이너 클래스...  ->클래스 안에 존재 하는 클래스  
	// 컴파일시에 같이 컴파일 되고 온전한 클래스이기 때문에 상속 및 다형성 기능 사용이 가능함.
	// 윈도우 어댑터는 띄어놓은 프레임에 최소 , 최대 , x등의 버튼을 누르는 이벤트 처리시 사용!
	// 때문에 프레임을 만들 때  마다 필요 하지만, 각 프레임에 종속되어야 하기 때문에 하나의 클래스로
	// 만들기엔 여러가지 제약이 걸림. 
	
	private class MyWindowAdaptor extends WindowAdapter{ // WindowAdapter(추상 클래스)  상속을 받음 
		@Override
		public void windowClosing(WindowEvent e) { //윈도우 이벤트 발생했을때 x버튼을 누르면  
			System.out.println("x를 눌렀어요!!!"); //->출력됨 
			System.exit(0); //시스템을 끔.
		}
	}
	
	

}
