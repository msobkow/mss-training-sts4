package org.msscf.sts4training.javafx.ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class JavaFXController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane mainGrid;

    @FXML
    private Label mainLabel;

    @FXML
    private ChoiceBox<?> fontChoice;

    @FXML
    private TextArea editArea;

    @FXML
    void initialize() {
    	if( mainGrid == null ) { throw new RuntimeException( "fx:id=\"mainGrid\" was not injected" ); }
    	if( mainLabel == null ) { throw new RuntimeException( "fx:id=\"mainLabel\" was not injected" ); }
    	if( fontChoice == null ) { throw new RuntimeException( "fx:id=\"fontChoice\" was not injected" ); }
    	if( editArea == null ) { throw new RuntimeException( "fx:id=\"editArea\" was not injected" ); }
    }
}
