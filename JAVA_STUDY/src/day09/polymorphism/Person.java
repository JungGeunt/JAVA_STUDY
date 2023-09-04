package day09.polymorphism;


public class Person {
  
	//이름과 나이
	public String name;
	public int age;
	protected float height;
	float weight;
	
	
	
	public String getDetails() {
		return "이름: " +name+"\t나이: "+age;
	}
	
	
	public Person (String name, int age) {//Person (String ,int)
		this.name =name;
		this.age =age;
	}


	
	//생성자의 첫 라인은 반드시 super() 또는 this()가 와야 합니다.
	public Person() {
		this("이름 없음", 1);
		
	}
	public Person(String name) {
		this(name,1);
	}
	
	public Person(String name ,int age , float height) {
		this(name,age);
		this.height=height; // this는 이미 만들어져있는 생성자를 참조
							// this.(name, age ,height)는 안됨 
	}
	
	public void walk() {
		System.out.println(name + "는 걸어가요");
	}
	
	@Override
	public int hashCode() {
		final int prime =31;
		int result =1;
		result = prime * result +age;
		result = prime * result +((name ==null)? 0:name.hashCode());
		return result;
	}
	
	
	@Override
	//person과  Object를 비교하기위한
	public boolean equals(Object obj) {
		if(this == obj ) {//동일한 객체
			return true;
		}
		if(obj == null) return false; //null값 확인
		if(getClass()!= obj.getClass()) return false; //객체 생성 클래스 확인
		Person other =(Person)obj; //person과 비교하기 위해 Person으로 캐스팅함 객체타입을 같게 만들어줌 
		if(age != other.age) return false;//
		if(name == null) {
			if(other.name != null) {
				return false;//객체 내에 이름확인
			}
		}else if(!name.equals(other.name))return false;
		return true; //주소 값만 다른 같은 결과 값
	}
	
	 @Override
	public String toString() {
		return "Person [name = "+name+ ", age ="+age +"]";
	}
	
	
	
	
}
