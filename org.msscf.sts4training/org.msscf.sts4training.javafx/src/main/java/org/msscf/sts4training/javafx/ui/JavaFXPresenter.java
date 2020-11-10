/**
 *	Mark Stephen Sobkow's Training Projects for Spring Tool Suite 4 features needed for MssCFe
 *
 *	WARNING: This is NOT a training guide to show you how to use Spring 4.
 *	Rather, it is my personal playground for learning how to work with
 *	various Spring 4 technologies I'll need for my own
 *	MSS Code Forge Environment project (MssCFe.)
 *
 *		Copyright 2020 Mark Stephen Sobkow
 *
 *		Licensed under the Apache License, Version 2.0 (the "License");
 *		you may not use this file except in compliance with the License.
 *		You may obtain a copy of the License at
 *
 *		    http://www.apache.org/licenses/LICENSE-2.0
 *
 *		Unless required by applicable law or agreed to in writing, software
 *		distributed under the License is distributed on an "AS IS" BASIS,
 *		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *		See the License for the specific language governing permissions and
 *		limitations under the License.
 */
package org.msscf.sts4training.javafx.ui;

import java.net.URL;
import java.util.ResourceBundle;

import org.msscf.sts4training.javafx.model.JavaFX;

import javax.inject.Inject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author TournamentHouse.com
 */
@Setter
@Getter
public class JavaFXPresenter implements Initializable {

//    @FXML
    private ResourceBundle resources;

//    @FXML
    private URL location;

    @FXML
    private GridPane mainGrid;

    @FXML
    private Label mainLabel;

    @FXML
    private ComboBox<String> fontChoice;

    @FXML
    private TextArea editArea;

	private StringProperty editAreaProperty = new SimpleStringProperty("");

	@Inject
	JavaFX javaFX;

	//The logger for this class
	private Object logger = null;
	
	Stage primaryStage = null;

	public Stage getPrimaryStage() {
		return( primaryStage );
	}
	
	public void setPrimaryStage( Stage value ) {
		primaryStage = value;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.location = location;
		this.resources = resources;
    	if( mainGrid == null ) { throw new RuntimeException( "fx:id=\"mainGrid\" was not injected" ); }
    	if( mainLabel == null ) { throw new RuntimeException( "fx:id=\"mainLabel\" was not injected" ); }
    	if( fontChoice == null ) { throw new RuntimeException( "fx:id=\"fontChoice\" was not injected" ); }
    	if( editArea == null ) { throw new RuntimeException( "fx:id=\"editArea\" was not injected" ); }
    	initializeChoices();
    	bindFieldsToJavaFXModel(javaFX);
	}

	private void initializeChoices() {
    	if( fontChoice == null ) { throw new RuntimeException( "fx:id=\"fontChoice\" was not injected" ); }
    	fontChoice.setItems( FXCollections.observableArrayList(
    			"System",
    			"DejaVu Sans",
    			"FreeMono",
    			"FreeSans",
    			"FreeSerif",
    			"OpenDyslexic",
    			"OpenDyslexicMono",
    			"Ubuntu",
    			"Ubuntu Mono" ) );
    	fontChoice.setValue( "System" );
		fontChoice.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<String>() {
				public void changed(ObservableValue ov, String value, String newValue) {
					System.out.println( "Selected font name " + newValue );
					javaFX.setFontChoice( newValue );;
					editArea.setStyle( "-fx-font: 14px \"" + newValue + "\";" );;
				}
			} );
	}
	
	private void bindFieldsToJavaFXModel(JavaFX javaFX) {
		try {
            	editAreaProperty = javaFX.getEditAreaProperty();
            	editAreaProperty.bindBidirectional(editArea.textProperty());
            	editAreaProperty.addListener(
            		new ChangeListener<String>() {
            			@Override public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            				javaFX.setEditArea(newValue);
           				}
            		} );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void logMessage(String message) {
		//Note this message will use an available logging message
		if (logger == null) {
		System.out.println(message);
		}
	}

	public ResourceBundle getResources() {
		return resources;
	}

	public void setResources( ResourceBundle value ) {
		resources = value;
	}
	
	public URL getLocation() {
		return location;
	}
	
	public void setLocation( URL value ) {
		location = value;
	}

	public TextArea getEditArea() {
		return editArea;
	}
	
	public void setEditArea(TextArea value) {
		this.editArea = value;
	}

	public Label getMainLabel() {
		return mainLabel;
	}
	
	public void setMainLabel( Label value ) {
		mainLabel = value;
	}


	public GridPane getMainGrid() {
		return mainGrid;
	}
	
	public void setMainGrid( GridPane value ) {
		mainGrid = value;
	}
	
	public StringProperty getEditAreaProperty() {
		return editAreaProperty;
	}

	public void setEditAreaProperty(StringProperty editAreaProperty) {
		this.editAreaProperty = editAreaProperty;
	}
}
