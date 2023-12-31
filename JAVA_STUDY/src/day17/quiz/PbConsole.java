package day17.quiz;

import java.util.Scanner;

public class PbConsole {

	//폰북을 위한 객체 멤버
		static PhoneBook book = new PhoneBook();
		static Scanner sc = new Scanner(System.in);

		public static void doNewGroup() {
			System.out.println("Enter New Group Name : ");
			book.addGroup(sc.nextLine());
			book.save();
			System.out.println();
		}

		public static void doNewAddress() {
			System.out.print("Enter Group Name >");
			String groupName = sc.nextLine();
			System.out.print("Enter   >");
			String number = sc.nextLine();
			System.out.print("Enter >");
			String name = sc.nextLine();
			
			addPhMessage addMsg = book.addPhoneNo(groupName, number, name);
			//addMsg를 통해 적절한 처리...
		
			if(addMsg.type == addPhMessage.ADD_SUCCESS) {
				book.save();
			}else if(addMsg.type == addPhMessage.NOT_EXISTING_GROUP){
				return;
			}else if(addMsg.type == addPhMessage.EXISTING_NUMBER) {
				//수정 여루를 선택 후에 수정해서 다시 등록하기 or 안하기
			}
		}

		public static void main(String[] args) {
			while (true) {
				System.out.println("1. New Group");
				System.out.println("2. Print");
				System.out.println("3. New Address");
				System.out.println("4. Find Phone");
				System.out.println("5. Find Name");
				System.out.println("6. Exit");
				System.out.print("> ");
				int behavior = sc.nextInt();
				sc.nextLine();
				
				switch (behavior) {
				case 1:
					doNewGroup();
					break;
				case 2:
					book.printAll();
					break;
				case 3:
					doNewAddress();
				case 4:				
				case 5:
				case 6:
				default:
					break;
					 
				
				}
				
			}
		}
}
