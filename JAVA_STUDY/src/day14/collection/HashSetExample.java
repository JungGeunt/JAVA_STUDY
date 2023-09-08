package day14.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// ** 해싱 : 하나의 문자열을 보다 빨리 찾을 수 있도록 주소에 직접 접근 할 수 있는 짧은 길이의 값이나
		//		       키로 변환하는 것. 이 해시값을 이용하여 문자열을 메모리에 저장합니다.
		//		       검사 시에 문자열을 비교하는 것이아니라 해시값을 비교하기 때문에 한번에 검색이 가능합니다.
		//         문자열의 형태와 해시값은 전혀 연관성이 없기 때문에 메모리상 여러 곳에 흩어져 저장된다.
		
		Set set = new HashSet<>();
		
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		boolean isAdded =set.add("five");
		
		System.out.println(set);	  	//[4, four, one, three, two, five] 
		System.out.println(isAdded); 	//false  중복허용x
		
		System.out.println(set.size()); //6 중복값은 처리되지 않음
		
		set.remove("two");
		System.out.println(set);  		//[4, four, one, three, five]
		
		set.clear();
		System.out.println(set); 		//[]
		
		if(set.isEmpty()) {
			System.out.println("set is Empty!"); //set is Empty!
		}
	}

}
