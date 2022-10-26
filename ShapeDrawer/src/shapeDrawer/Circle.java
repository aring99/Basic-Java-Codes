package shapeDrawer;
public class Circle extends Shape {
	int r = 0;
	double pi = Math.PI;

	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	isCircular = true;
	}

	private int radius = r;

	public void calculatePoints(int x, int y) {
		TopLeft.setLocation(x, y);
		points.add(TopLeft);
		BottomRight.setLocation(x + 2 * r, y + 2 * r);
		points.add(BottomRight);
	}

	public double calculateArea() {
	double result = (double) (pi * r * r);
		result= result*100;
		double resultest= Math.round(result);
		resultest=resultest/100;
		resultest= Math.round(resultest);
		return resultest;
	}

	public double calculatePerimeter() {
		double result2 = (double) (pi * 2 * r);
		result2= result2*100;
		double resultest2= Math.round(result2);
		resultest2=resultest2/100;
		resultest2= resultest2*10;
		resultest2=Math.round(resultest2);
		resultest2=resultest2/10;
		return resultest2;
	}

	public String toString() {
		return "Circle[r=" + r + "]" + "\n" + "Points[" + "(" + (int)(points.get(points.indexOf(TopLeft))).getX() + ","
				+ (int)(points.get(points.indexOf(TopLeft))).getY() + ")" + "("
				+ (int)points.get(points.indexOf(BottomRight)).getX() + "," + (int)points.get(points.indexOf(BottomRight)).getY()
				+ ")" + "]" + "\n" + "Area=" + calculateArea() + "\n" + "Perimeter=" + calculatePerimeter();
	}
	public void move(int newx, int newy) {
		// TODO Auto-generated method stub
		x=newx;
		y=newy;
		TopLeft.setLocation(newx, newy);
		BottomRight.setLocation(x + 2 * r, y + 2 * r);
			}
}