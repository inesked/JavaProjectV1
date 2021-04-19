package JavaProjectV1;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class SwingButton extends JFrame{

	 SwingButton(){
	 
		 JPanel p1 = new JPanel();
	     p1.add(new JButton("1. Line"));
	     p1.add(new JButton("2. Outlined Rectangle"));
	     p1.add(new JButton("3. Filled Rectangle"));
	     p1.add(new JButton("4. Outlined Oval"));
	     p1.add(new JButton("5. Filled Oval"));
	     p1.setLayout(new GridLayout(1,2));
	          
	        this.add(p1, BorderLayout.CENTER);  

	        this.setSize(550,120); 
	        this.setContentPane(p1);
	        this.setResizable(false);   //the frame is not resizable
	        this.setAlwaysOnTop(true);
	        this.setLayout(new GridLayout(3,1));  
	        this.setVisible(true);
	        //when we click on the red cross, the program stops running
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        this.setLocationRelativeTo(null);
	       // this.getContentPane().add(p1);
	            }

}
