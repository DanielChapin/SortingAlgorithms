package org.daniel.sortingalgorithms.objects;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SAPanel extends JPanel {
	
	private int[] heights;
	
	public SAPanel() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setContentPane(this);
		frame.setVisible(true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.heights = new int[frame.getWidth()];
		
	}
	
	@Override
	public void paint(Graphics g) {
		
	}

}
