package day21.thread;

public class ThreadEx7 {

	public static void main(String[] args) {
		//interrupt() 메서드 : 
		//스레드가 일시 정지 상태에 있을 때,InterruptException 예외발생시켜 정상 종료
		//sleep()메서드를 사용하지 않은 상태의 정지
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i=1;
				while( true){
					System.out.println("t1 : " + i);
				i++;
				if(Thread.interrupted()) { //interrupt() 조건 충족 
					break;//Thread.interrupted() interrupt상태를 확인하는 메서드
				}
				}
				
				System.out.println("스레드 실행 종료");
			}
		});
		//메인 스레드 구간 
		t1.start();
		try {
			Thread.sleep(10000); //10초 일시정지 
		} catch (InterruptedException e) {}
			t1.interrupt();  //t1에 interrupt() 실행 
							

	}

}
