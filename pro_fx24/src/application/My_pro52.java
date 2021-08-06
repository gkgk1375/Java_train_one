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
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class My_pro52 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			  primaryStage.setTitle("Pie Chart");
			  PieChart pieChart = new PieChart();
			  
			  PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
			  PieChart.Data slice2 = new PieChart.Data("Phone", 67);
			  PieChart.Data slice3 = new PieChart.Data("Tablet", 36);
			  
			  pieChart.getData().add(slice1);
			  pieChart.getData().add(slice2);
			  pieChart.getData().add(slice3);
			
			
			VBox vbox = new VBox(pieChart);
			Scene scene = new Scene(vbox,400,200);
			primaryStage.setScene(scene);
			primaryStage.setHeight(500);
			primaryStage.setWidth(700);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
