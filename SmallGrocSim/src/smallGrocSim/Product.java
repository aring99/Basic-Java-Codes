package smallGrocSim;

import java.util.*;

public class Product {
	int productNo = 1;
	String name = "";
	String type = "";
	int cost = 0;

	public Product(String name, String type, int cost, int productNo) {
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.productNo=productNo;
	}

	public String toString() {
		return "Product #" + productNo +":"+" "+ name +" "+ "(" +type +")"+" " + cost +"$";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getProductNo() {
		return productNo;
	}
}
