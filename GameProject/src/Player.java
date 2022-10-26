import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Player extends Entity {
String name;
int velX=0,velY=0;
int speed=2;
int height;
int width;
int dirchecker=0;
int blockchecker=0;
	int wallet;
	ArrayList<Item> inventory= new ArrayList<Item>();
	public Player(int x, int y ,String name, int wallet) {
		super(x,y);
		this.wallet=wallet;
		this.name=name;	
	}
public void update() {
		y +=velY;
		x +=velX;
		checkCollisions();
		checkCollisions2();
		Getbackplayer();
}
public void draw(Graphics2D g2d) {
	g2d.drawImage(getPlayerImage(),x,y,null);
	//g2d.draw(getBounds());
}
public Image getPlayerImage() {
	ImageIcon ic = new ImageIcon("C:/HuntingTychoonImages/testt.png");
	return ic.getImage();
}
public void keyPressed(KeyEvent e) {
	int key=e.getKeyCode();
	
	if(key ==KeyEvent.VK_W) {
		velY = -speed;
	}else if(key ==KeyEvent.VK_A) {
		velX = -speed*0;
	}else if(key ==KeyEvent.VK_D) {
		velX = +speed*0;
	}else if(key ==KeyEvent.VK_S) {
		velY = +speed;
	}else if(key ==KeyEvent.VK_SPACE) {
		blockchecker=1;
	}
}
public void checkCollisions() {
	ArrayList<Bear> bears=GraphicsEngine.getBearList();
	for(int j=0; j<bears.size();j++) {
		Bear tempb = bears.get(j);
		if(getBounds().intersects(tempb.getBounds())) {
			JOptionPane.showMessageDialog(null,	"Happens to the best of us.");
		System.exit(0);
		}
	}
}
public void checkCollisions2() {
	for(int i=0; i<GraphicsEngine.getenemybulletsList().size();i++) {
		enemybullets bu= GraphicsEngine.getenemybulletsList().get(i);
		if(getBounds().intersects(bu.getBounds())&&(blockchecker==0)) {
			GraphicsEngine.removeenemybullets(bu);
			JOptionPane.showMessageDialog(null,	"Happens to the best of us.");
			System.exit(0);
		}
	}
}
public void keyReleased(KeyEvent e) {
	int key=e.getKeyCode();
if(key ==KeyEvent.VK_W) {
		velY = 0;
	}else if(key ==KeyEvent.VK_A) {
		velX = 0;
	}else if(key ==KeyEvent.VK_D) {
		velX = 0;
	}else if(key ==KeyEvent.VK_S) {
		velY = 0;
	}else if(key ==KeyEvent.VK_RIGHT) {
		GraphicsEngine.addBullet(new Bullet(x+20,y));
		dirchecker=0;
	//}else if(key ==KeyEvent.VK_LEFT) {
		//GraphicsEngine.addBullet(new Bullet(x,y));
		//dirchecker=	1;
	}else if(key ==KeyEvent.VK_SPACE) {
		blockchecker=0;
	}
}
	public void shoot() {
	
	}
//shoot
	public void interact() {
		
	}
//interact
	//possibly jump

	public int getWallet() {
		return wallet;
	}
	public void Getbackplayer() {
		if(y<-3) {
			y=600;
		}else if(y>603) {
			y=0;
		}
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,getPlayerImage().getWidth(null),getPlayerImage().getHeight(null));
		
	}
}
