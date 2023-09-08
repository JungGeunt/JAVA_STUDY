package day15.compare;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("홍길동", 20000);
		Employee e2 = new Employee("김찬중", 30000);
		Employee e3 = new Employee("허길자", 50000);
		Employee e4 = new Employee("이순신", 90000);
	
		
		// 자동정렬하는 TreeSet ,TreeMap 에서 정렬 할 수있는 기준을 필요함.
		//=> Comparator를 이용한 정렬 => comparator 클래스 생성 !! 이후 적용 - 생성자 추가
		TreeSet<Employee> list = new TreeSet<>(new EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for (Employee s : list) {				//김찬중:30000
			System.out.println(s);				//이순신:90000
		}										//허길자:50000
	}											//홍길동:20000

}
