/*package JavaProjectV1;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")

public class MenuV2 extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel menu;
	private JButton bouton1;
	private JButton bouton2;
	private JButton bouton3;
	private JButton bouton4;
	private JButton bouton5;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JLabel consigne1;
	private JButton boutonretour1;
	private int userChoice;
	
	
public MenuV2(){
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
	setTitle("Inès JAVA - Drawing Shape");
    setSize(1000, 1000);
     setLocationRelativeTo(null);
    setVisible(true);
    
     //String url="noel.jpg";
    //ImageIcon icone=new ImageIcon(url);
//    JLabel labelN=new JLabel(icone,JLabel.NORTH);
   
    createPanel();
    add(panel);
    //add(labelN);
    
}

public void createPanel(){
	setSize(1000, 1000);
    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout(0, 1));
    menu=new JLabel("Projet Inès");
   
   bouton1.addActionListener(this);
   bouton2.addActionListener(this);
   bouton3.addActionListener(this);
   bouton4.addActionListener(this);
   bouton5.addActionListener(this);
   
   panel.add(menu);
   panel.add(bouton1);
   panel.add(bouton2);
   panel.add(bouton3);
   panel.add(bouton4);
   panel.add(bouton5);
   
   bouton1.addActionListener(new NEWPanel1());
   bouton2.addActionListener(new NEWPanel2());
   bouton3.addActionListener(new NEWPanel3());
   bouton4.addActionListener(new NEWPanel4());
   bouton5.addActionListener(new NEWPanel5());
   
   }



private class NEWPanel1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Panel1();
        setContentPane(panel1);//panel1 est le panel de la méthode createPanelClient();
        setSize(1000, 1000);
        invalidate();
        validate();
    }
}
public void Panel1(){
	setSize(1000, 1000);
    panel1 = new JPanel();
    panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel1.setLayout(new GridLayout(0, 1));
    consigne1 = new JLabel("test1");
    panel1.add(consigne1);
    boutonretour1 = new JButton("Retour");
    
    boutonretour1.addActionListener(this);
    panel1.add(boutonretour1);
    
    boutonretour1.addActionListener(new FirstPanel());
}
private class FirstPanel implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
    	createPanel();
        setContentPane(panel1);//panel1 est le panel de la méthode createPanelClient();
        setSize(1000, 1000);
        invalidate();
        validate();
}
}

//création panel2 Outlined Rectangle
private class NEWPanel2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Panel2();
        setContentPane(panel2);
        setSize(1000, 1000);
        invalidate();
        validate();
    }
}
public void Panel2(){
	setSize(1000, 1000);
    panel2 = new JPanel();
    panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel2.setLayout(new GridLayout(0, 1));
    consigne1 = new JLabel("test2");
    panel2.add(consigne1);
    boutonretour1 = new JButton("Retour");
    
    boutonretour1.addActionListener(this);
    panel2.add(boutonretour1);
    
    boutonretour1.addActionListener(new FirstPanel());
}




//création panel3 Filled Rectangle
private class NEWPanel3 implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
	  Panel3();
      setContentPane(panel3);
      setSize(1000, 1000);
      invalidate();
      validate();
  }
}
public void Panel3(){
	setSize(1000, 1000);
  panel3 = new JPanel();
  panel3.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
  panel3.setLayout(new GridLayout(0, 1));
  consigne1 = new JLabel("test3");
  panel3.add(consigne1);
  boutonretour1 = new JButton("Retour");
  
  boutonretour1.addActionListener(this);
  panel3.add(boutonretour1);
  
  boutonretour1.addActionListener(new FirstPanel());
}


//création panel4 Outlined Oval
private class NEWPanel4 implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
	  Panel4();
    setContentPane(panel4);
    setSize(1000, 1000);
    invalidate();
    validate();
}
}
public void Panel4(){
	setSize(1000, 1000);
panel4 = new JPanel();
panel4.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
panel4.setLayout(new GridLayout(0, 1));
consigne1 = new JLabel("test4");
panel4.add(consigne1);
boutonretour1 = new JButton("Retour");

boutonretour1.addActionListener(this);
panel4.add(boutonretour1);

boutonretour1.addActionListener(new FirstPanel());
}


//création panel5 Filled Oval
private class NEWPanel5 implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
	  Panel5();
  setContentPane(panel4);
  setSize(1000, 1000);
  invalidate();
  validate();
}
}
public void Panel5(){
	setSize(1000, 1000);
panel5 = new JPanel();
panel5.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
panel5.setLayout(new GridLayout(0, 1));
consigne1 = new JLabel("test5");
panel5.add(consigne1);
boutonretour1 = new JButton("Retour");

boutonretour1.addActionListener(this);
panel5.add(boutonretour1);

boutonretour1.addActionListener(new FirstPanel());
}


@Override
public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();
if(source==bouton1)
{
	consigne1 = new JLabel("ROXXXX");
}
}

public int getChoice() {
	return userChoice;
}
}








public static void main(String[] args) throws Exception {
new MenuV2();
}*/



















