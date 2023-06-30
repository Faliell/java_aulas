package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		add(new Toolbar(), BorderLayout.NORTH);	
		add(new MainPanel(), BorderLayout.CENTER);
		
		
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
 