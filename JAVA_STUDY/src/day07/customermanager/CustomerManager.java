package day07.customermanager;


import java.util.Scanner;

import day07.customermanager.oop.Customer;

public class CustomerManager {
	//1. 변수 선언 
	// 배열에 저장 할 수 있는 최대 고객의 수
	static final int MAX =100;
	//Customer 객체의 배열을 선언
	static Customer[] cusList = new Customer[MAX]; //인스턴트 객체 배열
	
	//배열의 참조하기 위해서 인덱스가 필요함
	static int index =-1; //배열은 0번부터 시작하기 때문에 최소의 인덱스는 -1이여야 합니다. (참조 하지 않기 위해) 
						  //0으로 설정하면 참조 할 값이 없으므로 문제가 생길 수 있음 
	
	//배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장 
	//그래서 현재 데이터가 몇 개 저장되어 있는지 알 수 있는 변수를 선언 
	static int count = 0; //저장 개수 
	
	//기본 입력 장치로부터 데이터를 입력 받기 위해서 Scanner 객체 생성
	static Scanner scan = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		// 고객 관리 프로그램의 메뉴 (텍스트 ui)
		
		//while문을 쓰는이유 
		while(true) {
			//고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객의 수 : %d, 인덱스 : %d\n", count , index );
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert , (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu =scan.next();
			menu = menu.toLowerCase();
			//메뉴 선택시 동작을  구현 ..
			switch (menu.charAt(0)) {
			case 'i': //insert
				System.out.println("고객 정보를 입력을 시작합니다.");
				if(count >= MAX) {
					System.out.println("더이상 저장할 수 없습니다.");
				}else {
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 'p'://previuos
				System.out.println("이전 데이터를 출력합니다.");
				if(index <=0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				}else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'n'://next
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count -1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c'://urrent
				System.out.println("현재 데이터를 출력합니다.");
				if((index < count)&&(index >= 0)) {//index값이 count 보다 크면 없는 데이터를 참조하는것  // 입력을 하면 0부터 저장되기 때문에
					printCustomerData(index); //고객 데이터 출력
				}else {
					System.out.println("출력 할 데이터가 선택되지 않았습니다.");
				}
				break;	
				
			case 'd'://delete
				
				System.out.println("데이터를 삭제합니다..");
				if((index>=0)&&(index < count)) {
					System.out.println((index+1) + "번째 데이터를 삭제합니다.");
					deleteCustomerdata(index);
				}else {
					System.out.println("삭제 할 데이터가 선택되지 않았습니다.");
				}
				break;
				
			case 'u'://update
				System.out.println("데이터를 수정합니다.");
				if((index < count)&&(index >= 0)){
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerDate(index);

				}else {
					System.out.println("수정 할 데이터가 선택 되지 않았습니다.");
				}
				break;
			case 'q'://종료
				System.out.println("프로그램을 종료합니다.");
				scan.close(); //멤버 변수 종료 //파랑색으로 나타나는 변수는 멤버 변수를 참조 
				System.exit(0); //프로세스 종료 
				break;
			default:
				System.out.println("메뉴를 잘 못 입력 했습니다.");
				break; //생략가능 
			}
			
		}
	
	}
	// 고객 데이터 입력 추가 
	public static void insertCustomerData( ) {
		//이름, 성별 , 이메일 , 출생년도
		System.out.print("이름 : ");
		String name =scan.next();
		System.out.print("성별(M/F) : ");
		String gender =scan.next();
		System.out.print("이메일 : ");
		String email =scan.next();
		System.out.print("출생연도 : "); 
		int birthYear =scan.nextInt();  //문자열을 집어넣으면 오류가 생길 수 있음
		
		//고객 객체를 배열에 저장 (Customer 클래스의 객체)
		Customer c1 = new Customer();
		c1.setName(name);
		c1.setGender(gender);
		c1.setEmail(email);
		c1.setBirthYear(birthYear);
		cusList[count] = c1;
		count ++; //count번째 배열에 객체를 저장한 후 count 값 증가시킴
	}
	
	//현재 고객 정보 출력								//저장공간이  다른 index  메소드 -지역변수 
	public static void printCustomerData(int index) {
		System.out.println("===========CUSTOMER INFO===============");
		System.out.println("이름 : " + cusList[index].getName());
		System.out.println("성별: " + cusList[index].getGender());
		System.out.println("이메일 : " + cusList[index].getEmail());
		System.out.println("출생년도 : " + cusList[index].getBirthYear());
		System.out.println("=======================================");
		
	}
	public static void updateCustomerDate(int index) {
		System.out.println("--------UPDATE CUSTOMER INFO--------------");
		 System.out.println("이름 (" +cusList[index].getName()+") : ") ;
		 cusList[index].setName(scan.next());
		 cusList[index].setName(scan.next());
		 System.out.println("성별("+cusList[index].getGender()+") : ");
		 cusList[index].setGender(scan.next());
		 System.out.println("이메일("+cusList[index].getEmail()+") : ");
		 cusList[index].setEmail(scan.next()); 
		 System.out.println("출생년도 (" + cusList[index].getBirthYear()+") : ");
		 cusList[index].setBirthYear(scan.nextInt());
	}
	public static void deleteCustomerdata(int index) {
		for(int i =index; i<count -1 ; i++) {
			cusList[i] = cusList[i+1];
		}
		count --;
	}
	
	
	
}
