package application;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Format;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
public class MyTemperatureConverterController {
	// 32 default
	private BigDecimal sliderValue = new BigDecimal(32); 
	// GUI controls defined in FXML and used by the controller's code
	@FXML 
	private TextField fahTxtField;
	@FXML 
	private TextField celTxtField;
	@FXML 
	private Slider slider; 
	
	// called by FXMLLoader to initialize the controller
	public void initialize() 
	{
		// listeners for changes to slider value
		slider.valueProperty().addListener(
				new ChangeListener<Number>()
				{

					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue,
							Number newValue) 
					{
						// TODO Auto-generated method stub
//						sliderValue = 
//								BigDecimal.valueOf(newValue.intValue() / 100.0);
//						fahTxtField.setText(format(sliderValue));
					}			
				}
				);
	} // end initialize
}
