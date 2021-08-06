package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class My_pro25 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFx App");
			
			ColorPicker colorPicker = new ColorPicker();
			
			Color value = colorPicker.getValue();
			
			VBox vbox = new VBox(colorPicker);
			Scene scene = new Scene(vbox,200,120);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
