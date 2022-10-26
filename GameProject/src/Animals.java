import java.awt.Point;
import java.util.ArrayList;

public abstract class Animals extends Entity {
	String name;
	int height;
	int width;
	protected ArrayList<Point> points = new ArrayList<Point>();
	public Animals( int x, int y) {
		super(x,y);
		
		
	}

//public void move()
//public void eat()
// public void sound()
//overwrite the below
//public void move()
//public void eat()
// public void sound()
// requirement

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

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
