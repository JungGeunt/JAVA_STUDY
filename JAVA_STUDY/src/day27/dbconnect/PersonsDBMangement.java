package day27.dbconnect;

import java.util.List;
import java.util.Scanner;



public class PersonsDBMangement {
static Scanner scan = new Scanner(System.in);




	public static void main(String[] args) {
		PersonsDAO dao = new PersonsDAO();
		PersonsVO vo = new PersonsVO();
		
		while(true) {
			System.out.println("[PersonsDB 처리 프로그램]");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("(A)llPerons, (S)elect ,(I)nsert, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu =scan.next();
			menu = menu.toLowerCase();
			
			switch (menu.charAt(0)) {
			case 'a':
			case 'ㅁ':  System.out.println("모든 사람을 출력 합니다.");
						List<PersonsVO> list =dao.allPersons();
						for (PersonsVO VO1 : list) {
							System.out.println(VO1);
						}
				break;

			case 's':
			case 'ㄴ':  System.out.println("정보를 조회 할 회원의 ID를 입력하세요");
						System.out.print("ID : ");
						int id = scan.nextInt();
						 vo= dao.select(id);
						System.out.println(vo);
				break;
				
			case 'i':
			case 'ㅑ':System.out.println("Persons 정보입력(Insert) : ");
					 System.out.print("성 입력 : ");
					 vo.setLastName(scan.next());
					 System.out.print("이름 입력 : ");
					 vo.setFirstName(scan.next());
					 System.out.print("나이 입력 : ");
					 vo.setAge(scan.nextInt());
					 System.out.print("도시 입력 : ");
		 		     vo.setCity(scan.next());
		 		     
		 		    int result = dao.insert(vo);
		 		    if(result != 0) {
		 				System.out.println("정보 입력을 성공하셨습니다.");
		 		    }else {
		 				System.out.println("정보 입력을 실패하셨습니다.");
		 			}
				break;
			
			case 'u':
			case 'ㅕ': System.out.println("Persons 정보입력(Update) : ");
					  System.out.println("변경할 아이디 값을 입력하세요");
					  System.out.print("ID : ");
					  id = scan.nextInt();
					  dao.select(id);
					  System.out.println(vo);
					  vo = dao.select(id);
					  System.out.printf("수정 할 성 입력하세요 ( " +vo.getLastName() +") : ");
						String lastName = scan.next();
						if(lastName.equals("")) {
							vo.setLastName(lastName);
						}
						System.out.printf("수정 할 이름 입력하세요 ( " +vo.getFirstName() +") : ");
						String firstName = scan.next();
						if(firstName.equals("")) {
							vo.setFirstName(firstName);
						}
						System.out.printf("수정 할 나이 입력하세요 ( " +vo.getAge() +") : ");
						int age = scan.nextInt();
						if(age != 0 && age>=0) {
							vo.setAge(age);
						}
						System.out.printf("수정 할 도시 입력하세요 ( " +vo.getCity() +") : ");
						String city = scan.next();
						if(city.equals("")) {
							vo.setCity(city);
							
						}
						int  result2 = dao.Update(vo);
						if(result2 != 0) {
							System.out.println("수정 성공");
						}else {
							System.out.println("수정 실패");
						}			 
				break;
			
			case 'd':
			case 'ㅇ': System.out.println("정보를 삭제 할 ID를 입력하세요");
			           System.out.print("ID : ");
					   id = scan.nextInt();
					   int result3 = dao.delete(id);
					   if(result3 != 0) {
						   System.out.println("정보가 삭제 되었습니다.");
						}else {
							System.out.println("정보삭제를 실패했습니다.");
						}
				break;
			
			case 'q':
			case 'ㅂ': System.out.println("프로그램을 종료합니다.");
					   scan.close();
					   System.exit(0); 				
				break;
				
			default: System.out.println("메뉴를 잘 못 입력 했습니다.");
				break;
			}
		}

	}
}
