import java.util.ArrayList;

public class Item {
	String itemname;
	int itemnumber;
	int itemcost;
	
	Item(String itemname,int itemnumber, int itemcost){
		this.itemname=itemname;
		this.itemcost=itemcost;
		this.itemnumber=itemnumber;
	}
	ArrayList<Item> Items = new ArrayList<Item>();
	Item itemtester = new Item("test",0,0);
	public Item getItem() {
		return itemtester;
	}
	public void setItem(Item itemtester) {
		this.itemtester=itemtester;
	}
//(sellable shop items)
public String toString() {
	return itemname+" : "+itemcost;
}

public int getItemcost() {
	return itemcost;
}
public void setItemcost(int itemcost) {
	this.itemcost = itemcost;
}
}
