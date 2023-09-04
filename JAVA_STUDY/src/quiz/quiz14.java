package quiz;

import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {
		// 1. 정수를 입력 받으세요.
//		2. 2중 for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요.
//		3. 힌트) 입력 받은 수까지 반복, 내부 for문 에서 외부 for문의 수까지 반복( 나누어 떨어지는 수 체크)
		System.out.println("정수를 입력하세요 >");
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		int sum =0;
		int cunt =0;
		for (int i = 2; i <= num; i++) {
			cunt = 0;  // 배수여부 확인
			for(int j=1; j<=i;j++) { 
				if(i%j == 0) {
					cunt++;
				}
			}
			//소수인 경우
			if(cunt == 2) {
				  sum += i;
			
			}
			
		}
		System.out.print(num +"까지의 소수의 합은 : " + sum);
	}

}
