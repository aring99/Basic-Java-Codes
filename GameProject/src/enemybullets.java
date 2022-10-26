import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class enemybullets extends Entity {
	int height;
	int xprotector;
	int width;
	int speed;
	int directionchecker = 0;

	enemybullets(int x, int y) {
		super(x, y);
		xprotector=x;
	}

	public void update() {
		x+=2;
		enemybulletreset();
	}
	public void update2() {
		x-=4;
		enemybulletreset();
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getBulletImage(), x, y, null);
	}

	public Image getBulletImage() {
		ImageIcon ic = new ImageIcon("C:/HuntingTychoonImages/enemybullett.png");
		return ic.getImage();
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, getBulletImage().getWidth(null), getBulletImage().getHeight(null));

	}
	public void enemybulletreset() {
		if(x<10) {
			//x= xprotector;
			GraphicsEngine.removeenemybullets(this);
			
		}
	}
}