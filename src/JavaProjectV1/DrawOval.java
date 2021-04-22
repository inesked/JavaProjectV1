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



public class DrawOval extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int xinit=0, xend=0, yinit=0, yend=0;
	
	private ArrayList<Point> points = new ArrayList<Point>();
	public class Point {
	private int x, y;
		public Point (int x, int y){
			this.x=x;
			this.y=y;
		}
		public int getX(){
			return x;
		}
		public void setX(int x){
			this.x=x;
		}
		public int getY(){
			return y;
		}
		public void setY(int y){
			this.y=y;
		}
	}
	
	/* public void paintComponent(Graphics g) {
		 
		 super.paintComponent(g);
		 g.setColor(Color.RED);
//g.drawRoundRect(100, y, width, height, arcWidth, arcHeight);	
		 g.drawOval(x, y, width, height);

	 }*/
	public DrawOval(){
		
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
			 g.drawOval(xinit, yinit, xend-xinit, yend-yinit);
			 g.setColor(Color.RED);
		
		}
	}
}		