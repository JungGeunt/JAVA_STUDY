package day20.stream;

import java.util.stream.IntStream;

public class StrToStream {

	public static void main(String[] args) {
		// 문자열 Stream : 문자열을 처리하기 위해서 chars() 메서드를사용
		
		String str = "자바 세상을 만들자";
		
		//Stream 객체생성
		IntStream isr = str.chars(); // char는 숫자로 표현이 가능 !!
		
		isr.forEach(s -> System.out.print((char)s + " ")); //자 바   세 상 을   만 들 자 
	}

}
