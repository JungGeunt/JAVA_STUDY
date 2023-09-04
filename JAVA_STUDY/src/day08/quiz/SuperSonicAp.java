package day08.quiz;

public class SuperSonicAp  extends Airplane{
	


	int flyMode;
	
	public SuperSonicAp(String name) {
		super(name);
	}
		

	@Override
	void fly() {
		if(flyMode==0) {
			super.fly();
		}else if(flyMode ==1)System.out.println("비행기가 이륙합니다");
		
	}
	

}
