package quiz;



public class quiz20 {

	public static void main(String[] args) {
		System.out.println("3의 약수의 개수 : " +primeNum(3));
	}
	static int  primeNum(int a) {
		int result = 0;
		int cnt;
		for (int i = 2; i <= a; i++) {
			cnt = 0;  
			for(int j=1; j<=i;j++) { 
				if(i%j == 0) {
					cnt++;
					if(cnt >2) break;
				}
				if(cnt ==2) {
					result++;
				}
			}
			
			
			}
		return result;
	}
		
}
	

