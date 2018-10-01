package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage mainStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene mainScene = new Scene(root,300,300);
			mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			mainStage.setScene(mainScene);
			mainStage.setTitle("Simple Calculator");
			mainStage.getIcons().add(new Image("/application/icon.jpg"));
			mainStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
