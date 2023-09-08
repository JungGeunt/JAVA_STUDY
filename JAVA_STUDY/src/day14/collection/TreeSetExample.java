package day14.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		//중간 값을 기준으로  나눠짐 
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("computer");
		ts.add("monitor");
		ts.add("get");
	
		
		for (String str : ts) {				//인덱스가 고정되지 않기때문에 순서를 알수 없음.
			System.out.print(str + "\t");   //aaa	computer	get	hello	java	monitor	
		}									//값에 대한 정렬이 이루워짐
	
		

	}

}
