package tic_tac_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;



public class MyFrame extends JFrame implements ActionListener {
	
	JButton[] buttons;
	JButton resetButton;
	JPanel buttonPanel,titlePanel,bottomPanel,rightPanel,leftPanel;
	JLabel title,right,left,xLabel,oLabel;
	boolean palyer1_turn;
	Random random;
	JOptionPane messege;
	
	
	
	
	public MyFrame() {
		
		
		
		title = new JLabel();                                   //LABELS
		title.setText("TIC-TAC-TOE");
		title.setFont(new Font("Calibri", Font.BOLD, 50));
		title.setForeground(Color.RED	);
		
		right = new JLabel();
		right.setText("                      ");
		
		left = new JLabel();
		left.setText("                      ");
		
		xLabel = new JLabel("X Turn");
		xLabel.setFont(new Font("Calibri", Font.BOLD, 35));
		xLabel.setForeground(Color.WHITE);
		
		oLabel = new JLabel("O Turn");
		oLabel.setFont(new Font("Calibri", Font.BOLD, 35));
		oLabel.setForeground(Color.WHITE);
		
		
		
		
		buttons = new JButton[9];                              //BUTTONS
		resetButton = new JButton("RESET");
		resetButton.setFocusable(false);
		
		
		
		
		
		buttonPanel = new JPanel();                            //PANELS 
		buttonPanel.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++) {
			
			
			buttons[i] =new JButton();
			buttonPanel.add(buttons[i]);
			buttons[i].addActionListener(this);
			
		}
		
		titlePanel = new JPanel();                              
		titlePanel.add(title);
		
		bottomPanel = new JPanel();
		FlowLayout flowLayout = new FlowLayout(); 
		flowLayout.setHgap(70);
		bottomPanel.setLayout(flowLayout);
		bottomPanel.add(xLabel);
		bottomPanel.add(resetButton);
		bottomPanel.add(oLabel);
		
		rightPanel = new JPanel();
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(right);
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(left);
		
		
		
		
		
		
		this.setLayout(new BorderLayout());                  //ADDING TO FRAME
		this.add(titlePanel,BorderLayout.NORTH);
		this.add(buttonPanel,BorderLayout.CENTER);
		this.add(bottomPanel,BorderLayout.SOUTH);
		this.add(rightPanel,BorderLayout.WEST);
		this.add(leftPanel,BorderLayout.EAST);
		resetButton.addActionListener(this);
		
		
		FirstTurn();
		
		
		
	}
	
	
public void FirstTurn(){
	
		random = new Random();
		
		if(random.nextInt(2)==0) {
			palyer1_turn = true;
			xLabel.setForeground(Color.GREEN);
			
			
		}
		
		else {
			palyer1_turn = false;
			oLabel.setForeground(Color.GREEN);
			
		}
		
	}


public void check() {
	
	//X wins
	
	if((buttons[0].getText()=="X")&&
	   (buttons[1].getText()=="X")&&
	   (buttons[2].getText()=="X")) {
		
		xWins(0,1,2);
	}
	
	if((buttons[3].getText()=="X")&&
	   (buttons[4].getText()=="X")&&
	   (buttons[5].getText()=="X")) {
				
		xWins(3,4,5);
	}
	
	if((buttons[6].getText()=="X")&&
	   (buttons[7].getText()=="X")&&
	   (buttons[8].getText()=="X")) {
						
		xWins(6,7,8);
			
	}
	
	if((buttons[3].getText()=="X")&&
	   (buttons[4].getText()=="X")&&
	   (buttons[5].getText()=="X")) {
						
		xWins(3,4,5);
			
	}
	
	if((buttons[0].getText()=="X")&&
	   (buttons[3].getText()=="X")&&
	   (buttons[6].getText()=="X")) {
						
		xWins(0,3,6);
			
	}
	
	if((buttons[1].getText()=="X")&&
	   (buttons[4].getText()=="X")&&
	   (buttons[7].getText()=="X")) {
						
		xWins(1,4,7);
			
	}
	
	if((buttons[2].getText()=="X")&&
	   (buttons[5].getText()=="X")&&
	   (buttons[8].getText()=="X")) {
						
		xWins(2,5,8);
			
	}
	
	if((buttons[0].getText()=="X")&&
	   (buttons[4].getText()=="X")&&
	   (buttons[8].getText()=="X")) {
						
		xWins(0,4,8);
			
	}
	
	if((buttons[2].getText()=="X")&&
	   (buttons[4].getText()=="X")&&
	   (buttons[6].getText()=="X")) {
						
		xWins(2,4,6);
			
	}
	
	//O wins
	
	        if((buttons[0].getText()=="O")&&
			   (buttons[1].getText()=="O")&&
			   (buttons[2].getText()=="O")) {
				
				oWins(0,1,2);
			}
			
			if((buttons[3].getText()=="O")&&
			   (buttons[4].getText()=="O")&&
			   (buttons[5].getText()=="O")) {
						
				oWins(3,4,5);
			}
			
			if((buttons[6].getText()=="O")&&
			   (buttons[7].getText()=="O")&&
			   (buttons[8].getText()=="O")) {
								
				oWins(6,7,8);
					
			}
			
			if((buttons[3].getText()=="O")&&
			   (buttons[4].getText()=="O")&&
			   (buttons[5].getText()=="O")) {
								
				oWins(3,4,5);
					
			}
			
			if((buttons[0].getText()=="O")&&
			   (buttons[3].getText()=="O")&&
			   (buttons[6].getText()=="O")) {
								
				oWins(0,3,6);
					
			}
			
			if((buttons[1].getText()=="O")&&
			   (buttons[4].getText()=="O")&&
			   (buttons[7].getText()=="O")) {
								
				oWins(1,4,7);
					
			}
			
			if((buttons[2].getText()=="O")&&
			   (buttons[5].getText()=="O")&&
			   (buttons[8].getText()=="O")) {
								
				oWins(2,5,8);
					
			}
			
			if((buttons[0].getText()=="O")&&
			   (buttons[4].getText()=="O")&&
			   (buttons[8].getText()=="O")) {
								
				oWins(0,4,8);
					
			}
			
			if((buttons[2].getText()=="O")&&
			   (buttons[4].getText()=="O")&&
			   (buttons[6].getText()=="O")) {
								
				oWins(2,4,6);
					
			}
	
	
	
}

  public void oWins(int a,int b,int c) {
	buttons[a].setBackground(Color.GREEN);
	buttons[b].setBackground(Color.GREEN);
	buttons[c].setBackground(Color.GREEN);
	
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
	}
	
	messege = new JOptionPane();
	messege.showMessageDialog(null,"O wins the game","Thanks For Playing",JOptionPane.INFORMATION_MESSAGE);	
	
  }

  public void xWins(int a,int b,int c) {
	buttons[a].setBackground(Color.GREEN);
	buttons[b].setBackground(Color.GREEN);
	buttons[c].setBackground(Color.GREEN);
	
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
	}
	messege = new JOptionPane();
	messege.showMessageDialog(null,"X wins the game","Thanks For Playing",JOptionPane.INFORMATION_MESSAGE);
	
  }


@Override
public void actionPerformed(ActionEvent e) {
	for(int i=0;i<9;i++) {
		
		if(e.getSource()==buttons[i]) {
			
			if(palyer1_turn == true) {
				
				if(buttons[i].getText()=="") {
					buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
					buttons[i].setForeground(Color.GREEN);
					buttons[i].setText("X");
					palyer1_turn = false;
					xLabel.setForeground(Color.WHITE);
					oLabel.setForeground(Color.BLUE);
					check();
					
				}
			}
			
			else {
			
				 
				if(buttons[i].getText()=="") {
					buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
					buttons[i].setText("O");
					buttons[i].setForeground(Color.BLUE);
					palyer1_turn = true;
					xLabel.setForeground(Color.GREEN);
					oLabel.setForeground(Color.WHITE);
					check();
				}
					
				}
			}
		if(e.getSource()==resetButton) {
			
			for(int k=0;k<9;k++) {
				buttons[k].setText("");
				buttons[k].setEnabled(true);
				buttons[k].setBackground(null);
				
			}	
			
		}
			
		}
		
	}
	
	
	
}

