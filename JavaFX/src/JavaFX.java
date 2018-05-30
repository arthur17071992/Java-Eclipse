


import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;

public class JavaFX extends Application {

	@Override
	public void start(Stage primaryStage) {
		// create border pane
		BorderPane myPane = new BorderPane();
		// adding text to the pane
		Text myName = new Text("Arthur Nguyen");
		// set text font
		myName.setFont(Font.font("Calibri", 45));
		// adding DropShadow effect on text
		myName.setEffect(new DropShadow());
		// modify DropShadow effect
		myName.setEffect(new DropShadow(10,20,30,Color.BLUE));
		// center the text
		myPane.setCenter(myName);
		// create a scene
		primaryStage.setScene(new Scene(myPane));
		// display the scene
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
