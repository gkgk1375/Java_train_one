package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class My_pro32 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("JavaFx App");
			
			ProgressBar progressBar = new ProgressBar(0);
			
			for(float i=0; i<=10;  i += 0.1)
			    progressBar.setProgress(i);
			
			VBox vbox = new VBox(progressBar);
			Scene scene = new Scene(vbox,960,600);
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
