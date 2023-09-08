package day15.compare.quiz;

import java.util.TreeSet;

import day15.compare.EmployeeComparator;

public class compareQuiz {

	public static void main(String[] args) {

		Member m1 = new Member("박지성",1000 );
		Member m2 = new Member("김연아",1001 );
		Member m3 = new Member("싸이", 1002 );
		Member m4 = new Member("봉준호",1003 );
		Member m5 = new Member("조현우",1004 );
		Member m6 = new Member("BTS", 1005 );
		Member m7 = new Member("박찬호",1006 );
		
		
		TreeSet<Member> list = new TreeSet<>(new memberNumComparator());
		//TreeSet<Member> list = new TreeSet<Member>(new Comparator<Member>(){
		//  익명 클래스 사용해도 됨 
		// public int compare(Member o1, Member o2) {
		// compare 메서드 사용법
		// 	-o1 과 o2의 자리를 바꾸고 싶은 경우 1을 리턴
		//	-o1 과 o2의 자리를 그대로 유지하고 싶은 경우 -1 리턴
		//	-o1 과 o2의 값이 같은 경우 0을 리턴
		// if(o1.name.char 
		//
		//
		//
		//
		//
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		
		for (Member mb : list) {
			System.out.println(mb);
		}
		
		System.out.println("-----------------");
		
		
		//memberNum 기준으로 출력 
		TreeSet<Member> list2 = new TreeSet<>();
		
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		list2.add(m4);
		list2.add(m5);
		list2.add(m6);
		list2.add(m7);
		
		for (Member mb2 : list2) {
			System.out.println(mb2);
		}
		

	}

}
