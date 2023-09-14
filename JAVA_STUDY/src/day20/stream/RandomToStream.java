package day20.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {

	public static void main(String[] args) {
		// Random.ints()
		System.out.println("int 형 난수 스트림 : "); // 
		//ints(3) 3개;
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.print(s + " ")); //1805336325 -371370966 -1667828628 
		
		System.out.println();
		
		
		//ints(객수, 시작값, 끝 값 전(포함x))
		isr = new Random().ints(10,0,3);
		isr.forEach(s-> System.out.print(s + " "));  //2 2 1 0 2 0 2 1 1 1 
		System.out.println();
		
		
		System.out.println("long 형 난수 스트림"); 				//long 형 난수 스트림
		//longs (갯수 , 시작값, 끝값 전 (포함X))
		LongStream lsr = new Random().longs(3, 0, 10); // 3개의 값을 / 0부터 10까지 범위내에서 
		lsr.forEach( s -> System.out.print(s + " ")); 	//6 4 0
		System.out.println();
		
		
		System.out.println(" double 형 난수 스트림");			// double 형 난수 스트림
		//doubles()
		DoubleStream dsr = new Random().doubles(3);  //0.18204697649135326 0.9248669056161948 0.546617965112884
		dsr.forEach(s -> System.out.print(s + " "));
		
		
		
	}

}
