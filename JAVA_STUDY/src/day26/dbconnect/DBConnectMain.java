package day26.dbconnect;

import java.util.List;
import java.util.Scanner;

public class DBConnectMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PersonsDAO dao = new PersonsDAO();
//		PersonsVO vo = new PersonsVO();
//		
//		System.out.println("Persons 정보입력(Insert) : ");
//		System.out.print("성 입력 : ");
//		vo.setLastName(scan.next());
//		System.out.print("이름 입력 : ");
//		vo.setFirstName(scan.next());
//		System.out.print("나이 입력 : ");
//		vo.setAge(scan.nextInt());
//		System.out.print("도시 입력 : ");
//		vo.setCity(scan.next());
//		
//		
//		int result =dao.insert(vo);
//		if(result != 0) {
//			System.out.println("입력성공");
//		}else {
//			System.out.println("입력 실패");
//		}
//		scan.close();
	

	//전체 출력 확인
	List<PersonsVO> list = dao.allPersons();
	for (PersonsVO VO1 : list) {
		System.out.println(VO1);
	}
	
	
	}
}
