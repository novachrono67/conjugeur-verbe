package client;

import controllers.ConnexionController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Client extends Application
{

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        System.setProperty("file.encoding", "UTF-8");

        try {
            String test = System.getProperty("user.dir");
            URL url = (new File(test + "\\src\\main\\java\\vues\\Connexion.fxml").toURI().toURL());
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            ConnexionController connexion = new ConnexionController();
            fxmlLoader.setController(connexion);
            AnchorPane root = null;
            try {
                root = fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Connexion");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
