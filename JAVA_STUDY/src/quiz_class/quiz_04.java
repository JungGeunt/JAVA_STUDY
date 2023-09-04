package quiz_class;

public class quiz_04 {

	public static void main(String[] args) {
		Account myAcc = new Account("홍길동", "1234", 3600);
		
		myAcc.deposit(800);
		myAcc.WithDrwa(1900);
		
		int bal =myAcc.getbalace();
		System.out.println(myAcc.name + "님의 계좌 잔액은 : " + bal + "원입니다.");
		
	}

}

class Account {
	String name;
	int password;
	int balace;
	
	
	Account(){
	}
	
	Account(String name,String password,int balace){
		this.name = name;
		this.password =Integer.parseInt(password);
		this.balace= balace;
	}
	
	void deposit(int money) { //입금 기능
		balace += money;
	}
	
	void WithDrwa(int money) {//출금 기능
		balace -= money;
	}
	int getbalace() {
		
		return balace;
	}
	
	
}