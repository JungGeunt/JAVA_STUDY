package day15.generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // 오브젝트 타입
		ArrayList<String > genericList = new ArrayList<>();
		
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		
		
		genericList.add("first");
		genericList.add("sencond");
		genericList.add("third");
		//제너릭을 사용하면 지정된 타입이외의 다른 타입은 저장 할 수 없음
		//genericList.add(new Integer(3));
		
		//Object 타입이기 떄문에 String으로 캐스팅
		String s1 =(String)list.get(0);
		
		//캐스팅이 필요 하지 않음
		String s2 =genericList.get(0);
		System.out.println(s1);
		System.out.println(s2);
		
		for (String s : genericList) {
			System.out.println(s);
		}
	}

}
