package demo;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setBounds(10, 10, 700, 600);
		f.setTitle("Brick Breaker");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		
		GamePanel gamePanel = new GamePanel();
		f.add(gamePanel);
	}

}
