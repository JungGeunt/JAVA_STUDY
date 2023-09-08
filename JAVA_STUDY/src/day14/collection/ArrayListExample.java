package day14.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List list = new ArrayList(); //제네릭 -형안정성 문제가 생김 데이터 타입을
									 // 어떠한 형태로 되어있는지 구분이 어려움  
		
		//추가
		list.add("one");
		boolean a = list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		boolean b = list.add("second"); // list는 중복저장이 가능
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a);				//true
		System.out.println(b);				//true
		System.out.println(list);			//[one, second, 3rd, 4, 5.0, second, 4, SECOND]
		

		//수정 set
		list.set(6, 8);
		System.out.println(list);			//[one, second, 3rd, 4, 5.0, second, 8, SECOND]
		
		
		//제거 
		list.remove(0);						//지정된 인덱스 값을 삭제
		System.out.println(list);			//[second, 3rd, 4, 5.0, second, 8, SECOND] 첫번째 값을지움
		list.remove("SECOND");				
		System.out.println(list);           //[second, 3rd, 4, 5.0, second, 8]
		
		//값 얻어오기 : get()
		Object o = list.get(5);				//왜? Object ? 형태가 지정 되지않았기 때문에
		System.out.println(o);				//8
		
		//사이즈 
		int size = list.size();
		int idx = list.indexOf("second");
		System.out.println("list 크기는 : " + size);		//	list 크기는 : 6	
		System.out.println("첫번째 , second = " + idx);	//	첫번째 , second = 0
		
		//String s = list.get(5); // 제너릭 설정x 타입이 지정되지 않음. 기본 Object 타입
		String s = (String)list.get(4);
		System.out.println("문자열의 길이 : " +s.length()); //문자열의 길이 : 6
		
		
		//정리 
		list.clear();
		if(list.isEmpty()) {
			System.out.println("list is Empty!!");	//list is Empty!!
		}
		
		
		
	}

}
