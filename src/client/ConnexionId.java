package client;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;



public class ConnexionId extends JFrame implements ActionListener {
	JFrame frame = new JFrame("DiscUT3");
	Container container=getContentPane();
	JLabel userLabel=new JLabel("USERNAME");
	JLabel passwordLabel=new JLabel("PASSWORD");
	JTextField userTextField=new JTextField();
	JPasswordField passwordField=new JPasswordField();
	JButton loginButton;
	JButton resetButton=new JButton("RESET");
	
	
	
	public ConnexionId() {
	 loginButton=new JButton("LOGIN");
	 loginButton.addActionListener(this);
	 TitledBorder border = new TitledBorder("DISCUT3");
	 setLayoutManager();
     setLocationAndSize();
	 border.setTitleJustification(TitledBorder.CENTER);
	 border.setTitlePosition(TitledBorder.TOP);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     frame.setSize(500, 500);
     JPanel panel = new JPanel();
     panel.setBorder(border);
     frame.add(panel);
     frame.setLayout(null);
     userLabel.setBounds(50,150,100,30);
     passwordLabel.setBounds(50,220,100,30);
     userTextField.setBounds(150,150,150,30);
     passwordField.setBounds(150,220,150,30);
     loginButton.setBounds(50,300,100,30);
     resetButton.setBounds(200,300,100,30);
     frame.add(userLabel);
     frame.add(passwordLabel);
     frame.add(userTextField);
     frame.add(passwordField);
     frame.add(loginButton);
     frame.add(resetButton);
     frame.setVisible(true);
  
	}
	 public void setLayoutManager()
	   {
	       container.setLayout(null);
	   }
	   public void setLocationAndSize()
	   {
	       //Setting location and Size of each components using setBounds() method.
	       userLabel.setBounds(50,150,100,30);
	       passwordLabel.setBounds(50,220,100,30);
	       userTextField.setBounds(150,150,150,30);
	       passwordField.setBounds(150,220,150,30);
	       loginButton.setBounds(50,300,100,30);
	       resetButton.setBounds(200,300,100,30);
	 
	 
	   }
	   public void actionPerformed(ActionEvent ae) {
		   String user = userTextField.getText();
		   String password = passwordField.getText();
		   frame.setVisible(false);
		   AcceuilInterface ai = new AcceuilInterface();
		   
		   
		   //YOYOYO c moi x
	   }
	
	
	

}




