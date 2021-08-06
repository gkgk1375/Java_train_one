package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
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


public class My_pro49 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Menu menu1 = new Menu("Menu 1");
			Menu menu = new Menu("Menu 1");
			MenuItem menuItem1 = new MenuItem("Item 1");
			MenuItem menuItem2 = new MenuItem("Item 2");
			MenuItem menuItem3 = new MenuItem("Item 3");
			MenuItem menuItem4 = new MenuItem("Item 4");
			
			menu.getItems().add(menuItem1);
			menu.getItems().add(menuItem2);
			menu.getItems().add(menuItem3);
			menu.getItems().add(menuItem4);
			
			MenuBar menuBar =new MenuBar();
			menuBar.getMenus().add(menu);
			
			
			VBox vbox = new VBox(menuBar);
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
