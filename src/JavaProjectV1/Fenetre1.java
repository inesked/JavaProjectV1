package JavaProjectV1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Fenetre1 extends JFrame {
		
	// Notre zone de dessin
	private DrawLine drawPanel= new DrawLine();
	//private DrawFillRect drawPanel1= new DrawFillRect();
		
	public Fenetre1(){
		this.setTitle("Draw my lines");
		this.setSize(700,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//on positionne notre zone de dessin
		this.getContentPane().add(drawPanel,BorderLayout.CENTER);
		//this.getContentPane().add(drawPanel1,BorderLayout.CENTER);
		this.setVisible(true);
	}
}

