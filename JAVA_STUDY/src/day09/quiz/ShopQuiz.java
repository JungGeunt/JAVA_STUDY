package day09.quiz;



public class ShopQuiz {

	public static void main(String[] args) {
		//Test
		Buyer b1 = new Buyer();
		b1.cash =5000000;
		b1.addToacart(new Camera("mk2", 2000000));
		b1.addToacart(new Jelly("하리보", 1700));
		b1.addToacart(new Jelly("하리보", 1700));
		b1.addToacart(new Jelly("하리보", 1700));
		b1.addToacart(new Jelly("하리보", 1700));
		b1.addToacart(new Jelly("하리보", 1700));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("엑설런트", 4300));
		b1.addToacart(new Icecream("따옴", 1200));
		
		System.out.println("===============카트 정보 ==============");	
		b1.viewCart();
		b1.buyAll();
		
		System.out.println("===============카트 정보 ==============");		
		b1.viewCart();
		System.out.println("===============트렁크 정보 =============");
		b1.viewTrunk();
		b1.addToacart(new Icecream("하겐다즈", 19800));
		b1.buyAll();
		
		for(int i =0; i<b1.t_index; i++) {
			Product p =b1.trunk[i];
			
			
				
			 if(p instanceof Camera) {
				Camera c = (Camera)p;
				c.takePicture();
			}
		}
		
		b1.receipt();
	}

}

class Buyer{
	/*
	 * Buyer의 인스턴스 변수 (상태)
	 *  필요한 만큼 사용
	 */
	int cash;
	
	//트렁크 관련 변수
	final int MAX_TRUNK_SIZE =20 ; 
	Product[] trunk =new Product[MAX_TRUNK_SIZE];
	int t_index = 0;
	
	
	//카트 관련 변수
	final int INIT_CART_SIZE =3;
	Product[] cart = new Product[INIT_CART_SIZE];
	int c_index = 0;

	
	
	
	
	
	/*
	 * Byer의 기능 (method)
	 * 1.메서드명 :buy
	 * 		기능: 지정한 물건(Product)을 구입한다.
	 * 		바이어의 돈(cash)에서 물건의 가격을 빼고,
	 * 		내 트렁크(trunk)에 담는다
	 * 		만약 가진 돈이 부족하다면 구매 할 수 없다.
	 * 	 	리턴 타입 :없음
	 * 		매개변수 : Product p 
	 */
	
	void buy(Product p) {
		if(cash < p.getPrice()) {
			System.out.println("가진 돈이 너무 적습니다.");
			return; // 함수의 종료 / 리턴을 쓰지 않으면 다음으로 진행  
		}else if(t_index == MAX_TRUNK_SIZE) {
			System.out.println("트렁크가 가득 찼습니다.");
			return;
		}else {
			cash -= p.getPrice();
			trunk[t_index++] = p; 
			//클래스를 사용하는 이유는 다양한 정보를 처리하기 위해서 굳이 하나의 값만 넣을 필요 없음.
		}
	}
	 
	 
	/*
	 * 2. 매서드 명 : buyAll
	 * 		기능  : 장바구니(cart)에 지정된 모든 물건으 구매(buy)한다.
	 * 		리턴타입 : 없음
	 * 	 	매개변수 : 없음, 
	 * Product[] cart
	 */
	
		void buyAll() {  //Product[] cart 카트 전체
			if(c_index - getNullCount() + t_index >MAX_TRUNK_SIZE) { //카트인덱스 값에서 비워있는공간 을 뺀 것과 트렁크안에 들어있는 공간 
				 System.out.println("구매하려는 물건이 너무 많습니다.");
				 return;
			}
			for(int i =0; i< c_index; i++) {
				if(cart[i] != null)
					buy(cart[i]);   //buy 메서드 사용
			}
			clearCart(); // 아래서 카트비우는 메소드를 씀 
		}
		
		private void clearCart() {//카트 비우기
			cart = new Product[INIT_CART_SIZE];
			c_index = 0;
		}
		
		
		int getNullCount() {
			int count=0;
			for(int i =0; i< c_index; i++) {
				if(cart[i] == null)
					count++;
			}
			return count;
		}
		// 구매 목록 보기
		private void viewList(Product[] pArr , int index) {
			for(int i =0 ; i< index; i++) {
				Product p = pArr[i];
				System.out.printf(i+1  + "상품명 [%s], 가격[%d]\n", p.getName() ,p.getPrice());
			}
		}
		
		//트렁크 보기
		public void viewTrunk() {
			viewList(trunk, t_index);
		}
		
		//카트 보기
		public void viewCart() {
			viewList(cart, c_index);
		}
		
	/*
	 * 3. 메서드명 : addToCart
	 * 		기능  :지정한 물건을 장바구니에 담는다
	 * 			만약 장바구니에 담을 공간이 부족하면
	 * 			장바구니 배열의 크기를 2배로 늘린 다음에 담는다.
	 * 	 리턴타입 : 없음
	 * 	 매개변수 : Product p 
	 */		
	void addToacart(Product p) { 
		//카트공간이 비어 있는 경우
		for(int i =0; i< c_index; i++) {
			if(cart[i] == null) {
				cart[i]=p;
			System.out.println("비어있는곳 " + i + "넣었습니다."); 
			return;
			}
	}
		//카트공간이 없는 경우 2배씩 증가...
		if(c_index == cart.length) {
			Product[]newCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, newCart, 0, cart.length); // 배열을 카피해서 뉴카트에 넣어줌
			cart = newCart; 		 //cart라는 변수를 사용해야되서 다시 cart에 넣어줌 주소값을 가져감
		}
		cart[c_index++] = p; //실제 상품 저장 
	}
	
	
	/* 4. 메서드 명 :cancel
	 * 		기능 : 지정한 물건을 장바구니에서 뺀다.
	 * 			뺀곳에는 다시 물건을 담을 수 있어야 한다.
	 * 		리턴타입 : 없음 
	 * 		매개변수 : int cart_index
	 */
	
	void cancel(int cart_index) { //c_index배열이 아닌  cart_index여서 1번 카트 부터 시작 하기때문
		cart[cart_index - 1 ] = null;  
		
		
	}
	/*5. 매서드명 :receipt
	 * 		기능 : 바이어가 구매한 물건의 목록과 사용금액 남은 금액을 출력한다.
	 * 	리턴타입,매개변수 :없음 
	 */
	
	void receipt() {
		//구매한 물건 목록 보여주기  
		viewTrunk(); //트렁크를 보여주는 메소드 
		
		//사용 금액과 남은 금액 출력
		System.out.println("사용 금액 : " + getTotalPrice(trunk, t_index));
		System.out.println("남은 금액 : " + cash);
	}
	
	int getTotalPrice(Product[] pArr , int index) {
		int price =0;
		for(int i = 0; i < index; i++) {
			price += pArr[i].getPrice();
		}
		
		return price;
	}
	
}

/*product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요.
 * (단 , Product 쿨래스를 변경하면 안됨)
 * 
 */


class Product{ // 부모 클래스 사용 할 예정 
	
	String name ;
	private int price;// private :내 클래스 내부에서만 사용하려고함 .
	public Product(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
}

class Camera extends Product{
	//상속 받은 클래스는 생성자에서 반드시 부모 생성자를 호출
	//호출하지 않으면 기본 타입으로 생략되어 있다.
	
	//아무것도 적지 않은 생성자에는 super()가 생략 되어있다 .

	//Product라는 부모클래스에는 기본 생성자가 없기 때문에
	//super(int price)타입의 생성자를 반드시 호출해야 합니다.
	
    public Camera(String name ,int price) {
    	super(price);
    	this.name =name;
    }
    
    void takePicture(){
    	System.out.println("사진을 찍습니다.");
    }
	
}
	
class Jelly extends Product{
	
	public Jelly(String name ,int price) {
		super(price);
		this.name = name;
	}
	void eatJelly() {
		System.out.println(name + "젤리를 먹습니다.");
	}
}

class  Icecream extends Product{
	
	public Icecream(String name ,int price) {
		super(price);
		this.name = name;
}
}

 