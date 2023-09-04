package quiz;

import java.util.Scanner;

public class quiz16_3 {

	public static void main(String[] args) {
		// 1. quiz16-2 에서 같은 카카오 친구가 있다면 입력 받을 수 없도록 변경해 보세요.
		//2. 힌트: 저장하기 전, 입력 받은 name이 배열에 존재하는지 for문을 통해 검색합니다.

		Scanner scan = new Scanner(System.in);
		String [] friends = new String[100];
		int count =0;
		while(true) {
			System.out.print("입력할 카카오친구>");
			String friend = scan.nextLine();
			if(friend.equals("그만")) {
				break;
			}
			boolean tf =true;
			for(int i =0; i < friends.length; i++) {
				if(friend.equals(friends[i])) {
					tf =false;
					break;
				}
			}
			if(tf) {
				System.out.println(friend + "입력 성공!");
				System.out.println("------------------------");
			friends[count] = friend;
			count++;
			}else {
				System.out.println("이미 입력된 친구입니다.");
				System.out.println("----------------");
			}
			
		}
		System.out.println(count +"명의 카카오 친구가 입력 되었습니다.");
		
	}

}
