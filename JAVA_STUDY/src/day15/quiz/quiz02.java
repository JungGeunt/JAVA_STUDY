package day15.quiz;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class quiz02 {

	public static int solution(int [] scoville , int k) {
		PriorityQueue<Integer> qr = new PriorityQueue<>();
		
		for (int s : scoville) {
			qr.add(s);
		}
	
	
	int mixCount = 0 ;
	
	while (qr.size() >1 && qr.peek() <k) {
		int fls =qr.poll();
		int sls =qr.poll();
		
		int mixFood = fls + (sls *2);
		
		qr.add(mixFood);
		
		mixCount++;
	}
	if(qr.peek() <k) {
		return -1;
	}
	return mixCount;
	}
	
	public static void main(String[] args) {
		
		int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        
        System.out.println(solution(scoville, k));
		
	
			
	}	
		
	
}

	

