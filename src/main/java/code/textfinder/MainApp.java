package code.textfinder;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApp extends Application {
    static private Stage stg;


    @Override
    public void start(Stage stage) throws Exception { // metodo start que genera la primera interfaz y setea sus atributos

        stg = stage;
        stage.setResizable(false); // con esto no puedo hacer fullscreen para que no se alteren las dimensiones
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainwindow.fxml"))); // root padre y su respectivo fxml creado en scene builder
        stage.setTitle("EA Music Player");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();

    }
}

//-------------------------------------------------------//
//Scene scene = new Scene(root);
// root.getStylesheets().add((getClass().getResource("design.css").toExternalForm()));
//String css = this.getClass().getResource("design.css").toExternalForm();
//root.getStylesheets().add(css);
