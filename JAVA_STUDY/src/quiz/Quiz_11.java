package quiz;

import java.util.Scanner;

public class Quiz_11 {

	public static void main(String[] args) {
		
			// 1. 양수를 입력 받으세요.
			//2. 입력 받은 수에 해당하는 구구단을 출력하세요
			System.out.println("구구단 단수를 입력하세요 : ");
			 Scanner scan = new Scanner(System.in);
			  int dan = scan.nextInt();
			  System.out.println("랜덤 구구단 " + dan +"단");
			  System.out.println("---------------------");
			  
			  for(int i =1; i<10;i++) {
				  int gop =dan*i;
				  System.out.println(dan + " x " + i + " = " + gop);
			  }

	}

}
