package quiz_class;

import java.util.Scanner;

public class quiz14_1 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int h;
		while(true) {
			System.out.print("주민번호 13자리를 입력하세요 : ");
			String idNum =scan.nextLine();
			if(idNum.length()==13 ) {
				h = idNum.indexOf(7);
				if(h==1) {
					System.out.println("남성");
					break;
				}else if(h==2){
					System.out.println("여성");
					break;
				}
				
			}
			
	break;	
	}
	}
}
