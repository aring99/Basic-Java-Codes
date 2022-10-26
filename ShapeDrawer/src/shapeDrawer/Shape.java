package shapeDrawer;
import java.awt.Point;
import java.util.ArrayList;

public class Shape implements Movable{
	
	int x, y = 0;
	private double area = 0.0;
	private double perimeter = 0.0;
	protected boolean isCircular = false;
	protected ArrayList<Point> points = new ArrayList<Point>();
	protected Point LeftTop = new Point(x, y);
	protected Point RightTop = new Point(x, y);
	protected Point RightBottom = new Point(x, y);
	protected Point LeftBottom = new Point(x, y);
	protected Point TopLeft = new Point(x, y);
	protected Point BottomRight = new Point(x, y);

 public void calculatePoints(int x, int y) {
		if (isCircular = false) {
			// tl,tr,br,bl
			LeftTop.setLocation(x, y);
			points.add(LeftTop);
			RightTop.setLocation(x, y);
			points.add(RightTop);
			RightBottom.setLocation(x, y);
			points.add(RightBottom);
			LeftBottom.setLocation(x, y);
			points.add(LeftBottom);
		} else {
			TopLeft.setLocation(x, y);
			points.add(TopLeft);
			BottomRight.setLocation(x, y);
			points.add(BottomRight);
		}
	}

	public double calculateArea() {
		double result1 = 0.0;
		return result1;
	}

	public double calculatePerimeter() {
		double result2 = 0.0;
		return result2;
	}

	public String toString() {
		return "hi";
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public void move(int newx, int newy) {
		// TODO Auto-generated method stub
		x=newx;
		y=newy;
		LeftTop.setLocation(newx, newy);
		
	}

}
