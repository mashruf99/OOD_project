package Game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	GamePanel panel = new GamePanel();
	
	
	GameFrame(){
		this.add(panel);
		this.setTitle("The PONG GAME");
		this.setResizable(false);
		this.setBackground(Color.GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();//set according to file
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	
	
	
	
	
	
}
