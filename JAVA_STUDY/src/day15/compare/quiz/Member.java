package day15.compare.quiz;

public class Member implements Comparable<Member>{

	String name;
	int memberNum;
	
	public Member() {}


	
	public Member(String name, int memberNum) {
		super();
		this.name = name;
		this.memberNum = memberNum;
	}


	@Override
	public String toString() {
		
		return name + ":" +memberNum ;
		//return String.format("%s [%d]" , name, memberNum);

	}



	@Override
	public int compareTo(Member o) {
		return this.memberNum- o.memberNum;
		//리턴 값이 무엇인지에 따라 작동을 다르게함.
	 //CompareTo() 메서드 사용법 (매개변수로 비교 대상은 전달)
		//	- 현재 인스턴스와 o의 자리를 바꾸고 싶은 경우1
		// 	-현재 인스턴스와 o의 자리를 그대로 유지하고 싶다면 -1
		//	-현재 인스턴스와 o의 값이 같은 경우 0
		
		//다른 방법
		//int next = o.memberNum;
//		System.out.println(memberNum + "vs" +next);
//		if(memberNum < next) {
//			return -1;
//		}else if(memberNum> next) {
//			return 1;
//		}else {
//			return 0;
//		}
		
			}
	
	
	
	
	
	
	
	
}
