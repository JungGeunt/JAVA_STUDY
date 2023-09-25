package day26.dbconnect;

import java.util.List;
import java.util.Scanner;

public class DBConnectMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PersonsDAO dao = new PersonsDAO();
		//PersonsVO vo = new PersonsVO();
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
	
	//수정 
	System.out.println("Persons 정보입력(Update) : ");
	System.out.print("변경할 아이디 값을 입력하세요");
	System.out.println("id =");
	PersonsVO vo = dao.selectOne(13);
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
	int  result = dao.updatePersons(vo);
	if(result != 0) {
		System.out.println("수정 성공");
	}else {
		System.out.println("수정 실패");
	}

	}
}
