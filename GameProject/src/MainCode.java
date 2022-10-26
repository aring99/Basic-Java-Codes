import javax.swing.JFrame;

public class MainCode {
	/*
	 * Show items when in front of shop
	 * re-stock shop
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame= new JFrame("Hunting Tychoon");
frame.setSize(800, 600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.add(new GraphicsEngine());
frame.setVisible(true);
	}

}
