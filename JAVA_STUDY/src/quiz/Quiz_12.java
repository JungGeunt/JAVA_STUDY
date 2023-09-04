package quiz;

import java.util.Scanner;

public class Quiz_12 {

	public static void main(String[] args) {
		
		System.out.println("정수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int s =scan.nextInt();

			int cnt=0;
				for (int i = 1; i <= s; i++) {
						if(s % i == 0) {
							cnt++;
		
					}
							
					}
				if(cnt == 2) {
					System.out.println(s +"은 소수입니다.");
				}else {
					System.out.println(s+"은 소수가 아닙니다.");
				}
					
						

	}

}
