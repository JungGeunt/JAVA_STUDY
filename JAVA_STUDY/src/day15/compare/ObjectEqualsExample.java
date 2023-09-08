package day15.compare;

import java.util.HashSet;
import java.util.TreeSet;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		//객체간의 동등 비교...
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈",  "삐삐", 5);
		Dog d3 = new Dog("진돗개",  "뽀삐", 15);
		
		//Dog d3 = d1 ;
		System.out.println(d1 == d3);  //false
		//다른 객체로 만들어지면 값이 같다고 할지라도 false 주소 값까지 같아야험
		System.out.println(d1.equals(d3)); //true
		System.out.println(d1); //Dog [ dogId= 진돗개, dogName =뽀삐]1919564487
		System.out.println(d3); //Dog [ dogId= 진돗개, dogName =뽀삐]1919564487
		
		//HashSet은 동등비교를 통해서 같은 객체인지 아닌지 비교!
		HashSet<Dog> set = new HashSet<Dog>();
		System.out.println(set.add(d1)); //true - 제대로 set에 들어갔음
		System.out.println(set.add(d3));  //false  set은 동일한 값(중복값)을 허용하지 않음
		System.out.println(set.add(d2));
		
		for (Dog dog : set) {				//Dog [ dogId= 진돗개, dogName =뽀삐]1919564487
			System.out.println(dog);		//Dog [ dogId= 말티즈, dogName =삐삐]-1607367988
		}
		
		//TreeSet
		TreeSet<Dog> tset = new TreeSet<>();
		System.out.println(tset.add(d1));
		System.out.println(tset.add(d2));
		for (Dog dog : tset) {				//Dog [ dogId= 말티즈, dogName =삐삐]-1607367988
			System.out.println(dog);		//Dog [ dogId= 진돗개, dogName =뽀삐]1919564487
		}
	}

}
