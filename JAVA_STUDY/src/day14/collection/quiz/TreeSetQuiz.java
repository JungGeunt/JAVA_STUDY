package day14.collection.quiz;

import java.util.TreeSet;

public class TreeSetQuiz {

	// TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
	// 1. TreeSet을 생성하세요.
	// 2. 무한 루프를 사용하여 1~45까지의 난수를발생시키세요.
	// 3. 발생한 난수를 추가합니다.
	// 4. 크기가 6이되면 무한 루프를 빠져나옵니다.
	
	public static void main(String[] args) {
			//1
			TreeSet<Integer> tr = new TreeSet<>();
			
			
			int six=0;
			//2
			while(true) {
			
				int rand =(int)(Math.random()*45 )+1; //난수 생성
				//3.
				tr.add(rand);
				
				//4
				six++;
				if(six == 6) break;
					
				}
				System.out.println("로또 번호 : "  + tr);
			}
		 

	}


