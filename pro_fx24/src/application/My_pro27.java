package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class My_pro27 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("JavaFx App");
			
			Slider slider = new Slider(0, 100, 0);
			slider.setMajorTickUnit(8.0);
			slider.setMinorTickCount(3);
			slider.setSnapToTicks(true);
			slider.setShowTickMarks(true);
			slider.setShowTickLabels(true);
			
			VBox vbox = new VBox(slider);
			Scene scene = new Scene(vbox,460,300);
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
