package day14.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.push(2);
		st.add(3);
		st.push(4);													//						    스택
																	//					| 4 | 1번
		System.out.println(st.toString());  //[1, 2, 3, 4]								| 3 | 2번
		System.out.println(st.get(0)); 		// 1										| 2	| 3번
		System.out.println(st.search(1)); 	// 4  //search는  1번부터 시작  					| 1	| 4번
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());   // 4 3 2 1 순으로 빠져나감 
		}
		
	}

}
