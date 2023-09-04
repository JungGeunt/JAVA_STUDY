package quiz;

public class Quiz09 {

	public static void main(String[] args) {
		//1. 1~100까지 3의 배수의 합을 구하세요. (if 사용)
		//2. 3항 연산식 을 이용해서도 구해보세요.
		int sum =0; 
		for(int i=1; i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
			
		}
		
		System.out.println(sum);
		
		
		sum=0;
		for(int i=1; i<=100; i++) {
			int ab =(i%3==0)? sum+=i : 0;
			
		}
		System.out.println(sum);
	}
		
	
	
}
