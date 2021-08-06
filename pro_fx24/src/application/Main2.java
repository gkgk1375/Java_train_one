package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class Main2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Font.loadFont(getClass().getResourceAsStream("Roboto-Regular.ttf"),
	                14
	        );
	        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	        primaryStage.setTitle("Hello World");
	        Scene scene = new Scene(root, 900, 275);
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
