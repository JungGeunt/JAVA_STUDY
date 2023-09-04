package quiz;

import java.util.Scanner;

public class quzi16_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] food1 = new String[100];
		int count = 0;
		System.out.println("#먹고 싶은 음식을 입력하세요!!");
		System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요.");
		while(true) {
			System.out.print(">");
			String food2 =scan.nextLine();
			if(food2.equals("그만")){
				System.out.println("입력 종료!!");
				break;
			}
			food1[count] = food2;
			count++;
			}
		System.out.println("내가 먹고싶은 음식들 : [");
		for(int i=0; i<count; i++) {
			System.out.println(food1[i] + " ");
			
		}
		System.out.println("]");
	}

}
