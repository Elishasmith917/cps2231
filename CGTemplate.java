package cps2231_Lab4;

/*
**************************************************************
* Kean University
* Semester Spring 24
* 
* Course: CPS-2231 - Computer Programming
* Authors: Elisha Smith CPS-2231-03/01
* Lab: 4
* Task 3
* Program Description: Displays 5 circles of various colors
**************************************************************
*/

import java.awt.*; // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*; // Using Swing's components and containers

	public class CGTemplate extends JFrame {
		public static final int CANVAS_WIDTH = 640;
		public static final int CANVAS_HEIGHT = 480;
		
		private DrawCanvas canvas;
		// Constructor to set up the GUI components and event handlers
		public CGTemplate() {
		canvas = new DrawCanvas(); // Construct the drawing canvas
		
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH,
		CANVAS_HEIGHT));
		// Set the Drawing JPanel as the JFrame's content-pane
		Container cp = getContentPane();
		cp.add(canvas);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Handle the CLOSE button
		pack(); // Either pack() the components; or setSize()
		setTitle("Lab4 s make a Circle"); // "super" JFrame sets the title
		setVisible(true); // "super" JFrame show
		}
		private class DrawCanvas extends JPanel {
			// Override paintComponent to perform your own painting
			@Override
			public void paintComponent(Graphics g) {
			super.paintComponent(g); // paint parent's background
			setBackground(java.awt.Color.BLUE); // you can update this
			//Attention: this part is where you need to write code and finish.
			// TO-DO List: Create Five Circles:
			// C1: Color: Green, Radius: 1
			// C2: Color: White, Radius: 5
			// C3: Color: Red, Radius: 2
			// C4: Color: Yellow, Radius: 2.5
			// C5: Color: Black, Radius: 8
			// First Circle, it is an example
			g.setColor(java.awt.Color.GREEN); // set the drawing color
			g.fillOval(50, 50, 100, 100); // first two numbers are X&Y coordinates, 100 & 100 are width and height
			// Second Circle, it is the second example
			g.setColor(java.awt.Color.WHITE); // set the drawing color
			g.fillOval(200, 50, 500, 500);
			// Please create the code for C3 here
			g.setColor(java.awt.Color.RED); // set the drawing color
			g.fillOval(50, 200, 200, 200);
			// Please create the code for C4 here
			g.setColor(java.awt.Color.YELLOW); // set the drawing color
			g.fillOval(200, 50, 250, 250);
			// Please create the code for C5 here
			g.setColor(java.awt.Color.BLACK); // set the drawing color
			g.fillOval(200, 100, 800, 800);
			g.setFont(new Font("Monospaced", Font.PLAIN, 12));
			g.drawString("Circles c1, c2, c3, c4 and c5", 10, 20);
			}
			}
			public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
			new CGTemplate();
			}
			});
		}
}