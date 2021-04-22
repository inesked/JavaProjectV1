package JavaProjectV1;
import java.awt.Color;
/*import java.awt.Color;
import java.awt.*;
import javax.swing.*;

//import JavaProjectV1.DrawPanel.Point;
*/
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;



public class FillOval extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int xinit=0, xend=0, yinit=0, yend=0;
	
	private ArrayList<Point> points = new ArrayList<Point>();
	/* public void paintComponent(Graphics g) {
		 
		 super.paintComponent(g);
		 g.setColor(Color.RED);
//g.drawRoundRect(100, y, width, height, arcWidth, arcHeight);	
		 g.drawOval(x, y, width, height);

	 }*/
	public FillOval(){
		
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				xinit=xend= e.getX();
				yinit=yend=e.getY();
				points.add(new Point(e.getX(),e.getY()));
				repaint();
			}
			public void mouseReleased(MouseEvent e){
				xend = e.getX();
				yend = e.getY();
				points.add(new Point(e.getX(),e.getY()));
				repaint();
				}
		});
	}

	public void paintComponent(Graphics g){
		for (@SuppressWarnings("unused") Point p : this.points)
		{
			 g.setColor(Color.RED);
			 g.fillOval(xinit, yinit, xend-xinit, yend-yinit);
		}
	}
}		