package quiz_java;

import java.util.ArrayList;

public class Quiz_java1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); //교집합
		ArrayList cha1 = new ArrayList(); //차집합
		ArrayList cha2 = new ArrayList(); //차집합
		ArrayList hap = new ArrayList(); //합집합 
		
		
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	
	list2.add(3);
	list2.add(4);
	list2.add(5);
	list2.add(6);
	
	//합집합
	hap.addAll(list1);
	hap.addAll(list2);
	hap.removeAll(list2);
	hap.addAll(list2);
	
	//차집합
	cha1.addAll(hap);
	cha1.removeAll(list2);
	
	cha2.addAll(hap);
	cha2.removeAll(list1);
	
	
	//교집합
	kyo.addAll(hap);
	kyo.removeAll(cha1);
	kyo.removeAll(cha2);
	
	
	
	
	
	System.out.println("list1=" + list1);
	System.out.println("list2=" + list2);
	System.out.println("kyo=" +kyo);
	System.out.println("cha=" +cha1);
	System.out.println("hap=" +hap);
	}

}
