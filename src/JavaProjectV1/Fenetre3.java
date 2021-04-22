package JavaProjectV1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Fenetre3 extends JFrame {
		
	// Notre zone de dessin
	private DrawRect drawPanel= new DrawRect();
		
	public Fenetre3(){
		this.setTitle("draw an outlined Rectangle");
		this.setSize(300,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//on positionne notre zone de dessin
		this.getContentPane().add(drawPanel,BorderLayout.CENTER);
		this.setContentPane(new DrawRect());;
		this.setVisible(true);
	}
}
