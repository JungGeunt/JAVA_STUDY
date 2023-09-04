package day11.quiz;

public class Machine  {

	protected String name ;
	
	
		
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public static void machineWork(remoteControl remocon, Machine  machine) {
			remocon.on();  //리모컨의 on() 메서드
			remocon.off(); //리모컨의 off()메서드 
		}
		
		
}
