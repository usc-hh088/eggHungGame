package egghunt.gui;

import egghunt.engine.GameEngine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * GUI for the Maze Runner Game.
 *
 * NOTE: Do NOT run this class directly in IntelliJ - run 'RunGame' instead.
 */
public class GameGUI extends Application {
    // TODO: move this to Controller class if you use FXML...
    private GameEngine engine = new GameEngine();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("game_gui.fxml"));
        //Button root = new Button("Amazing Miner Game coming soon...");
        //root.setFont(new Font(24));

        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Maze Runner Game");
        primaryStage.show();
    }

    /** In IntelliJ, do NOT run this method.  Run 'RunGame.main()' instead. */
    public static void main(String[] args) {
        launch(args);
    }
}
