package day09.static_;

public class StaticVarExample {
		//static 변수 예제 
	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++; //이태리체로 나온 것은 스태틱                                               //b는 static 이기때문에  공통으로 사용
		System.out.println("Non - static a : " +c1.a); //Non - static a : 1
		System.out.println("static b : " +c1.b);	   //static b : 1
		
		Count c2 =new Count();
		c2.a++;
		c2.b++;
		System.out.println("Non - static a : " +c2.a); //Non - static a : 1
		System.out.println("static b : " +c2.b);	   //static b : 2
		
		Count.b++;
		System.out.println("c1.b : " + c1.b );		  // c1.b : 3
		System.out.println("c2.b : " + c2.b );        // c2.b : 3
		System.out.println("Count.b : " + Count.b );  // Count.b : 3
													  //static b 같은 주소 공간을 가지고있음.
	                                                  // 만들때부터 주소값을 만들어놓음 -> 새로운 값을 만들지 않고 만들어진 주소 사용	
	}

}
