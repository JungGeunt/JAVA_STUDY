package day21.stream;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		//집계 함수들
		
		int [] arr = new int [100];
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
					
		}
		//리턴 값 long
		 long count =Arrays.stream(arr).count();
		 System.out.println("요소들의 갯수 : " + count ); //요소들의 갯수 : 100
		 
		 //리턴값 int 
		 int sum = Arrays.stream(arr).sum();
		 System.out.println("요소들의 합 : " +sum); //요소들의 합 : 5050
		 
		 OptionalInt first = Arrays.stream(arr).findFirst();
		 System.out.println("요소들의 중 첫번째 값 : " +first.getAsInt()); //1 get으로 호출해야함 
		 															//getAsInt를 사용 하지않았을떄(요소들의 중 첫번째 값 : OptionalInt[1]) 
		 OptionalInt max = Arrays.stream(arr).max();
		 System.out.println("요소들 중 최대 값 : " +max.getAsInt()); //요소들 중 최대 값 : 100
		 
		 OptionalInt min = Arrays.stream(arr).min();
		 System.out.println("요소들 중 최소 값 : " +min.getAsInt()); //요소들 중 최소 값 : 1
		 
		 OptionalDouble avg = Arrays.stream(arr).average();
		 System.out.println("요소들의 평균 : " + avg.getAsDouble()); //요소들의 평균 : 50.5
		 
		 
		 //OptionalXXX 클래스들은 기능이 거의 유사함.... 
		 //isPresent -반환 타입boolean, 값이 존재하는 여부
		 //orElse(T) -반환 타입 T , 기본값 설정
		 //ifPresent(Consumer) - 반환 타입 void 값이 존재하는 경우 Consumer 처리
		 System.out.println("Optional 주요 메서드 확인");
		 //요소가 없는 빈 ArrayList 객체 생성
		 List<Integer> list = new ArrayList<Integer>();
		 
		 long count1 = list.stream().count();
		 System.out.println("요소들의 갯수 : " +count1);  //요소들의 갯수 : 0
		 
		 long sum1 = list.stream().mapToInt(Integer::intValue).sum(); //Stream<Integer> 이기 때문에 저장된 정보가 객체 타입 
		 System.out.println("요소들의 합 : " +count1);  //요소들의 갯수 : 0				  	->	mapToInt로 인티저를 인트로 형변환 
		 
		 
		 //요소가 존재하는 경우에만 평균을 출력
		 OptionalDouble avg2  = list.stream().mapToInt(Integer::intValue).average(); // isPresent -> 있다면          isEmpty -> 없다면
		 if(avg.isPresent()) {
		 System.out.println("요소들의 평균 : " + avg2.getAsDouble()); // avg안에 값이 없기 때문에 예외처리가 일어남
		 }
		 
		 OptionalInt max2 =list.stream().mapToInt(Integer::intValue).max();
		 if(max2.isPresent()) { //isPresent() 
		 System.out.println("요소들 중 최대 값 : " +max2.getAsInt());
		 }
		 
		 int min2 = list.stream().mapToInt(Integer::intValue).min().orElse(0);   //orElse() 반환값이 존재하지않으면 매개변수를 리턴함
		 System.out.println("요소들 중 최소 값 : " +min2);								 //or Else는 인트 타입으로 받아야함. 
		 
		 list.stream().mapToInt(Integer:: intValue).findFirst() 				 //.ifPresent 반환타입 void 
				 				 .ifPresent(a -> System.out.println("요소 중 첫 번쨰 값 : " + a));
		 
	}

}
