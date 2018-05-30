import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class SliderRadioButtons extends JFrame{

	private JFrame frame;
	private OvalPanel myPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderRadioButtons window = new SliderRadioButtons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main

	/**
	 * Create the application.
	 */
	public SliderRadioButtons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Slider & Radio Buttons");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(96, 33, 251, 204);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(6, 6, 10, 10);
		panel.add(panel_1);
		
		
		JLabel lblBackground = new JLabel("Background");
		lblBackground.setBounds(6, 40, 78, 16);
		frame.getContentPane().add(lblBackground);
		
		JLabel lblForeground = new JLabel("Foreground");
		lblForeground.setBounds(362, 40, 82, 16);
		frame.getContentPane().add(lblForeground);
		
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
			}
		});
		rdbtnRed.setBounds(6, 78, 65, 23);
		frame.getContentPane().add(rdbtnRed);
		
		
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
		});
		rdbtnBlue.setBounds(6, 130, 65, 23);
		frame.getContentPane().add(rdbtnBlue);
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}
		});
		rdbtnGreen.setBounds(6, 178, 84, 23);
		frame.getContentPane().add(rdbtnGreen);
		
		JRadioButton rdbtnPink = new JRadioButton("Pink");
		rdbtnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.PINK);
			}
		});
		rdbtnPink.setBounds(359, 78, 91, 23);
		frame.getContentPane().add(rdbtnPink);
		
		JRadioButton rdbtnYellow = new JRadioButton("Yellow");
		rdbtnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.YELLOW);
			}
		});
		rdbtnYellow.setBounds(362, 130, 82, 23);
		frame.getContentPane().add(rdbtnYellow);
		
		JRadioButton rdbtnOrange = new JRadioButton("Orange");
		rdbtnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.ORANGE);
			}
		});
		rdbtnOrange.setBounds(362, 178, 88, 23);
		frame.getContentPane().add(rdbtnOrange);
		
		// panel to draw circle
		myPanel = new OvalPanel();
		JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		// create tick every 10
		slider.setMinorTickSpacing(10);
		// paint ticks on slider
		slider.setPaintTicks(true);
		slider.setBounds(6, 243, 438, 29);
		frame.getContentPane().add(slider);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				myPanel.setDiameter(slider.getValue());
				//System.out.println(slider.getValue());
			}
		});
		
		
		JRadioButton rdbtnSquare = new JRadioButton("Square");
		rdbtnSquare.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		rdbtnSquare.setBounds(127, 5, 82, 23);
		frame.getContentPane().add(rdbtnSquare);
		
		JRadioButton rdbtnCircle = new JRadioButton("Circle");
		rdbtnCircle.setBounds(239, 5, 78, 23);
		frame.getContentPane().add(rdbtnCircle);
	}
}
