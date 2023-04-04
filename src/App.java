import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
* File: ButtonPanel.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I/1/N
* Date: 2023-04-04
* Github: https://github.com/halando/kockat-rfogatdolgozat
* Licenc: GNU GPL
*/
public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    
    //0367 feladat

    @Override
    public void start(Stage stage) throws Exception {

        StackPane stackPane = new StackPane();
        
        
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        HBox titlehbox = new HBox();
        HBox asidehbox = new HBox();
        HBox dtesthbox = new HBox();
        HBox volumehbox = new HBox();
        HBox buttonhbox = new HBox();

        Label titleLabel = new Label("Kocka térfogatszámítás");
        titlehbox.getChildren().add(titleLabel);
        titlehbox.setPadding(new Insets(10,10,10,10));
        titlehbox.setAlignment(Pos.CENTER_RIGHT);

        Label asideLabel = new Label("a oldal");
        TextField asideField = new TextField();
        asidehbox.getChildren().addAll(asideLabel, asideField);
        asidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(asideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(asideField, new Insets(0, 10, 0, 10));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);

        Label dtestLabel = new Label("d testátló");
        TextField dtestField = new TextField();
        dtesthbox.getChildren().addAll(dtestLabel, dtestField);
        dtesthbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(dtestLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(dtestField, new Insets(0, 10, 0, 10));
        dtestLabel.setMinWidth(100);
        dtestLabel.setAlignment(Pos.CENTER_RIGHT);
        Button calcButton = new Button("Számít");
        buttonhbox.getChildren().add(calcButton);
        buttonhbox.setAlignment(Pos.CENTER);
        buttonhbox.setPadding(new Insets(10,10,10,10));
        calcButton.setOnAction(e -> {
           startCalcArea();
        });

        
        vbox.getChildren().add(titlehbox);
        vbox.getChildren().add(asidehbox);
        vbox.getChildren().add(dtesthbox);

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
}
