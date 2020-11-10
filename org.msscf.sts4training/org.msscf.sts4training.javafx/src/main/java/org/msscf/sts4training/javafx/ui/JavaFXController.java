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
