package day20.stream;

import java.util.stream.Stream;

public class StreamByIterate {

	public static void main(String[] args) {
		// iterate() 메서드를 이용한 Stream 객체 생성                         Operator 연산후 다시 매개변수로 들어옴.
		Stream<Integer> stream = Stream.iterate(1, n -> n+1).limit(10); //(시작 값, 함수)
		//내부 반복자를 이용 출력
		stream.forEach(s -> System.out.print(s + " "));  // 1 2 3 4 5 6 7 8 9 10 
		
		
		

	}

}
