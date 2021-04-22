package JavaProjectV1;
//line
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

//this program is called when userChoice =1 it draws a line
public class DrawLine extends JPanel{
	//Position X du pointeur
	private int x1=0, x2=0;
	//Position Y du pointeur
	private int y1=0, y2=0;
	
	//Collection de points ! 
	private ArrayList<Point> points = new ArrayList<Point>();
	
	public DrawLine(){
		
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				x1=x2= e.getX();
				y1=y2=e.getY();
				points.add(new Point(e.getX(),e.getY()));
				repaint();
			}
			public void mouseReleased(MouseEvent e){
				x2 = e.getX();
				y2 = e.getY();
				points.add(new Point(e.getX(),e.getY()));
				repaint();
				}
		});
	}

	public void paintComponent(Graphics g){
		for (Point p : this.points)
		{
			g.drawLine(x1, y1, x2, y2);
		}
	}		
}
