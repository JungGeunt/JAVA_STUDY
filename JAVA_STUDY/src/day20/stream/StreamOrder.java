package day20.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("홍길동", "김유신", "이순신","유관순");
		
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::print); //:: //김유신 유관순 이순신 홍길동
		System.out.println();
		
		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder()) //Comparator.reverseOrder() 역정렬   
						.forEach(System.out::print);   //홍길동 이순신 유관순 김유신
		System.out.println();

	}

}
