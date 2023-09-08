package day17.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuiz {

	
	public static void main(String[] args) {
		//1. User를 저장하는 List를 선언하세요
		
		ArrayList<Object> people = new ArrayList<>();
		
		
		

		Scanner scan = new Scanner(System.in);
		;
		while(true) {

			System.out.println("메뉴를 입력하세요.");
			System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
			System.out.print(">>> ");
			int menu = scan.nextInt();
		
			if(menu == 1) {
				/*
				Scanner를통해 이름과, 나이를 입력받고 User객체에 저장합니다.
				그리고 User객체를 list에 추가하세요.
				*/
				
				System.out.println("이름을 입력해 주세요  ");
				System.out.print("이름 : ");
				User user = new User();
				String name = scan.next();
				user.setName(name);
				
				
				scan.nextLine();
				System.out.println("나이를 입력해주세요");
				System.out.println("나이 : ");
				int age =scan.nextInt();
				
				
				user.setAge(age);
				
				people.add(user);
					
				
				
				

			}else if(menu == 2) {

				System.out.println("====== 모든 회원 정보 ======");
				/*
				 * people의 길이만큼 회전하면서 people의객체를 꺼내 저장합니다. (객체의 타입에 유의)
				 * 꺼낸 하나의 객체에서  공개된 메서드를 통해 이름, 나이를 출력하세요.
				 */
				for(int i=0; i<people.size(); i++) {
					User p = (User) people.get(i);
					String pName = p.getName();
					String pAge = p.getAge();
					
					System.out.println("이름: " + pName + ", 나이: " + p.getAge());
				}
				

				System.out.println("==========================");


			}else if(menu == 3) {
				System.out.println("찾을 이름을 입력하세요.");
				System.out.print(">>> ");
				String name = scan.next();

				for(int i=0; i<people.size(); i++) {
					User p = (User) people.get(i);
					String pName = p.getName();
					String pAge = p.getAge();
					if(pName.equals(name)) {
						System.out.println("이름: " + pName + ", 나이: " + p.getAge());
						break;
					} 
					//people List의 인덱스는 size -1이 됩니다.
					if (i == people.size() -1) {
						System.out.println(name +"님은 목록에 없습니다.");
					}

				}


			}else if(menu == 4) {
				/*
				 * 1. scan 을 통해 삭제할 이름을 입력 받으세요.
				 * 2. list 의 길이 만큼 회전하면서 객체에서 name을 꺼내 비교합니다.
				 * 3. 입력받은 이름과 동일한 이름이 있다면 people객체를 삭제
				 * 
				 */
				System.out.println("삭제할 이름을 입력하세요.");
				String removeName =scan.next();
				for(int i=0;i <people.size(); i++) {
					User p = (User) people.get(i);
					String pName = p.getName();
					if(removeName.equals(pName)) {
						people.remove(i);
					}
					
				}



			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		

	}

	private static void user(String name, int age) {
		
	}

}

class User{
	String name;
	int age;
	
	
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getAge() {
		
		return Integer.toString(age);
	}


	public String getName() {
		
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public User() {}
}

