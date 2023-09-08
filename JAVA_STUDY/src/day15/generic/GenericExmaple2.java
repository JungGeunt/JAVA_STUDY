package day15.generic;

import java.util.ArrayList;

public class GenericExmaple2 {

	public static void main(String[] args) {
		
		Wallet<Card,Money> card_Wallet = new Wallet<>("파란색");
		Wallet<CreditCard,Money> card_Wallet2 = new Wallet<>("하늘색");
		
	//	Wallet<String,Integer> card_Wallet = new Wallet<>("하늘색");
		// 위에 것이 안되는 이유는 ? 정의시 제한 걸려 있음 .

		card_Wallet.pouch.add(new CreditCard());
		card_Wallet.pouch.add(new BusCard());
		card_Wallet.pouch.add(new CheckCard());
		
		
		card_Wallet2.pouch2.add(new Dollar());
		card_Wallet2.pouch2.add(new Won());
		
		
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> apple_list = new ArrayList<>();
		
		str_list.add("제네릭 때문에 문자열만 들어가요");
		str_list.add("이유? 이건 문자열 제너릭 컬레션이니까요");
		int_list.add(100);
		int_list.add(new Integer(20));
		apple_list.add(new Person<String>("홍길동", 11));
		
		usingArrayListMethod(apple_list);
		usingArrayListMethod(str_list);
		usingArrayListMethod(int_list);
		
		usingArrayListMethod(card_Wallet);
		usingArrayListMethod(card_Wallet2);
		
		
	}
	
	
	//제너릭이 다른 것만으로는 오버로딩을 할 수 없다 ...(타입이 다른 경우는 상관없음.)
	//static void usingArrayListMethod(ArrayList<String> list) {
	//	System.out.println(list);
	
	
	
	// <?> : 와일드 카드. 제너릭 타입으로 오버로드를 구현하고 싶을 때 사용!
	static void usingArrayListMethod(ArrayList<?> list) {
		System.out.println(list);
	}
	
	static void usingArrayListMethod(Wallet<? extends Card,? extends Money> w) {
		System.out.println(w);
	}

}

//제너릭에 extends 는 타입의 범위를 제한하는 역할을 한다.
// 지갑클래스 생성
// -One extends Card :첫번째 탑입은 Card를 상속 받는 클래스만 허용
//-Two extends Money: 두번째 타입은 Money를 상속받는 클래스만 허용
class Wallet <One extends Card , Two extends Money> {
	
	ArrayList<One> pouch;
	ArrayList<Two> pouch2;
	String color;
	
public Wallet(String color) {
		pouch= new ArrayList<>();
		pouch2= new ArrayList<>();
		this.color=color;
	
}
	public One get(int index) { 
		return pouch.get(index);
	}
	
	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다.";
	}
	
}

class Card{ }


class CreditCard extends Card{}
class CheckCard extends Card{}
class BusCard extends Card{}
class IdCard extends Card{}


class Money { } 
class Won extends Money{}
class Dollar extends Money{}