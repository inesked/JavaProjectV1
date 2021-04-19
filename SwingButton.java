import javax.swing.*;
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
	        this.setLayout(new GridLayout(3,1));  
	        this.setVisible(true);
	        this.setResizable(true);
	        this.setLocationRelativeTo(null);

	            }

	public static void main(String[] args) throws Exception {
		 new SwingButton();
	}

}
