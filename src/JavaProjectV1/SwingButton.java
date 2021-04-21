package JavaProjectV1;

import javax.swing.*;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class SwingButton extends JFrame{

	private JButton bouton1= new JButton("1. Line");
	private JButton bouton2= new JButton("2. Outlined Rectangle");
	private JButton bouton3= new JButton("3. Filled Rectangle");
	private JButton bouton4= new JButton("4. Outlined Oval");
	private JButton bouton5= new JButton("5. Filled Oval");
	//private JPanel container = new JPanel();
	private int userChoice;
	
	
	
	public SwingButton(){
		this.setLayout(new GridLayout(3,2));
		this.setTitle("Menu");
		this.setSize(550,120);
		//quit the program when we click on the red cross
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//the frame is not resizable
		this.setResizable(false);
		// we cannot avoid our issues anymore
	    this.setAlwaysOnTop(false);
	    this.getContentPane().add(bouton1);
	    this.getContentPane().add(bouton2);
	    this.getContentPane().add(bouton3);
	    this.getContentPane().add(bouton4);
	    this.getContentPane().add(bouton5);
	    
	    //intern classes obey buttons
	    bouton1.addActionListener(new Bouton1Listener());
	    bouton2.addActionListener(new Bouton2Listener());
		bouton3.addActionListener(new Bouton3Listener());
		bouton4.addActionListener(new Bouton4Listener());
		bouton5.addActionListener(new Bouton5Listener());
	      
	    this.setVisible(true);
	  }
	 
	 //this class listens to our first button
	 class Bouton1Listener implements ActionListener{
			//redefinition of the actionPerformed() methods
		 public void actionPerformed(ActionEvent arg0){
			 //just to show that the click works
<<<<<<< HEAD
			 Fenetre fen = new Fenetre();
			 System.out.println("vous avez cliqué sur le bouton 1");
			 //LineDrawer l = new LineDrawer();

=======
			 LineDrawer l = new LineDrawer();
				System.out.println("vous avez cliqué sur le bouton 1");
>>>>>>> 0111ebdfe74e56ddaa573f8bee9db58f58ffd097
			//we will have to use this userChoice value later 
				userChoice=1;
			}
		}
	 class Bouton2Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				System.out.println("vous avez cliqué sur le bouton 2");
				userChoice=2;
			}
		}
	 class Bouton3Listener implements ActionListener{
			public void actionPerformed(ActionEvent f){
				System.out.println("vous avez cliqué sur le bouton 3");
				userChoice = 3;
			}
		}
	 class Bouton4Listener implements ActionListener{
			public void actionPerformed(ActionEvent g){
				userChoice =4;
				System.out.println("vous avez cliqué sur le bouton 4");
			}
		}
	 class Bouton5Listener implements ActionListener{
			public void actionPerformed(ActionEvent h){
				System.out.println("vous avez cliqué sur le bouton 5");
				userChoice=5;
			}
		}
	 public int getChoice(){
			return userChoice;
<<<<<<< HEAD
	 }
=======
		}
	// once the user clicked on a button, the frame should close
	 // and the drawing frame should open to replace it
	 
	 
	
>>>>>>> 0111ebdfe74e56ddaa573f8bee9db58f58ffd097
}
