import java.awt.Point;
import java.util.ArrayList;

public class Shop {
String name= "Shop";
Player player;
Item Itemusing= new Item("hi",0,0);
int height;
int width;
int x, y = 0;
protected ArrayList<Point> points = new ArrayList<Point>();

public void sell() {
	if(player.getWallet() < Itemusing.getItemcost() ) {
		System.out.println("Sorry, you can not afford that item!");
	} else {
		int result=player.getWallet()-Itemusing.getItemcost();
		player.setWallet(result);
		player.inventory.add(Itemusing);
		System.out.println("Thank you for your purchase!");
	}
	
}
//sell()
public void restock() {
	
}
public void showstock() {
	System.out.println(Itemusing);
}
//get items()
//set items()
public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
}

