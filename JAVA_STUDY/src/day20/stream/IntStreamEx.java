package day20.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		
		// IntStream의 range(), rangeClosed() 메서드 사용
		
		int [] arr= { 1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Arrays.stream() InstStream 생성하기"); //Arrays.stream() InstStream 생성하기
		IntStream intStream1 = Arrays.stream(arr);
		intStream1.forEach(s-> System.out.print(s + "\t"));  //1	2	3	4	5	6	7	8	9	10
		System.out.println();
		
		System.out.println("IntStream.of() IntStream 생성하기"); //IntStream.of() IntStream 생성하기
		IntStream intStream2 = IntStream.of(arr);
		intStream2.forEach(s -> System.out.print(s + "\t")); //1	2	3	4	5	6	7	8	9	10
		System.out.println();
		
		//두번째 매개변수 인덱스 포함 안함
		System.out.println("IntStream.range(10,16) IntStream 생성하기"); //IntStream.range(10,16) IntStream 생성하기
		IntStream intStream3= IntStream.range(10,16);					//새로 생성해서 그 값의 범위를 가져옴
		intStream3.forEach(s->System.out.print(s + "\t"));				//10	11	12	13	14	15 
		System.out.println();
		
		
		//두번째 매개변수 인덱스 포함 안함
		System.out.println("IntStream.range(10,15) IntStream 생성하기"); //IntStream.range(10,15) IntStream 생성하기
		IntStream intStream4= IntStream.range(10,15);
		intStream4.forEach(s->System.out.print(s + "\t"));			  //10	11	12	13	14
		System.out.println();


		
	}

}
