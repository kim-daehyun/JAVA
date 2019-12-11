package day7;

class Product {
	String name;
	int balance;
	int price;

		Product() {
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}

	Product(String p1, int p2, int p3) {
		name = p1;
		balance = p2;
		price = p3;   //this로 적용할 것
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int getPrice() {
		return price;
	}

}
public class ProductTest {
	public static void main(String[] args) {
		Product p[] = new Product[5];

		p[0] = new Product();
		p[1] = new Product("자바의 정석", 10, 10000);
		p[2] = new Product("물마시기의 정석", 1, 1000);
		p[3] = new Product("스마트폰의 정석", 2, 40000);
		p[4] = new Product("컴퓨터의 정석", 3, 60000);
		
		for(int i=0;i<p.length;i++) {
			System.out.printf("%s\t\t%d\t%,d원\n",p[i].getName(),p[i].getBalance()
					,p[i].getPrice());
		}
		
		
	
		
		
	}
}
