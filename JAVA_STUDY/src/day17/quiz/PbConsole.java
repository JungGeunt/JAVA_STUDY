package day17.quiz;

import java.util.HashMap;
import java.util.Scanner;

public class PbConsole {
	static Scanner sc = new Scanner(System.in);
	
	void doNewGroup() {
	}
	
	void printAll() {
		
	}
	void doNewAddress(){
		
	}
	

	public static void main(String[] args) {
		
		HashMap<String, Integer> pb =new HashMap<>();
		
		while (true) {
			System.out.println("==== What to do ====");			
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


	



