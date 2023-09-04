package day08.quiz;

public class AirplanTest {

	public static void main(String[] args) {
		 //비행기 SuperSonicAp
		SuperSonicAp a1 =new SuperSonicAp("소닉");
		
		a1.takeoff();
		a1.fly();
		a1.flyMode=1;
		a1.fly();
		a1.flyMode=0;
		a1.fly();
		
		a1.land();
		
		
		
		

	}

}
