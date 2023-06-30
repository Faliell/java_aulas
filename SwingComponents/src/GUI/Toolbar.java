package GUI;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;

	public Toolbar() {
		add(new JButton("one"));
		add(new JButton("two"));
	}

}
