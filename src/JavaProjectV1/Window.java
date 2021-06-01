package JavaProjectV1;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

	private JButton bouton1 = new JButton("1. Line");
	private JButton bouton2 = new JButton("2. Filled Rectangle");
	private JButton bouton3 = new JButton("3. Outlined Rectangle");
	private JButton bouton4 = new JButton("4. Outlined Oval");
	private JButton bouton5 = new JButton("5. Filled Oval");
	private JPanel panel = new JPanel();
	private Draw draw;

	public Window() {

		draw = new Draw();
		this.setLayout(new FlowLayout());
		this.setTitle("Menu");
		this.setSize(1000, 1000);
		// quit the program when we click on the red cross
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// the frame is not resizable
		this.setResizable(true);
		// we cannot avoid our issues anymore
		this.setAlwaysOnTop(false);

		// intern classes obey buttons
		bouton1.addActionListener(new Bouton1Listener());
		bouton2.addActionListener(new Bouton2Listener());
		bouton3.addActionListener(new Bouton3Listener());
		bouton4.addActionListener(new Bouton4Listener());
		bouton5.addActionListener(new Bouton5Listener());

		this.setVisible(true);

		panel.setLayout(new FlowLayout());

		panel.add(bouton1);
		panel.add(bouton2);
		panel.add(bouton3);
		panel.add(bouton4);
		panel.add(bouton5);

		this.add(panel, BorderLayout.NORTH);
		this.add(draw, BorderLayout.SOUTH);

	}

	// this class listens to our first button
	class Bouton1Listener implements ActionListener {

		// redefinition of the actionPerformed() methods
		public void actionPerformed(ActionEvent arg0) {
			draw.setUserChoice(1);
		}
	}

	class Bouton2Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			draw.setUserChoice(2);
		}
	}

	class Bouton3Listener implements ActionListener {
		public void actionPerformed(ActionEvent f) {
			draw.setUserChoice(3);
		}
	}

	class Bouton4Listener implements ActionListener {
		public void actionPerformed(ActionEvent g) {
			draw.setUserChoice(4);
		}
	}

	class Bouton5Listener implements ActionListener {
		public void actionPerformed(ActionEvent h) {
			draw.setUserChoice(5);
		}
	}
}
