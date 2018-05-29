package BeatYou;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class BeatYou {
	private JFrame frame;
	private JPanel view;
	private JLabel nameOne;
	private JLabel nameTwo;
	private JLabel nameOneScoreboard;
	private JLabel nameTwoScoreboard;
	private GridBagConstraints gbc;
	private JButton addNameOne;
	private JButton addNameTwo;
	
	public BeatYou() {
		
		gui();
	}
	
	public void gui() {
		frame = new JFrame("Beat You"); 
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		view = new JPanel();
		view.setLayout(new GridBagLayout());
		view.setOpaque(true);
		view.setBackground(Color.BLUE);
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		nameOne = new JLabel("Jake");
		nameOne.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10, 30, 10, 150);
		view.add(nameOne, gbc);
		
		nameTwo = new JLabel("JP");
		nameTwo.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 150, 10, 30);
		view.add(nameTwo, gbc);
		
		
		JPanel view1 = new JPanel();
		view1.setLayout(new GridBagLayout());
		view1.setOpaque(true);
		view1.setBackground(Color.WHITE);
		
		
		GridBagConstraints gbc1 = new GridBagConstraints();
		
		nameOneScoreboard = new JLabel("0");
		nameOneScoreboard.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.insets = new Insets(0, 0, 0, 150);
		view1.add(nameOneScoreboard, gbc1);
		
		nameTwoScoreboard = new JLabel("0");
		nameTwoScoreboard.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		gbc1.gridx = 1;
		gbc1.gridy = 0;
		gbc1.insets = new Insets(0, 150, 0, 0);
		view1.add(nameTwoScoreboard, gbc1);
		
		
		JPanel view2 = new JPanel();
		view2.setLayout(new GridBagLayout());
		view2.setOpaque(true);
		view2.setBackground(Color.LIGHT_GRAY);
		
		GridBagConstraints gbc2 = new GridBagConstraints();
		
		addNameOne = new JButton("Add to Jake");
		gbc2.gridx = 0;
		gbc2.gridy= 0;
		gbc2.insets = new Insets(0, 0, 0, 50);
		addNameOne.setPreferredSize(new Dimension(200, 50));
		view2.add(addNameOne, gbc2);
		
		
		addNameTwo = new JButton("Add to JP");
		gbc2.gridx = 1;
		gbc2.gridy= 0;
		gbc2.insets = new Insets(0, 50, 0, 0);
		addNameTwo.setPreferredSize(new Dimension(200, 50));
		gbc2.fill = GridBagConstraints.BOTH;
		view2.add(addNameTwo, gbc2);
		
		frame.add(view, BorderLayout.NORTH);
		frame.add(view2, BorderLayout.SOUTH);
		frame.add(view1, BorderLayout.CENTER);
		
		
	}
	
	
	
	public static void main(String [] args) {
		new BeatYou();
	}
	
	

}
