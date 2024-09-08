package cps2231_Lab4;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(); // we are using no args
		System.out.println(c1.toString());
		System.out.println(" The radius of c1 = " + c1.getRadius());
		
		//  set the color
		c1.setColor(Color.GREEN);
		
		// add graphics
		javax.swing.JFrame frame = new javax.swing.JFrame("");
			javax.swing.JOptionPane.showMessageDialog(frame, 
					c1.toString(),
					" c1 information ",
					javax.swing.JOptionPane.INFORMATION_MESSAGE);
			// create new circle with radius 5
			Circle c2 = new Circle(5);
			c2.setColor(Color.WHITE);
			
			javax.swing.JOptionPane.showMessageDialog(frame, 
					c2.toString(),
					" c2 information ",
					javax.swing.JOptionPane.INFORMATION_MESSAGE);
			
			// c3
			Circle c3 = new Circle(2);
			c2.setColor(Color.RED);
			
			javax.swing.JOptionPane.showMessageDialog(frame, 
					c3.toString(),
					" c3 information ",
					javax.swing.JOptionPane.INFORMATION_MESSAGE);
			// c4
			Circle c4 = new Circle(2.5);
			c2.setColor(Color.YELLOW);
			
			javax.swing.JOptionPane.showMessageDialog(frame, 
					c4.toString(),
					" c4 information ",
					javax.swing.JOptionPane.INFORMATION_MESSAGE);
			// c5
			Circle c5 = new Circle(8);
			c5.setColor(Color.BROWN);
			
			javax.swing.JOptionPane.showMessageDialog(frame, 
					c5.toString(),
					" c5 information ",
					javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}

}
