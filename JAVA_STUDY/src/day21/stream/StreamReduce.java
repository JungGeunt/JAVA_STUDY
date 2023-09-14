package day21.stream;

import java.util.Arrays;
import java.util.List;

import day20.stream.Circle;
import day20.stream.Rectangle;
import day20.stream.Shape;

public class StreamReduce {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20 ,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		//Stream에서 제공하는 집계 메서드...
		double areaSum = list.stream().mapToDouble(Shape::area).sum();
		System.out.println("sum()를 이용한 면접 합계 : " +areaSum);  //sum()를 이용한 면접 합계 : 764.2919764433443
		
		//reduce() 사용
		areaSum = list.stream().mapToDouble(Shape::area)
				.reduce((a,b)-> a+b).getAsDouble();  //reduce 는 반환값이 Optional
		System.out.println("reduce(Operater) 를 이용한 면접 합계 : " +areaSum); //reduce(Operater) 를 이용한 면접 합계 : 764.2919764433443
		
		areaSum =list.stream().mapToDouble(Shape::area)            //reduce(Operater) ,   reduce(0, Operater) 계산식이 다름
				.reduce(0, (a,b) -> a + b);								 // 기본값이 설정되어 있고 결과값만 함수계산을 해서  반환 
		System.out.println("reduce(0, Operater)를 이용한 면적 합계 : " +areaSum); //reduce(0, Operater)를 이용한 면적 합계 : 764.2919764433443
		
		
	}

}
