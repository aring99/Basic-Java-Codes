import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Bullet extends Entity {
	int height;
	int width;
	int speed;
	int directionchecker = 0;

	Bullet(int x, int y) {
		super(x, y);
	}

	public void update() {
		x+=2;
	}
	public void update2() {
		x-=4;
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getBulletImage(), x, y, null);
	}

	public Image getBulletImage() {
		ImageIcon ic = new ImageIcon("C:/HuntingTychoonImages/bullett.png");
		return ic.getImage();
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, getBulletImage().getWidth(null), getBulletImage().getHeight(null));

	}
}