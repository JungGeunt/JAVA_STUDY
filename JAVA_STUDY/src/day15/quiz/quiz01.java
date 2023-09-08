package day15.quiz;

import java.util.HashMap;

public class quiz01 {
	 public static String solution(String[] participant, String[] completion) {
		String answer ="";
		 HashMap<String ,Integer > hm = new HashMap<>();
		 //getOrDefault 메서드는 key의 값이 있다면 그값을 반환하고 없다면 defaultValue를 반환하는 메서드이다. 
		 for (String player : participant) hm.put(player, hm.getOrDefault(player, 0)+1) ; // 참여자를 집어 넣어줌 
		 for (String player : completion) hm.put(player, hm.get(player)-1); // 완주자가 들어가면서 0값으로 만듬 //완주자와 탈락자를 나눠줌
		 for (String key : hm.keySet()) {
			if(hm.get(key) !=0)
			 answer = key;
		}
		 
		 return answer; 
	 }
	
	public static void main(String[] args) {
		String[]  first_pa   = {"leo" , "kiki", "eden"};
		String[]  second_pa  = {"marina", "josipa", "nikola", "vinko" , "filipa"};
		String[]  third_pa   = {"mislav", "stanko", "mislav" , "ana"};
		String[]  first_com  = {"kiki", "eden"};
		String[]  second_com = {"marina", "josipa", "nikola", "filipa"};
		String[]  third_com  = {"stanko", "mislav" , "ana"};
		
		System.out.println("첫번째 사례 : " +solution(first_pa, first_com)); //leo
		System.out.println("두번째 사례 : " +solution(second_pa, second_com));// vinko
		System.out.println("세번째 사례 : " +solution(third_pa, third_com));//mislav
		
	}
}
