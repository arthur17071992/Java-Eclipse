import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrencyConverter {

	private JFrame frame;
	private JTextField textFieldUSD;
	private JTextField textFieldRate;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// create a window 
					CurrencyConverter window = new CurrencyConverter();
					window.frame.setVisible(true);
//					window.frame.setSize(400,150);
					window.frame.setLocation(500, 200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// create a frame
		frame = new JFrame("Currency Converter");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// create USD label, location & add label to the frame
		JLabel lblUsd = new JLabel("U.S Dollars");
		lblUsd.setBounds(271, 72, 110, 16);
		frame.getContentPane().add(lblUsd);
		// create Rate label, location & add label to the frame
		JLabel lblRate = new JLabel("Conversion Rate");
		lblRate.setBounds(271, 110, 110, 16);
		frame.getContentPane().add(lblRate);
		// create VND label, location & add label to the frame
		JLabel lblVND = new JLabel("Currency Convert");
		lblVND.setBounds(271, 148, 110, 16);
		frame.getContentPane().add(lblVND);
		// create USD textField, location, columns & add label to the frame
		textFieldUSD = new JTextField();
		textFieldUSD.setBounds(129, 67, 130, 26);
		frame.getContentPane().add(textFieldUSD);
		textFieldUSD.setColumns(10);
		// create Rate textField, location, columns & add label to the frame
		textFieldRate = new JTextField();
		textFieldRate.setBounds(128, 105, 130, 26);
		frame.getContentPane().add(textFieldRate);
		textFieldRate.setColumns(10);
		// create Results textField, location, columns & add label to the frame
		textField = new JTextField();
		textField.setBounds(129, 143, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// create a convert button
		JButton btnConvert = new JButton("Convert");
		// convert button action method
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get text from textField & convert text to double
				double txtUSD = Double.parseDouble(textFieldUSD.getText());
				double txtRate = Double.parseDouble(textFieldRate.getText());
				// algorithm
				double convert = txtUSD * txtRate;
				// display result on textFIeld
				textField.setText("" + convert);
				
//				String convert = String.format("%.2f", txtUSD * txtRate);
				
			}
		});
		// set convert button location & add it to the frame
		btnConvert.setBounds(129, 181, 117, 29);
		frame.getContentPane().add(btnConvert);
		// create a reset button
		JButton btnReset = new JButton("Reset");
		// reset button action method
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// set all textField to null
				textFieldUSD.setText(null);
				textFieldRate.setText(null);
				textField.setText(null);
				
			}
		});
		// set reset button location & add it to the frame
		btnReset.setBounds(264, 181, 117, 29);
		frame.getContentPane().add(btnReset);
	}
}
