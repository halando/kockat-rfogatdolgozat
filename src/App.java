import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
* File: ButtonPanel.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft V
* Date: 2023-04-04
* Github: https://github.com/janos/
* Licenc: GNU GPL
*/
public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 400, 300);
    }
}
