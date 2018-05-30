package application;


import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class MyCalculatorController implements Initializable {

	@FXML
	public Button zero;
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Button six;
	public Button seven;
	public Button eight;
	public Button nine;
	public Button point;
	public Button equal;
	public Button plus;
	public Button minus;
	public Button multiply;
	public Button divide;
	public Button clear;
	public TextField output;
	public Label displayOperation;
	
	private long fnumber;
	private long snumber;
	private String operation;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void zero_click()
	{
		String currentValue = output.getText();
		String set = "0";
		output.setText(currentValue + set);
	}
	public void one_click()
	{
		String currentValue = output.getText();
		String set = "1";
		output.setText(currentValue + set);
	}
	public void two_click()
	{
		String currentValue = output.getText();
		String set = "2";
		output.setText(currentValue + set);
	}
	public void three_click()
	{
		String currentValue = output.getText();
		String set = "3";
		output.setText(currentValue + set);
	}
	public void four_click()
	{
		String currentValue = output.getText();
		String set = "4";
		output.setText(currentValue + set);
	}
	public void five_click()
	{
		String currentValue = output.getText();
		String set = "5";
		output.setText(currentValue + set);
	}
	public void six_click()
	{
		String currentValue = output.getText();
		String set = "6";
		output.setText(currentValue + set);
	}
	public void seven_click()
	{
		String currentValue = output.getText();
		String set = "7";
		output.setText(currentValue + set);
	}
	public void eight_click()
	{
		String currentValue = output.getText();
		String set = "8";
		output.setText(currentValue + set);
	}
	public void nine_click()
	{
		String currentValue = output.getText();
		String set = "9";
		output.setText(currentValue + set);
	}
	public void point_click()
	{
		String currentValue = output.getText();
		String set = ".";
		output.setText(currentValue + set);
	}
	public void plus_click()
	{
		String value = output.getText();
		long valueDouble = (long) Double.parseDouble(value);
		this.fnumber = valueDouble;
		output.setText("");
		displayOperation.setText(value + " " + "+");
		operation = "+";
	}
	public void minus_click()
	{
		String value = output.getText();
		long valueDouble = (long) Double.parseDouble(value);
		this.fnumber = valueDouble;
		output.setText("");
		displayOperation.setText(value + " " + "-");
		operation = "-";
	}
	public void multiply_click()
	{
		String value = output.getText();
		long valueDouble = (long) Double.parseDouble(value);
		this.fnumber = valueDouble;
		output.setText("");
		displayOperation.setText(value + " " + "*");
		operation = "*";
	}
	public void divide_click()
	{
		String value = output.getText();
		long valueDouble = (long) Double.parseDouble(value);
		this.fnumber = valueDouble;
		output.setText("");
		displayOperation.setText(value + " " + "/");
		operation = "/";
	}
	public void equal_click()
	{
		switch(operation) {
		case "+":
			String plusValue = output.getText();
			this.snumber = (long) Double.parseDouble(plusValue);
			double plusResult = this.fnumber + this.snumber;
			output.setText(String.valueOf(plusResult));
			String plusDisplayOperation = displayOperation.getText();
			displayOperation.setText(plusDisplayOperation + " " + plusValue);
			break;
		case "-":
			String minusValue = output.getText();
			this.snumber = (long) Double.parseDouble(minusValue);
			double minusResult = this.fnumber - this.snumber;
			output.setText(String.valueOf(minusResult));
			String minusDisplayOperation = displayOperation.getText();
			displayOperation.setText(minusDisplayOperation + " " + minusValue);
			break;
		case "*":
			String multiplyValue = output.getText();
			this.snumber = (long) Double.parseDouble(multiplyValue);
			double multiplyResult = this.fnumber * this.snumber;
			output.setText(String.valueOf(multiplyResult));
			String multiplyDisplayOperation = displayOperation.getText();
			displayOperation.setText(multiplyDisplayOperation + " " + multiplyValue);
			break;
		case "/":
			String divideValue = output.getText();
			this.snumber = (long) Double.parseDouble(divideValue);
			double divideResult = this.fnumber / this.snumber;
			output.setText(String.valueOf(divideResult));
			String divideDisplayOperation = displayOperation.getText();
			displayOperation.setText(divideDisplayOperation + " " + divideValue);
			break;
		}
	}
	public void clear_click()
	{
		output.setText("");
		this.fnumber = 0;
		this.snumber = 0;
		displayOperation.setText("");
	}
	public void toggle_click()
	{
	
	}
	
} // end class
