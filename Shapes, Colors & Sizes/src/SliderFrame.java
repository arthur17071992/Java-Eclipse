import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame{
	// Slider to select diameter
	private final JSlider diameterJSlider;
	// panel to draw circle
	private final OvalPanel myPanel;
	
	// no-argument constructor
	public SliderFrame()
	{
		super("Slider Demo");
		
		// create panel to draw circle
		myPanel = new OvalPanel();
//		myPanel.setBackground(Color.MAGENTA);
//		myPanel.setForeground(Color.GREEN);
		
		// set up JSlider to control diameter value
		diameterJSlider = 
				new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		// create tick every 10
		diameterJSlider.setMinorTickSpacing(10);
		// paint ticks on slider
		diameterJSlider.setPaintTicks(true);
		
		// register Jslider event listener
		diameterJSlider.addChangeListener(
				new ChangeListener() // anonymous inner class
				{
					// handle change in slider value
					@Override
					public void stateChanged(ChangeEvent e)
					{
						myPanel.setDiameter(diameterJSlider.getValue());
					}
				}
				);
		
		add(diameterJSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	} // end constructor
} // end class SliderFrame
