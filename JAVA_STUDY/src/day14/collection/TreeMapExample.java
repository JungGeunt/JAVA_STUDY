package day14.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> account =new TreeMap<>();
		
		account.put("홍길동", 10000);
		account.put("이순신", 50000);
		account.put("정준수", 90000);
		account.put("허현수", 70000);
		
		System.out.println(account);  //{이순신=50000, 정준수=90000, 허현수=70000, 홍길동=10000}
		
		System.out.println();
		System.out.println("허현수 : " + account.get("허현수"));			 //허현수 : 70000
		
		System.out.println();											//이순신:50000
		Set<Map.Entry<String, Integer>> s = account.entrySet();			//정준수:90000		
		for(Map.Entry<String, Integer> me : s) {						//허현수:70000
			System.out.println(me.getKey() + ":" + me.getValue());	    //홍길동:10000
		}

		System.out.println();											//이순신::50000
		Set<String> ss = account.keySet();								//정준수::90000
		for (String key : ss) {											//허현수::70000  
			System.out.println(key + "::" + account.get(key));			//홍길동::10000
		}										//get에 키값을 넣어 밸류값을 받아옴
		
		
	}

}
