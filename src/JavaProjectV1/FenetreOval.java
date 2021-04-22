package JavaProjectV1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;


public class FenetreOval extends JFrame {
		
	// Notre zone de dessin
	private	 DrawOval drawOval = new DrawOval();
		
	public FenetreOval(){
		this.setSize(700,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//on positionne notre zone de dessin
		this.getContentPane().add(drawOval,BorderLayout.CENTER);
		this.setVisible(true);
	}
}

