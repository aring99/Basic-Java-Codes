import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Bear extends Animals {
	String name;
	private int  xmaintainer;
	int directionboy=1;
	int height;
	int width;
	int money=50;
	int kcounter;
	int scorecounter=0;
	Bear(int x,int y,String name){
		super(x,y);
		xmaintainer=x;
		this.name=name;
	}
	
	public void update() {
		checkCollisions();
		Getbackhostiles();
		x-=2;
	}
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getBearImage(),x,y,null);
		//g2d.draw(getBounds());
	}
	public Image getBearImage() {
		ImageIcon ic = new ImageIcon("C:/HuntingTychoonImages/bearr.png");
		return ic.getImage();
	}
	
	public void checkCollisions() {
		for(int i=0; i<GraphicsEngine.getBulletList().size();i++) {
			Bullet bu= GraphicsEngine.getBulletList().get(i);
			if(getBounds().intersects(bu.getBounds())) {
				GraphicsEngine.removeBear(this);
				GraphicsEngine.removeBullet(bu);
				kcounter++;
				scorecounter+=150;
			}
		}
	}
	public void Getbackhostiles() {
		if(x<10) {
			x=xmaintainer;
		

		}
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,getBearImage().getWidth(null),getBearImage().getHeight(null));
		
	}
	//public void eat()
	// public void sound()
	//overwrite the below
	//public void move()
	//public void eat()
	// public void sound()
	// requirement() .30-06
	/*public void addenemybullet() {
		GraphicsEngine.addBullet(new Bullet(x-100,y));
	}*/

	public void addenemybullets() {
		// TODO Auto-generated method stub
		if(2*GraphicsEngine.bearholder.size()>=GraphicsEngine.badbullets.size()) {
		GraphicsEngine.addenemybullets(new enemybullets(x-20,y));
	}}
}

