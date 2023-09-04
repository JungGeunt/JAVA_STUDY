package quiz;

import java.util.Scanner;

public class quiz15_1 {

	public static void main(String[] args) {


		
	Scanner scan = new Scanner(System.in);
		
		int jungdap = 0;
		int odap = 0;
		
		while(true) {
			int rand = (int)(Math.random() * 100) + 1;
			int rand2 =(int)(Math.random() * 100) + 1;
			int rand3 =(int)(Math.random() * 2) + 1;
			int dap = rand +rand2;
			int sumdap = rand -rand2;
			System.out.println("---------------------------");
			if(rand3==1) {
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
			}else {
				System.out.println(rand + " - " + rand2 + " = " + "?");
				System.out.println("[ 문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print(">");
				int sdap = scan.nextInt();
				if(sdap==0){
					System.out.println("프로그램을 종료합니다");
					 break;
				}
				if(sdap==sumdap) {
					System.out.println("정답입니다!!");
					jungdap++;
				}else {
					System.out.println("틀렸는데요??");
					odap++;
			}
			
			
			}
		}
		System.out.println("-----------------------");
		System.out.println("정답 횟수 : " + jungdap + "회");
		System.out.println("틀린 횟수 : " + odap + "회");
		
	}

}
