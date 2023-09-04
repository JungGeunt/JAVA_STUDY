package quiz;

import java.util.Scanner;

public class quiz16_4 {

	public static void main(String[] args) {
//		1. 배열을 선언하고 무지, 네오, 어피치, 라이언, 단무지 를 저장하세요.
//		2. 검색할 친구를 입력 받아, 검색할 친구가 있다면 어디에 있는지 출력하세요.
//		3. 검색한 친구가 없다면 “~~는 없습니다“ 를 출력하세요
		String[] friends = {"무지", "네오","어피치","라이언", "단무지" };
		Scanner scan = new Scanner(System.in);
		System.out.println("현재 저장 된 친구들: [무지, 네오, 어피치, 라이언, 단무지]");
		while(true) {
			System.out.print("검색할 카카오친구>");
			String friend =scan.nextLine();
		 for(int i=0; i <friends.length; i++ ) {
			 if(friend.equals(friends[i])) {
				 System.out.println(friend +" 친구는 " + i +  "  번째에 있습니다"  );
				 break;
			 }else {
				 System.out.println(friend + "친구는 없습니다.");
				 break;
			 }
		 }
		}
	}

}
