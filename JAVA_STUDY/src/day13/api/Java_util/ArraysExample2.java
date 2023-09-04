package day13.api.Java_util;

import java.util.Arrays;

public class ArraysExample2 {

	public static void main(String[] args) {
		// 
		int[] scores = { 75, 47, 23, 56, 89};
		System.out.println("원본");
		System.out.println(Arrays.toString(scores));
		
		//배열의 데이터를 오름차순으로 정렬! -sort()
		int[] socres2 = Arrays.copyOf(scores, scores.length);
		Arrays.sort(socres2);
		System.out.println("오름차순으로 정렬");
		System.out.println(Arrays.toString(socres2));

		//배열내부데이터의 인덱스를 탐색하는 메서드 binarySearch()
		int index =Arrays.binarySearch(socres2, 75);
		System.out.println("75가 있는 인덱스 번호 : "+ index);
		
		//배열의 equals() 
		int [] scores3 = Arrays.copyOf(scores, scores.length);
		
		if(Arrays.equals(scores, scores3)){
		System.out.println("배열의 각 항목이 모두 일치함");
		}else {
			System.out.println("배열의 각 항목이 일치하지 않음");
		}
	}
	}	
	


