package application;

import entities.AllPokemonNames;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import resources.DPSUtils;
import threads.CatchMe;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/MyView.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("DiscordPokeSniper " + DPSUtils.getVersion());
			primaryStage.show();
			primaryStage.setMinWidth(605.0);
			primaryStage.setMinHeight(400.0);
			primaryStage.setOnCloseRequest(e -> {
				DPSUtils.stopBot("User closed the program!");
				JSONHandler.UpdatePokeList();
				Platform.exit();
				System.exit(0);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AllPokemonNames();
		DPSUtils.setCurrentDirectoryLocation();
		DPSUtils.loadSnipingPokemon();
		Thread catchs = new CatchMe();
		catchs.start();
		launch(args);
	}

}
