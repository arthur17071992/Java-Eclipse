import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {
	// default diameter
	private int diameter = 10;
		
	// draw an oval of the specified diameter
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
		//g.fillRect(10, 10, diameter, diameter);
	}
		
	// validate and set diameter then repaint
	public void setDiameter(int newDiameter)
	{
		// if diameter invalid, default to 10
		diameter = (newDiameter >= 0 ? newDiameter : 10);
		// repaint panel
		repaint();
	}
		
	// used by layout manager to determine preferred size
	public Dimension getPreferredSize()
	{
		return new Dimension(200, 200);
	}
		
	// used by layout manager to determine minimun size
	public Dimension getMinimunSize()
	{
		return getPreferredSize();
	}
} // end class OvalPanel
