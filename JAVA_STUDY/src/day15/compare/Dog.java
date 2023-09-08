package day15.compare;

public class Dog  implements Comparable<Dog>{

	String dogId;
	String dogname;
	int weight;
	
	//Comparable 인터페이스의 추상 메서드
	@Override
	public int compareTo(Dog o) {
		return this.weight -o.weight;
	}
	
	
	
	public Dog(String dogId, String dogname, int weight) {
		super();
		this.dogId = dogId;
		this.dogname = dogname;
		this.weight = weight;
	}
													//비교값을 집어 넣기 위해 해쉬코드를 사용
	public String toString() {
		return "Dog [ dogId= " + dogId + ", dogName =" + dogname+ "]" +this.hashCode(); 
	}

	
	//getter setter
	public String getDogId() {
		return dogId;
	}

	public void setDogId(String dogId) {
		this.dogId = dogId;
	}

	public String getDogname() {
		return dogname;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//객체는 만들어지면 독립적이여서 같은 값을 가지고 있어도 같을 수 없음
	
	//객체 간의 비교를 하기 위해서는 반드시 hashCode(), equals()를 둘다 재정의해야 함.
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true; // 생성됭 객체 그 자체를 비교하는 상황  //주소까지 같은 상황
		if(obj == null) return false; //obj의 객체가 생성되지 않은 상황
		if(getClass() != obj.getClass()) return false; // 생성 클래스 비교
		//내부 멤버에 대한 비교...
		Dog other =(Dog)obj;
		if(dogId == null) {
			if(other.dogId != null) {
				return false;
			}
		}else if(!dogId.equals(other.dogId)) {
			return false;
		}
		if(dogname == null) {
			if(other.dogname != null)
				return false;
		}else if(!dogname.equals(other.dogname)) {
			return false;
		}
		//weight
		if(weight != other.weight)return false;
		return true; //위에 false인 경우 해당되지 않으면 true 
	}

	@Override
	public int hashCode() { //해시코드가 같다고 꼭 같은 값을 가진것은 아님.
		final int prime =31;
		int result =1 ;
		result = prime * result + ((dogId == null)? 0:dogId.hashCode());
		result = prime * result + ((dogname== null)? 0: dogname.hashCode());
		result = prime * result + weight;
		return result;
	}
	
	
	
	
}
