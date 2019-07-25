package answer;

public class Main0725 {

	public static void main(String[] args) {

		Buyer b = new Buyer();

//		b.Add(new TV());
//		b.Add(new TV());
//		b.Add(new TV());
//		b.Add(new PC());
//		b.Add(new PC());
//		b.Add(new MP3());
//		b.Add(new MP3());
//		b.Add(new MP3());
//		b.BuyAll();

		b.Buy(new TV());
		b.Receipt();
	}
}

class Buyer {
	/*
	 * 1. void Buy(Product p) { 기능 : 지정된 물건을 구입 money에서 price를 빼고 트렁크(trunk)에 담는다
	 * if, money가 부족하면 break; Receipt();
	 * 2. void BuyAll(product[] cart) { 기능 : 장바구니에 저장된 물건을 모두 구입 기능은 buy와 같다 } 
	 * 3. void Add(Product p){ 기능 : 지정된 물건을 장바구니에 담는다. if, 장바구니에 공간이 없으면 장바구니 배열의
	 * 크기를 2배로 늘린다음 담는다. }
	 * 4. void Receipt(){ 기능 : 구입 목록, 사용금액, 남은 금액 출력 }
	 */

	int money;
	Product[] trunk;
	Product[] cart;

	int cartIndex;
	int trunkIndex;

	Buyer() {
		cart = new Product[3];
		trunk = new Product[30];
		money = (int) (Math.random() * 5000) + 5000;
		System.out.println("처음금액" + money);

		cartIndex = 0;
		trunkIndex = 0;

	}

	void Buy(Product p) {
		int price = p.getPrice();

		if (money < price) {
			System.out.println("돈이 부족");
			return;
		} else if (trunk.length == trunkIndex) {
			System.out.println("트렁크가 가득");
			return;
		} else {
			money -= price;
			trunk[trunkIndex++] = p;
		}
	}

	int getTotalPrice(Product[] products, int index) {
		int total = 0;

		for (int i = 0; i < index; i++) {
			total += products[i].getPrice();
		}
		return total;
	}

	void BuyAll() {
		if(cartIndex ==0) {
			System.out.println("장바구니 빔");
			return;
		}
		if (money < getTotalPrice(cart, cartIndex)) {
			System.out.println("담긴양이 너무 많습니다.");
			return;
		} else if (cartIndex + trunkIndex > trunk.length) {
			System.out.println("트렁크가 부족합니다.");
			return;
		}
		for (int i = 0; i < cartIndex; i++) {
			Buy(cart[i]);
		}
		// 영수증 출력
		System.out.println("구매 성공");
		Receipt();
		cartIndex = 0;
	}

	void Add(Product p) {
		if (cartIndex == cart.length) {
			Product[] save = cart;
			cart = new Product[cartIndex * 2];

			int i = 0;
			for (Product s : save) {
				cart[i++] = s;
			}
		}

		cart[cartIndex++] = p;
	}

	void Receipt() {
		for (int i = 0; i < trunkIndex; i++) {
			System.out.println(trunk[i].getName() + " : " + trunk[i].getPrice() + "만원");
		}
		System.out.println("============================================");
		System.out.println("구매 금액 : " + getTotalPrice(trunk, trunkIndex) + "\t\t\t 잔액 : " + money);
	}

}

class Product {
	String name;
	int price;

	Product(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	String getName() {
		return name;
	}
}

class TV extends Product {
	TV() {
		super(100);
		name = "TV";
	}
}

class PC extends Product {
	public PC() {
		super(200);
		name = "PC";
	}
}

class MP3 extends Product {
	public MP3() {
		super(50);
		name = "MP3";
	}
}