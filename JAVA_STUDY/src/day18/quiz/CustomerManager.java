package day18.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import util.Closer;

public class CustomerManager {
	

	public static void main(String[] args) {
		readCustomer();//프로그램 시작 전에 데이터를읽어 와야함.
		
		ArrayList<Customer> cusList = new ArrayList<>(); //고객 데이터 저장
		Scanner scan = new Scanner(System.in);
	
	while(true) {
		
		System.out.printf("\n[INFO] 고객 수 : %d ", CustomerManager.cusList.size());
		System.out.println("메뉴를 입력하세요.");
		System.out.println("(I)nsert , (S)elect, , (A)all, (U)pdate, (D)elete, (W)rite ,  (R)ead ,(Q)uit");
		System.out.print("메뉴 입력 : ");
		String menu2 =scan.next();
		menu2 = menu2.toLowerCase(); //대소문자 구분 하지 않기 위해 ....
		scan.nextLine();
		switch (menu2.charAt(0)) {
		case 'i':  
		case 'ㅑ'://고객 정보 입력 처리 
				 inserCustomerData();
			break;
		
		case 's':
		case 'ㄴ':	//고객 정보 선택
				if((CustomerManager.cusList.size()>0)) {
					selectCustomerData();
				}else{
				  System.out.println("현재 등록된 고객 정보가 없습니다.");
				}
			break;
			
		case 'a':	//고객 전체 데이터 출력
		case 'ㅁ':  printAllCustomerData();
			
			break;
			
		case 'u':	//고객 정보 수정
		case 'ㅕ':  updateCustomerData();
						
			break;
			
		case 'd': //고객 데이터 삭제
		case 'ㅇ':deleteCustomerData();
			break;
			
		case 'w': //고객 정보 파일에 저장
		case 'ㅈ':writeCustomerData();
			break;
			
		case 'r': //저장된 고객 정보 읽어오기
		case 'ㄱ':readCustomer();
			break;
						//프로그램 삭제 
		case 'q':	System.out.println("프로그램을 종료합니다.");
		case 'ㅂ':	scan.close();
					System.exit(0); 
		
		default:	
				System.out.println("메뉴를 잘 못 입력 했습니다.");
			break;
		}
		
	}
	
		
		

	}

	//이름 성별 이메일 생년월일

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Customer> cusList = new ArrayList<>();
	static String q = "q";
	
	public static void inserCustomerData() {

	System.out.println("고객 정보를 입력을 시작합니다.");
	System.out.print("이름 : ");
	
	String name = scan.next();
	System.out.print("성별(M/F) : ");
	scan.nextLine();
	String gender = scan.nextLine();
	System.out.print("이메일 : ");
	
	String email = scan.nextLine();
	System.out.print("생년월일 : ");
	
	String birthYear=scan.nextLine();
	//객체 정보를 받아서 넣음
	Customer customer = new Customer(name, gender, email, birthYear);
	
	if(cusList.size()>0) {
	for(int i=0 ;i < cusList.size(); i++) {
		Customer c = cusList.get(i);
		String dName = c.getName();
		String dEmail = c.getEmail();
		//동등비교를 하기위해.
		//클래스 equals 와 hashCode 재정의
		if((name.equals(dName)) || (email.equals(dEmail))) {
			System.out.println("중복된 데이터가 있습니다. 확인해주세요.");
			 return;
		}else {	
			cusList.add(customer);
		    System.out.println("고객 정보를 저장했습니다.");
			break;
		}
	}
	}else {
		cusList.add(customer);
		System.out.println("고객 정보를 저장했습니다.");
		
	}
	
	
	
}

  public static void selectCustomerData(){
	  for(int i=0 ;i < cusList.size(); i++) {
			Customer c = cusList.get(i);
			System.out.println(i+1 + c.toString());	
	  }
	  	System.out.println("선택하실 고객의 숫자를 입력하세요. ");
	  	int num =scan.nextInt();
	  for(int i=0 ;i < cusList.size(); i++) {
		  Customer c = cusList.get(num-1);
		  System.out.println(c.toString());
		  break;
	  }
	  
	
}
// public static void selectCustomerData(){
  //	while(true){
  //	System.out.println("출력, 수정 또는 삭제 할 사람의 이름을 입력해주세요.");
  //    System.out.println("또는 메뉴로 돌아가고 싶다면 q를 눌러주세요. ");
  
  
  
  
	public static void printCustomerData() {
	System.out.println("정보를 찾을  고객의 이름을 입력하세요");
	System.out.println("프로그램 종료 버튼 : (q) ");
	System.out.print("이름 : ");
	
	String fName = scan.next();
	for(int i=0 ;i < cusList.size(); i++) {
		Customer c = cusList.get(i);
		String cName = c.getName();
		if(fName.equals(cName)) {
			c.toString();
			break;
		}else if(fName.equals(q)) {
			System.out.println("프로그램을 종료합니다.");
			break;
			
			
			
			
			
		}
	}
}

	public static void printAllCustomerData() {
	System.out.println("모든 고객의 데이터를 출력합니다.");
	for(int i=0 ;i < cusList.size(); i++) {
		Customer c = cusList.get(i);
		System.out.println(c.toString());
	}
	
	
}

	public static void updateCustomerData() {
	System.out.println("수정 하실 고객의 이름을 입력하세요.");
	System.out.println("프로그램 종료 버튼 : (q) ");
	System.out.println("이름 : ");
	
	String updateName = scan.next();
	for(int i=0 ;i < cusList.size(); i++) {
		Customer c = cusList.get(i);
		String cName = c.getName();
		while(true) {
		if(updateName.equals(cName)) {
			System.out.println("수정 전 정보 : " + c.toString());
			System.out.println("수정하고 싶은 정보를 입력하세요.");
			System.out.println("(n)이름 ,(g)성별, (e)이메일 , (b)생년월일, (q)종료");
			String menu =scan.next();
			menu = menu.toLowerCase();
			while(true) {
				switch (menu.charAt(0)) {
				case 'n': System.out.println("이름 정보를 수정합니다.");
						  System.out.println("수정할 이름 : ");
						  scan.nextLine();
						  c.setName(scan.next()); 
						  System.out.println(c.getName() +"으로 변경하였습니다.");
						  break;
					
					
				case 'g': System.out.println("성별 정보를 수정합니다.");
				  		  System.out.println("수정할 성별 : ");
				  		  scan.nextLine();
				  		  c.setGender(scan.next());
				  		  System.out.println(c.getGender() +"으로 변경하였습니다.");
				  		 break;
					
					
				case 'e': System.out.println("이메일 정보를 수정합니다.");
		  		  		  System.out.println("수정할 이메일 : ");
		  		  		  scan.nextLine();
		  		  		  c.setEmail(scan.nextLine());
		  		  		  System.out.println(c.getEmail() +"으로 변경하였습니다.");
		  		  		 break;
					
					
				case 'b':System.out.println("생년월일 정보를 수정합니다.");
						 System.out.println("수정할 생년월일 : ");
			  		     scan.nextLine();
			  		     c.setBirthYear(scan.nextLine());
			  		     System.out.println(c.getBirthYear() +"으로 변경하였습니다.");
			  		     break;
					
					
				case 'q':System.out.println("수정을 완료하였습니다.");
				         scan.close();
				         System.exit(0);
					break;
					

				default:
					System.out.println("메뉴를 잘 못 입력했습니다.");
					break;
				}
				 break;
			}
			 
		}else if(updateName.equals(q)){
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		}
	}
}

	public static void deleteCustomerData() {
	System.out.println("삭제 할 정보의 고객이름을 입력하세요.");
	System.out.println("삭제 프로그램 종료 버튼 : (q) ");
	System.out.print("이름 : ");

	String removeName =scan.next();
	for(int i=0 ;i < cusList.size(); i++) {
		Customer c = cusList.get(i);
		String cName = c.getName();
		if(cName.equals(removeName)) {
			cusList.remove(i);
			System.out.println(cName +"님의 데이터를 삭제 하였습니다.");
		
		}else if(removeName.equals(q)) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
	}
	
}



	public static void writeCustomerData() {
	File file = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customerManager.txt");
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	
	try {
		fos = new FileOutputStream(file);
		 oos = new ObjectOutputStream(fos);
		 
		 
		 oos.writeObject(cusList);
		 
		System.out.println("데이터가 저장되었습니다.");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(oos!=null)Closer.close(oos);
		if(oos!=null)Closer.close(fos);
	}

}

	public static void readCustomer() {
	File file = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customerManager.txt");
	
	FileInputStream fis =null;
	ObjectInputStream ois =null;
	try {
		fis = new FileInputStream(file);
		ois = new ObjectInputStream(fis);
		
		@SuppressWarnings("unchecked")
		ArrayList<Customer> cusList =(ArrayList<Customer>)ois.readObject();
		System.out.println(cusList);
		
	} catch (FileNotFoundException e) {
	  e.printStackTrace();
	}catch(IOException e){
		System.out.println(e.getMessage());
	}catch(ClassNotFoundException e){
		System.out.println(e.getMessage());
	}finally {
		if(ois!=null)Closer.close(ois);
		if(fis!=null)Closer.close(fis);
		
	}
	
}
	
}


