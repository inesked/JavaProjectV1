package JavaProjectV1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Draw extends JPanel {
	// Position pointeur
	private int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
	private int userchoice;
	private ArrayList<ArrayList<Point>> points = new ArrayList<ArrayList<Point>>();

	public Draw() {
		super();
		this.setOpaque(true);
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(1000, 900));
		setBackground(Color.white);

		for (int i = 0; i < 5; i++)
			points.add(new ArrayList<Point>());

		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				switch (userchoice) {
					case 1:
						points.get(0).add(new Point(e.getX(), e.getY()));
						break;
					case 2:
						points.get(1).add(new Point(e.getX(), e.getY()));
						break;
					case 3:
						points.get(2).add(new Point(e.getX(), e.getY()));
						break;
					case 4:
						points.get(3).add(new Point(e.getX(), e.getY()));
						break;
					case 5:
						points.get(4).add(new Point(e.getX(), e.getY()));
						break;
				}

			}

			public void mouseReleased(MouseEvent e) {

				switch (userchoice) {
					case 1:
						points.get(0).add(new Point(e.getX(), e.getY()));
						break;
					case 2:
						points.get(1).add(new Point(e.getX(), e.getY()));
						break;
					case 3:
						points.get(2).add(new Point(e.getX(), e.getY()));
						break;
					case 4:
						points.get(3).add(new Point(e.getX(), e.getY()));
						break;
					case 5:
						points.get(4).add(new Point(e.getX(), e.getY()));
						break;
				}
				repaint();
			}
		});

	}

	public void setUserChoice(int userChoice) {
		this.userchoice = userChoice;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);

		for (int i = 0; i < this.points.size(); i++) {
			for (int j = 0; j < this.points.get(i).size(); j += 2) {
				int x1, x2, y1, y2;
				x1 = this.points.get(i).get(j).getX();
				x2 = this.points.get(i).get(j + 1).getX();
				y1 = this.points.get(i).get(j).getY();
				y2 = this.points.get(i).get(j + 1).getY();

				switch (i) {
					case 0:
						g.drawLine(x1, y1, x2, y2);
						break;
					case 1:
						g.drawRect(x1, y1, x2 - x1, y2 - y1);
						break;
					case 2:
						g.fillRect(x1, y1, x2 - x1, y2 - y1);
						break;
					case 3:
						g.drawOval(x1, y1, x2 - x1, y2 - y1);
						break;
					case 4:
						g.fillOval(x1, y1, x2 - x1, y2 - y1);
						break;
				}
			}
		}

	}

}
