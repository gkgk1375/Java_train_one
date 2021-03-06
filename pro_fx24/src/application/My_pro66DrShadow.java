package application;
	
import java.io.File;

import javafx.application.Application;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class My_pro66DrShadow extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			DropShadow dropShadow1 = new DropShadow();
			dropShadow1.setRadius(1);
			dropShadow1.setOffsetX(10);
			dropShadow1.setOffsetY(10);
			dropShadow1.setColor(Color.web("#333333"));
			
			Circle circle1 =new Circle(75, 75, 50, Color.RED);
			circle1.setEffect(dropShadow1);
			
			DropShadow dropShadow2 = new DropShadow();
			dropShadow2.setRadius(5);
			dropShadow2.setOffsetX(20);
			dropShadow2.setOffsetY(20);
			dropShadow2.setColor(Color.web("#660066"));
			
			Circle circle2 =new Circle(200, 75, 50, Color.GREEN);
			circle2.setEffect(dropShadow2);
			
			DropShadow dropShadow3 = new DropShadow();
			dropShadow3.setRadius(25);
			dropShadow3.setOffsetX(30);
			dropShadow3.setOffsetY(30);
			dropShadow3.setColor(Color.web("#006666"));
			
			Circle circle3 =new Circle(325, 75, 50, Color.BLUE);
			circle3.setEffect(dropShadow3);
			 
			
			
			Scene scene = new Scene(new Pane(circle1, circle2, circle3), 425, 175);
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
