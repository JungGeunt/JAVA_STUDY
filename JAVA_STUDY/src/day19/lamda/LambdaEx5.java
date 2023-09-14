package day19.lamda;

public class LambdaEx5 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}


@FunctionalInterface
interface LambdaInterface5{
	void method();
}

class Outer{
	public int iv =10;
	void method() {
		final int iv =40;
		LambdaInterface5 f5 = ()-> {
			System.out.println("Outer.this.iv" + Outer.this.iv);//10
			System.out.println("this.iv :" + this.iv);// 10
			System.out.println("iv : " + iv);//40
		};
		f5.method();
	}
	
}