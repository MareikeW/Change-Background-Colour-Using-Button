import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//*When you click on the button, the background colour of the window will change to a random colour. */

public class ColourButton extends JFrame {
	JPanel panel;
	JButton button;
	
	//Constructor
	public ColourButton() {
		panel = new JPanel();
		panel.setBackground(randomColor());
		add(panel);
		
		//set the size of the panel to frame size
		panel.setPreferredSize(new Dimension(300, 300));
		
		//create button
		button = new JButton("Click me to change the colour of the background!");
		setLayout(new FlowLayout());
		panel.add(button);
		
		//when button is clicked something will happen
		event e = new event();
		button.addActionListener(e);
	}
	
	//add all possible colour combinations to random colour selection
	public Color randomColor() {
		int r = (int)(Math.random()*256); //red
		int g = (int)(Math.random()*256); //green
		int b = (int)(Math.random()*256); //blue
		
		return(new Color(r, g, b));
	}
	
	//when button is clicked, background colour will change to a random colour
	public class event implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
				panel.setBackground(randomColor());	
			}
	}
	
	//set window frame
	public static void main(String[] args) {
		ColourButton gui = new ColourButton();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(300, 300);
		gui.setTitle("Colourful Background");	
	}
}
