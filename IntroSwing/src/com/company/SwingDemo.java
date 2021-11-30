package com.company;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingDemo implements ActionListener {
	JLabel jLabel;
	public SwingDemo() {
		//create a jFrame container
		//JFrame jFrame=new JFrame("First Swing Appllication");
		JFrame jFrame=new JFrame("Button");
		
		
		//specify flowLayout
		jFrame.setLayout(new FlowLayout());
		
		//give it a size
		jFrame.setSize(200,120);
		
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		
		//make a button
		JButton upButton=new JButton("Up");
//		upButton.addActionListener(new ActionListener() {
//			
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("up button clicked");
//			}
//		});
		upButton.addActionListener(this);
		jFrame.add(upButton);
		
		JButton downButton=new JButton("Down");
		downButton.addActionListener(this);
		jFrame.add(downButton);
		
		//create a jLabel
		jLabel=new JLabel("Press Button");
		
		//add to frame
		jFrame.add(jLabel);
		//show it
		jFrame.setVisible(true);
		
		
		//create textField
		JTextField jTextField=new JTextField(10);
		jFrame.add(jTextField);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Up")) {
			jLabel.setText("You pressed Up!");
		}
		if(e.getActionCommand().equals("Down")) {
			jLabel.setText("You pressed Down!");

		}
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new SwingDemo();
			}
		});
	}


	
	

}
