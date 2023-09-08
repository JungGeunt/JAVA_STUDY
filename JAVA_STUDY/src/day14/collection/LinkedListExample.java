package day14.collection;

import java.util.LinkedList;

public class LinkedListExample {

	//체인구조형태 
	// -ArrayList는 내부 배열에 객체를 저장하여 인덱스로 관리하지만,
	// LikedList는 인접 참조를 링크하여 체인처럼 관리합니다.
	//-LikedList는 특정 인덱스의 객체를 제거하면 앞 뒤 링크만 병경되고, 나머지 링크는 변경되지 않아
	// 빈번한 객체의 삭제와 삽입은 ArrayList보다 좋은 성능 발휘
	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<>(); // 앞에서 타입을 저해놓으면 뒤에서 생략 가능
		
		//push   비슷 add  
		list.addFirst("hello");		//head에 값을 추가 
		list.add("java");
		list.add("banana");
		list.add("apple");
		list.addLast("zoo"); 		// 끝에 값을 추가 
		
		
		System.out.println("list data : " + list);          //list data : [hello, java, banana, apple, zoo]
		
		//삭제
		list.remove(); //head 엘리먼트 삭제  
		System.out.println("list data after remove() : " + list);  //list data : [java, banana, apple, zoo]
		
		list.remove(2); //2번 인덱스 엘리먼트 삭제    
		System.out.println("list data after remove(2) : " + list);  //list data after remove(2) : [java, banana, zoo]

		
		list.set(1, "new element"); //1번 엘리먼트 변경
		System.out.println("list data after set() : " + list); //list data after set() : [java, new element, zoo]
		
		
		String str1 = list.peek(); // 엘리먼트 조회 
		String str2 = list.peekLast(); //마지막 엘리먼트 조회
		System.out.println("str1 : " +str1);                    //str1 : java
		System.out.println("str2 : " +str2);
		System.out.println("list data after peek() : " +list);  //list data after peek() : [java, new element, zoo]
		
		//poll = pop 
		String str3 =list.poll(); //엘리먼트 조회 후 삭제 
		System.out.println("str3 : " + str3);					//str3 : java
		System.out.println("list data after poll() : " + list); // list data after poll() : [new element, zoo]
		
		String str4 = list.pop(); //엘리멘트 조회 후 삭제
		System.out.println("str4 : " + str4);					//str4 : new element
		System.out.println("list data after pop() : " + list);	//list data after pop() : [zoo]
		
		list.push("push element");	//push시 추사 위치 주의!!! 맨 앞으로 추가
		System.out.println("list data after push()" + list); 	//list data after push()[push element, zoo]
		
	}

}
