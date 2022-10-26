package shapeDrawer;

import java.awt.Point;

public class Square extends Shape {
	int z = 0;

	Square(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	private int edge = z;

	public void calculatePoints(int x, int y) {
		// tl,tr,br,bl
		LeftTop.setLocation(x, y);
		points.add(LeftTop);
		RightTop.setLocation(x + z, y);
		points.add(RightTop);
		RightBottom.setLocation(x + z, y + z);
		points.add(RightBottom);
		LeftBottom.setLocation(x, y + z);
		points.add(LeftBottom);
	}

	public double calculateArea() {
		double result = (double) (z * z);
		return result;
	}

	public double calculatePerimeter() {
		double result2 = (double) (4 * z);
		return result2;
	}

	public String toString() {
		return "Square[e=" + z + "]" + "\n" + "Points[" + "("
				+ (int) (points.get(points.indexOf(LeftTop))).getX() + ","
				+ (int) (points.get(points.indexOf(LeftTop))).getY() + ")" + "("
				+ (int) points.get(points.indexOf(RightTop)).getX() + ","
				+ (int) points.get(points.indexOf(RightTop)).getY() + ")" + "("
				+ (int) (points.get(points.indexOf(RightBottom))).getX() + ","
				+ (int) (points.get(points.indexOf(RightBottom))).getY() + ")" + "("
				+ (int) points.get(points.indexOf(LeftBottom)).getX() + ","
				+ (int) points.get(points.indexOf(LeftBottom)).getY() + ")" + "]" + "\n" + "Area=" + calculateArea() + "\n" + "Perimeter="
				+ calculatePerimeter();
	}
	public void move(int newx, int newy) {
		x=newx;
		y=newy;
		LeftTop.setLocation(newx, newy);
		RightTop.setLocation(x+z, y);
		RightBottom.setLocation(x+z, y+z);
	LeftBottom.setLocation(x, y+z);
			}
}