package quiz_class;

public class quiz_03 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		System.out.println("------------------");
		
		Person p2 = new Person();
		p2.age =40;
		p2.name = "김길동";
		p2.tall = 170 ;
		
		p2.info();
		
	}
	
}

class Person{
	
	String name;
	int age;
	int tall;
	
	Person(){	
	}
	
	Person(String name,int age, int tall){
		this.age = age;
		this.name = name;
		this.tall = tall;
	}
	
	
		
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
	}

}
