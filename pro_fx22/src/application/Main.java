package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			primaryStage.setTitle("ComboBox Experiment1");
			
			ComboBox comboBox = new ComboBox();
			
			comboBox.getItems().add("Choice1");
			comboBox.getItems().add("Choice2");
			comboBox.getItems().add("Choice3");
			
			HBox hbox = new HBox(comboBox);
			
			Scene scene = new Scene(hbox, 200, 120);
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
