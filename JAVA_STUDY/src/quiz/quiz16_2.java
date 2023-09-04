package quiz;

import java.util.Scanner;

public class quiz16_2 {

	public static void main(String[] args) {
//		1. Scanner생성하세요. (크기가 100인 배열 선언)
//		2. While문(무한 루프) 에서 “카카오 친구들“ 을 배열 순서에 입력 받으세요.
//		3. “그만” 을 입력 받으면 탈출 합니다
		
		Scanner scan = new Scanner(System.in);
		String [] friends = new String[100];
		int count =0;
		while(true) {
			System.out.print("입력할 카카오친구>");
			String friend = scan.nextLine();
			System.out.println(friend + "입력 성공!");
			System.out.println("------------------------");
			if(friend.equals("그만")) {
				break;
			}
			friends[count] = friend;
			count++;
		}
		System.out.println(count +"명의 카카오 친구가 입력 되었습니다.");
	}

}
