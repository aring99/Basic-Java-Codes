package shapeDrawer;
public class Rectangle extends Shape {
	int z = 0;
	int f = 0;

	Rectangle(int x, int y, int z, int f) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.f = f;
	}

	private int height = z;
	private int width = f;

	public void calculatePoints(int x, int y) {
		// tl,tr,br,bl
		LeftTop.setLocation(x, y);
		points.add(LeftTop);
		RightTop.setLocation(x + f, y);
		points.add(RightTop);
		RightBottom.setLocation(x + f, y + z);
		points.add(RightBottom);
		LeftBottom.setLocation(x, y + z);
		points.add(LeftBottom);
	}

	public double calculateArea() {
		double result = (double) (f * z);
		return result;
	}

	public double calculatePerimeter() {
		double result2 = (double) (2 * f + 2 * z);
		return result2;
	}

	public String toString() {
		return "Rectangle[h=" + z + "," + "w=" + f + "]" + "\n" + "Points[" + "("
				+ (int) (points.get(points.indexOf(LeftTop))).getX() + ","
				+ (int) (points.get(points.indexOf(LeftTop))).getY() + ")" + "("
				+ (int) points.get(points.indexOf(RightTop)).getX() + ","
				+ (int) points.get(points.indexOf(RightTop)).getY() + ")" + "("
				+ (int) (points.get(points.indexOf(RightBottom))).getX() + ","
				+ (int) (points.get(points.indexOf(RightBottom))).getY() + ")" + "("
				+ (int) points.get(points.indexOf(LeftBottom)).getX() + ","
				+ (int) points.get(points.indexOf(LeftBottom)).getY() + ")" + "]" + "\n" + "Area=" + calculateArea()
				+ "\n" + "Perimeter=" + calculatePerimeter();
	}
	public void move(int newx, int newy) {
		// TODO Auto-generated method stub
		x=newx;
		y=newy;
		LeftTop.setLocation(newx, newy);
		RightTop.setLocation(x+f, y);
		RightBottom.setLocation(x+f, y+z);
	LeftBottom.setLocation(x, y+z);
			}
}