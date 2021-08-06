package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class My_pro66Blur extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GaussianBlur blur = new GaussianBlur();
	        blur.setRadius(5);

	        Text text1 = new Text("Blur Effect 1");
	        text1.setLayoutX(30);
	        text1.setLayoutY(20);
	        text1.setTextOrigin(VPos.TOP);
	        text1.setFont(Font.font("Arial", FontWeight.BOLD, 40));
	        text1.setEffect(blur);


	        GaussianBlur blur2 = new GaussianBlur();
	        blur2.setRadius(10);

	        Text text2 = new Text("Blur Effect 2");
	        text2.setLayoutX(30);
	        text2.setLayoutY(100);
	        text2.setTextOrigin(VPos.TOP);
	        text2.setFont(Font.font("Arial", FontWeight.BOLD, 40));
	        text2.setEffect(blur2);



	        Scene scene = new Scene(new Pane(text1, text2), 425, 175);
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
