import javax.swing.JOptionPane;

public class Addition {
	public static void main (String [] args) {
		double number1 = 0.00;
		double number2 = 0.00;
		double number3 = 0.00;
		
		// TODO Auto-generated method stub
		String double1 = JOptionPane.showInputDialog("Enter First Number: ");
		String double2 = JOptionPane.showInputDialog("Enter Second Number: ");
		String double3 = JOptionPane.showInputDialog("Enter Third Number: ");
		
		try {
			number1 = Double.parseDouble(double1);
			number2 = Double.parseDouble(double2);
			number3 = Double.parseDouble(double3);
		}
		catch(Exception exception) {
			System.err.println(exception);
		}
		
		double sum = number1 + number2 + number3;
		JOptionPane.showMessageDialog(null, "The sum is: " + sum,
				"Sum of Three Number", JOptionPane.PLAIN_MESSAGE);
		
	} // end main
} // end class Addition
