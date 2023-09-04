package day11.quiz;

public class AnonymousEx1 {
	//익명클래스와 인터페이스 
	public static void main(String[] args) {
		
		Machine tv = new TV("TV");
		Machine computer = new Machine();
		
		Machine.machineWork(new remoteControl() { //익명 클래스 
			
			@Override
			public void on() {
				System.out.println(tv.getName() + "를 켭니다.");
				
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName() + "를 끕니다.");
				
			}
			
		}, tv); 
		
		Machine.machineWork(new remoteControl() {
			
			@Override
			public void on() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 켭니다.");
				
			}
		}, computer);
		

	}

}
