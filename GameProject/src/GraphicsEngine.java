import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicsEngine extends JPanel implements ActionListener {
 Timer mainTimer;
	Timer enemyTimer;
	Player player;
	int animalcounter=3;
	int scorecounter=0;
	int stage=1;
	static ArrayList<Bear> bearholder = new ArrayList<Bear>();
	static ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	static ArrayList<enemybullets> badbullets = new ArrayList<enemybullets>();
	Random rand = new Random();

	public GraphicsEngine() {
		setFocusable(true);
		player = new Player(100, 548, "tester", 5);
		addKeyListener(new KeyAdapt(player));
		//enemyTimer = new Timer(1, this);
		//enemyTimer.start();
		mainTimer = new Timer(10, this);
		mainTimer.start();
		//startGame();
		starting();
	//!!	

	}
//!
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		ImageIcon ic = new ImageIcon("C:/HuntingTychoonImages/backrounddemo.png");
		g2d.drawImage(ic.getImage(),0,0,null);
		g2d.drawString("Score: "+scorecounter,680,20);
		g2d.drawString("Stage: " +stage,680,40);
		
		player.draw(g2d);
		for(int i=0; i<bearholder.size();i++) {
			Bear tempb= bearholder.get(i);
			tempb.draw(g2d);
			tempb.addenemybullets();
		}
		for(int i=0; i<bullets.size();i++) {
			Bullet tempbu= bullets.get(i);
			tempbu.draw(g2d);
		}
		for(int i=0; i<badbullets.size();i++) {
			enemybullets tempbu= badbullets.get(i);
			tempbu.draw(g2d);
		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		player.update();
		for(int i=0; i<bearholder.size();i++) {
			Bear tempb= bearholder.get(i);
			tempb.update();}
		for(int i=0; i<bullets.size();i++) {
			Bullet tempbu= bullets.get(i);
			tempbu.update();
			if(player.dirchecker==0) {tempbu.update();
			}else {
				tempbu.update2();
			} }
		for(int i=0; i<badbullets.size();i++) {
			enemybullets tempbu= badbullets.get(i);
			tempbu.update2();
			 }
		for(int i=0; i<bearholder.size();i++) {
			Bear tempb= bearholder.get(i);
				tempb.addenemybullets();}
		stageupper();
		repaint();

	}
	public static void removeBear(Bear r) {
		bearholder.remove(r);
	}
	public static void addBullet(Bullet b) {
		bullets.add(b);
	}
	public static void removeBullet(Bullet b) {
		bullets.remove(b);
	}
	public static void addenemybullets(enemybullets b) {
		badbullets.add(b);
	}
	public static void removeenemybullets(enemybullets b) {
		badbullets.remove(b);
	}
	public static void addBear(Bear r) {
		bearholder.add(r);
	}
	public static ArrayList<Bullet> getBulletList() {
		return bullets;
	}
	public static ArrayList<enemybullets> getenemybulletsList() {
		return badbullets;
	}
	public static ArrayList<Bear> getBearList() {
		return bearholder;
	}
	public void starting() {
		animalcounter = stage * 5;
		for(int i=0;i<animalcounter;i++) {
			addBear(new Bear(850,rand.nextInt(570),"bear"));
		}
		
	}
	public void stageupper() {
		if ((bearholder.size()== 0)) {
			stage++;
		bullets.clear();
		badbullets.clear();
		JOptionPane.showMessageDialog(null,	"More of them are coming!");
		starting();
		scorecounter+=animalcounter*150;
		}	}
}
