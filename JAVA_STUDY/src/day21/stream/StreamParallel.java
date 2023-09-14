package day21.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

	public static void main(String[] args) {
		// 병렬처리 : 경우에 따라 다름 .CPU 코어에 영향을 받음 ...Core가 하나(싱글코어)면?  순차적 처리 나음 
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		//stream() 순차적 스트림 처리
		list.stream().forEach(a -> {
		 try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 :" + (end -start) + " nano sec");
		
		start =System.nanoTime();
		//parallelStream()병렬 스트림
		list.parallelStream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		});
		end= System.nanoTime();
		
		System.out.println("병렬 처리 스트림 처리 시간 : " + (end -start)+ "nano sec");
	}

}
