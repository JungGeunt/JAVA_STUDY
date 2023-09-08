package quiz_class;

import java.util.Scanner;

public class quiz_14 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		String ids = "";
		while(true) {
			System.out.print("아이디 등록 : ");
			String id =scan.nextLine();
			if(id.length()<5 ) {
				System.out.println("아이디는 5글자 이상으로 등록하세요.");
			}else {
				id =id.trim();
				
				ids +=id;
			}
		if(!(ids=="")) {
			break;
		}
		}
		System.out.println("아이디 : " + ids + "가 등록되었습니다.");

	}

}
