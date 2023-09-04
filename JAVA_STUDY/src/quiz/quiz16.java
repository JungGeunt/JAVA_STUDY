package quiz;

import java.util.Scanner;

public class quiz16 {
//	1. Scanner를 이용하여 금액을 입력 받으세요.
//	2. 음료수를 선택하면 금액에서 차감하세요. (반복문)
//	3. 금액이 부족하다면 “금액이 부족합니다“ 를 출력하세요.
//	4. 4를 입력 받으면 반복문 을 종료하세요

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("금액을 투입해주세요>");
		int money =scan.nextInt();
		
		while(true) {
			System.out.println("남은 금액 : " + money);
			System.out.println("[1]뎀이소다 :400원, [2]밀킥스 : 500원, [3]코가골라 : 600원, [4]잔돈받기");
			System.out.print("음료수 선택>");
			int drink =scan.nextInt();
			switch (drink) {
			case 1:
				if(money>=400) {
				System.out.println("뎀이소다를 받았습니다.");
				money-=400;
				}else {System.out.println("금액이 부족합니다. 돈을 넣어주세요!");
				
				}
				break;
			case 2:
				if(money>=500) {
				System.out.println("밀킥스를 받았습니다.");
				money-=500;
				}else {System.out.println("금액이 부족합니다. 돈을 넣어주세요!");
				
				}
				break;
			case 3:
				if(money>=600) {
				System.out.println("코가골라를 받았습니다.");
				money-=400;
				}else {System.out.println("금액이 부족합니다. 돈을 넣어주세요!");
				
				}
				
				break;
			case 4:
				System.out.println("남은 금액." +money +"을 반환합니다" );
				break;
			
			}
			
		}
	}

}
