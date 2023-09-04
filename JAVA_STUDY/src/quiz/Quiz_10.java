package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_10 {

	public static void main(String[] args) {
//		//문제
//		1. 양수를 입력 받아, 입력 받은 수 크기의 배열을 생성하세요.
//		2. 배열에 1~입력 받은 수 까지 차례대로 값을 넣으세요
	
	System.out.println("수를 입력하세요>");
	Scanner scan = new Scanner(System.in);
	int iarr = scan.nextInt();
	int [] iarr2 = new int[iarr];
	int s= 0;
	while(s< iarr) {
		iarr2[s] = s+1;
		 s++;
		
	}
	System.out.println("배열 iarr는" + Arrays.toString(iarr2));
	
}

}
