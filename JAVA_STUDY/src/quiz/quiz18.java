package quiz;

public class quiz18 {

	public static void main(String[] args) {
		String str =java(5);
		System.out.println(str);
		
		}
	static String java(int a) {
		String result ="";
		for(int i= 1; i<=a; i++) {
			String str =(i%2==1)? "자" :"바";
			result += str;
		}
		return result;
	}
}

