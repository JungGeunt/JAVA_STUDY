package day14.collection.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JiphapQuiz {

	//ArrayList1 = [1,2,3,4,5,6,]
	//ArrayList2 = [4,5,6,7,8,9,]
	
	//두 리스트의 합집합 , 교집합 , 차집합을 구해서 출력해 보세요.
	//합집합 : [1,2,3,4,5,6,7,8,9]
	//교집합 : [4,5,6]
	//차집합 : [1,2,3] [7,8,9]
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {4,5,6,7,8,9};
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i =0; i< arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		
		System.out.println("ArrayList1 : " +list1);
		System.out.println("ArrayList2 : " +list2);
		
		ArrayList union = new ArrayList(list1);
		//System.out.println(union);
		for(Object o : list2) {
			if(union.contains(o)) 
				union.add(o);
		}
		System.out.println("합집합 : " + union);
		
		
		ArrayList intersection = new ArrayList();
		for(Object o : list2)
			if(list1.contains(o)) {
				intersection.add(o);
			}
		System.out.println("교집합 : " + intersection);
		
		
		ArrayList diff1 = new ArrayList(list1);
		for (Object o : list2) {
			if(diff1.contains(o))
				diff1.remove(o);
			
			System.out.println("차집합1 : " + diff1);
			
			ArrayList diff2 = new ArrayList(list2);
			for (Object o1 : list1) {
				if(diff2.contains(o1))
					diff2.remove(o1);
				
				System.out.println("차집합1 : " + diff2);
			
			ArrayList diff = new ArrayList();
			diff.add(diff1);
			diff.add(diff2);
			System.out.println("차집합 모음  : " +diff);
		}
		}
	}
}
		
		
		
		
		
		
//		List  ArrayList1 = new ArrayList();
//		ArrayList1.add(1);
//		ArrayList1.add(2);
//		ArrayList1.add(3);
//		ArrayList1.add(4);
//		ArrayList1.add(5);
//		ArrayList1.add(6);
//		
//		List  ArrayList2 = new ArrayList();
//		ArrayList2.add(4);
//		ArrayList2.add(5);
//		ArrayList2.add(6);
//		ArrayList2.add(7);
//		ArrayList2.add(8);
//		ArrayList2.add(9);
//		
//		addAll: 다른 컬렉션의 모든 요소를 추가함
//		removeAll : 다른 컬렉션의 값과 일치하는 모든 요소를 제거함 . 
			
//		//합집합
//		List  ArrayList3 = new ArrayList();
//		ArrayList3.addAll(ArrayList1);
//		ArrayList3.addAll(ArrayList2);
//		ArrayList3.removeAll(ArrayList2);
//		ArrayList3.addAll(ArrayList2);
//		System.out.println(ArrayList3); // 합집합 
//		
//		
//		
//		//차집합 
//		List  ArrayList4 = new ArrayList();
//		ArrayList4.addAll(ArrayList1);
//		ArrayList4.addAll(ArrayList2);
//		ArrayList4.removeAll(ArrayList2); 
//		System.out.println(ArrayList4); 
//		List  ArrayList5 = new ArrayList();
//		ArrayList5.addAll(ArrayList1);
//		ArrayList5.addAll(ArrayList2);
//		ArrayList5.removeAll(ArrayList1);
//		System.out.println(ArrayList5);
//		
//		//교집합 
//		ArrayList3.removeAll(ArrayList4);
//		ArrayList3.removeAll(ArrayList5);
//		System.out.println(ArrayList3);
//		
//		
//		
		
//	}
//
//	}
