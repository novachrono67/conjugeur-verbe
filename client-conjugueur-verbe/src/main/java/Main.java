import controllers.ConnexionController;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            String test = System.getProperty("user.dir");
            URL url = (new File(test + "\\src\\main\\java\\vues\\Connexion.fxml").toURI().toURL());
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            ConnexionController connexion = new ConnexionController();
            fxmlLoader.setController(connexion);
            AnchorPane root = null;
            try{
                root = fxmlLoader.load();
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Connexion");
            primaryStage.show();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
