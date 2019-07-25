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
	 * 1. void Buy(Product p) { ��� : ������ ������ ���� money���� price�� ���� Ʈ��ũ(trunk)�� ��´�
	 * if, money�� �����ϸ� break; Receipt();
	 * 2. void BuyAll(product[] cart) { ��� : ��ٱ��Ͽ� ����� ������ ��� ���� ����� buy�� ���� } 
	 * 3. void Add(Product p){ ��� : ������ ������ ��ٱ��Ͽ� ��´�. if, ��ٱ��Ͽ� ������ ������ ��ٱ��� �迭��
	 * ũ�⸦ 2��� �ø����� ��´�. }
	 * 4. void Receipt(){ ��� : ���� ���, ���ݾ�, ���� �ݾ� ��� }
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
		System.out.println("ó���ݾ�" + money);

		cartIndex = 0;
		trunkIndex = 0;

	}

	void Buy(Product p) {
		int price = p.getPrice();

		if (money < price) {
			System.out.println("���� ����");
			return;
		} else if (trunk.length == trunkIndex) {
			System.out.println("Ʈ��ũ�� ����");
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
			System.out.println("��ٱ��� ��");
			return;
		}
		if (money < getTotalPrice(cart, cartIndex)) {
			System.out.println("������ �ʹ� �����ϴ�.");
			return;
		} else if (cartIndex + trunkIndex > trunk.length) {
			System.out.println("Ʈ��ũ�� �����մϴ�.");
			return;
		}
		for (int i = 0; i < cartIndex; i++) {
			Buy(cart[i]);
		}
		// ������ ���
		System.out.println("���� ����");
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
			System.out.println(trunk[i].getName() + " : " + trunk[i].getPrice() + "����");
		}
		System.out.println("============================================");
		System.out.println("���� �ݾ� : " + getTotalPrice(trunk, trunkIndex) + "\t\t\t �ܾ� : " + money);
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