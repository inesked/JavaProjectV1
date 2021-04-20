/*
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
//import java.swing.*;

package JavaProjectV1;

public class LineDrawer extends JFrame {
	private int xbegin = 0;
	private int ybegin = 0;
	private int xend = 0;
	private int yend = 0;
	
	public LineDrawer()	{
		setTitle("Line Drawer");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(mouseHandler);
		addMouseMtionListener(mouseMotionHandler)
		setVisible(true);
	};
	
public MousListener mouseHandler = new mouseAdapter()	{
	@Override
	public void mousePressed(MouseEvent e){
		xbegin=xend = e.getX();
		ybegin=yend = e.getY();
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e){
		xend = e.getX();
		yend = e.getY();
		repaint();
		}
};
	public MousemotionListener mouseMotionHandler = new MouseMotionAdapter(){
		@Override
		public void mouseDragged(MouseEvent e){
			xend = e.getX();
			yend = e.getY();
			repaint();
		}
	};
	@Ovveride
	public void paint(Graphics g){
		super.paint(g);
		g.drawLine(xbegin,ybegin,xend,yend);
	}
	public static void main(String[] args) {
		LineDrawer l = new LineDrawer();
		}
}
*/