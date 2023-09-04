package quiz;

public class quiz17 {

	public static void main(String[] args) {
		method1();
		System.out.println(method2("Hello"));
		System.out.println(method3(1, 2, 0.0));
		System.out.println(method4(1));
		method5("Hello", 1);
		System.out.println(method6(1));
		int[] i = {1,2,3};
		System.out.println(method7(i));
		System.out.println(method8("Hello", "JAVA"));
		System.out.println(maxNum(1, 2));
		System.out.println(abs(-1));

	}
	
static void method1() {
	System.out.println("안녕");
}

static String method2(String str) {
	return str;	
}
static  double method3(int i,int j, double k) {
	return i+j+k;
}
static String method4(int i) {
	return i%2==0? "짝수": "홀수";
}
static void method5(String str, int i) {
	for(int j=0; j<=i; j++) {
		System.out.println(str);
	}
}
static int maxNum(int i, int j) {
	return i>j? i:j;
}
static int abs (int i) {
	return i>0? i :-i;
}
static int method6(int i) {
	int sum=0;
	for(int j=0; j<=i; j++) {
		sum+=j;
	}
	return sum;
}
static int method7(int[] i) {
	return i.length;
}

static String[] method8 (String i ,String j) {
	String[] k = {i,j};
	return k;
}

}
