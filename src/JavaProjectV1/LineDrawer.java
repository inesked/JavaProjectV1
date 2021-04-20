package JavaProjectV1;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;



public class LineDrawer extends JFrame {
	private int xbegin = 0;
	private int ybegin = 0;
	private int xend = 0;
	private int yend = 0;
	
	public LineDrawer()	{
		//setTitle("Line Drawer");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(mouseHandler);
		addMouseMotionListener(mouseMotionHandler);
		setVisible(true);
	};
	
public MouseListener mouseHandler = new MouseAdapter()	{
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
	public MouseMotionListener mouseMotionHandler = new MouseMotionAdapter(){
		@Override
		public void mouseDragged(MouseEvent e){
			xend = e.getX();
			yend = e.getY();
			repaint();
		}
	};
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.drawLine(xbegin,ybegin,xend,yend);
	}
	
}
