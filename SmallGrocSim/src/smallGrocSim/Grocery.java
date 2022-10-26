package smallGrocSim;

public class Grocery implements StockInterface {
	int amount=0;
	int price=0;
	public Grocery(Product product, int price, int amount) {
		this.product = product;
		this.amount = amount;
		this.price = price;
	}

	Product product = new Product(null, null, 0, 0);
	

	public void setStockAmount(int newAmount) {
		amount = newAmount;
	}

	public void setStockPrice(int newPrice) {
		price = newPrice;
	}

	public int getStockAmount() {
		return amount;
	}

	public int getStockPrice() {
		return price;
	}
	//Product #1: Carrot (Vegetables) 6$, selling at 6$ with 50 left
	public String toString() {
		return "Product #" + product.getProductNo() +":"+ " "+product.name+" " + "(" +product.type +")" +" "+ product.cost +"$"+"," +" selling at " + amount + "$"+" with"+" "+ price +" left";
	}
}
