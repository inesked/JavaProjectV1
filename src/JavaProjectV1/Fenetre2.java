package JavaProjectV1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Fenetre2 extends JFrame {	
	// Notre zone de dessin
	private DrawFillRect drawPanel= new DrawFillRect();	
	public Fenetre2(){
		this.setTitle("draw a Filled Rectangle");
		this.setSize(500,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//on positionne notre zone de dessin
		this.getContentPane().add(drawPanel,BorderLayout.CENTER);
		this.setContentPane(new DrawFillRect());;
		this.setVisible(true);
	}
}


