package quiz;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {
		// 1. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
//		2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 지속적으로 문제를 출제한 후 정답이면
//		정답 카운트를 +1 씩, 틀리면 오답 카운트를 +1 씩 올려주는 프로그램을 만드세요.
//		또 한 이 프로그램은 0 을 입력 받으면 반복을 중단(탈출) 합니다.
//		ex) 27 + 84 = ?

		Scanner scan = new Scanner(System.in);
		
		int jungdap = 0;
		int odap = 0;
		
		while(true) {
			int rand = (int)(Math.random() * 100) + 1;
			int rand2 =(int)(Math.random() * 100) + 1;
			int dap = rand +rand2;
			
			System.out.println("---------------------------");
			System.out.println(rand + " + " + rand2 + " = " + "?");
			System.out.println("[ 문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int sdap = scan.nextInt();
			if(sdap==0){
				System.out.println("프로그램을 종료합니다");
				 break;
			}
			if(sdap==dap) {
				System.out.println("정답입니다!!");
				jungdap++;
			}else {
				System.out.println("틀렸는데요??");
				odap++;
			}
		}
		System.out.println("-----------------------");
		System.out.println("정답 횟수 : " + jungdap + "회");
		System.out.println("틀린 횟수 : " + odap + "회");
		
	}

}
