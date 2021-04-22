package JavaProjectV1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

//this program must draw a filled rectangle 
public class DrawFillRect extends JPanel {
	//Position X du pointeur 
	private int x1=0, x2=0;
	//Position Y du pointeur 
	private int y1=0, y2=0;
	//collection de points
	private ArrayList<Point> points = new ArrayList<Point>();
	public DrawFillRect(){
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				x1= e.getX();
				y1=e.getY();
				points.add(new Point (e.getX(), e.getY()));
				repaint();
			}
			public void mouseReleased(MouseEvent e){
				x2 = e.getX();
				y2 = e.getY();
				points.add(new Point(e.getX(),e.getY()));
				repaint();
				}
		});
		this.addMouseMotionListener(new MouseMotionListener(){
		public void mouseDragged(MouseEvent e){
			//on récupère les coordonnées de la souris
			x2= e.getX();
			y2= e.getY();
			points.add(new Point (e.getX(), e.getY()));
			//repaint();
		}
		public void mouseMoved(MouseEvent e){}
	});
	}
	public void paintComponent(Graphics g){
		//g.setColor(Color.white);
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		for (Point p : this.points){
			g.setColor(Color.red);
			g.fillRect(x1, y1, x2-x1, y2-y1);
		}
	}
}