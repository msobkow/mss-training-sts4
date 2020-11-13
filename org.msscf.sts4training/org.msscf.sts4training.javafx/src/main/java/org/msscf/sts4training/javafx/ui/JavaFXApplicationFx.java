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

import java.io.IOException;
import java.net.URL;

import org.msscf.sts4training.javafx.JavaFXApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.airhacks.afterburner.injection.Injector;

//import com.airhacks.followme.dashboard.DashboardView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

@SpringBootApplication
public class JavaFXApplicationFx extends Application {


	/*
	 * The vast majority of the code in this file was taken from
	 * the JavaFX-Spring4 integration sample provided by Mario
	 * Jauvin of MFJ Associates at https://github.com/marioja/javafx/
	 * 
	 * The code in question comes from the "mfx11boot" sample, slightly
	 * modified to comply with the resource naming of my code base.
	 * 
	 * As such, anyone copying this code should credit Mario as I just
	 * did; he provided the heavy lifting for getting the two tool
	 * chains integrated.
	 */
	private static String[] savedArgs;
	private ConfigurableApplicationContext context;

	Stage primaryStage = null;

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	private URL location;
	
	public URL getLocation() {
		return location;
	}
	
	public void setLocation( URL value ) {
		location = value;
	}
	
	@Override
	public void init() throws Exception {
		this.context = SpringApplication.run( JavaFXApplication.class, savedArgs );
	}

	@Override
	public void stop() throws Exception {
        Injector.forgetAll();
		context.close();
		System.gc();
		System.runFinalization();
	}
	
	private Object createControllerForType( Class<?> type ) {
		return this.context.getBean( type );
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("JavaFXApplicationFx.start called");
		this.primaryStage = primaryStage;
		try {
			URL location = getClass().getResource( "Main.fxml" );
			FXMLLoader loader=new FXMLLoader( location );
			loader.setControllerFactory(this::createControllerForType);

			JavaFXView javaFXView = new JavaFXView();
			JavaFXPresenter javaFXPresenter = (JavaFXPresenter)javaFXView.getPresenter();
			javaFXPresenter.setPrimaryStage( primaryStage );
			loader.setRoot( javaFXView );;
// Tried adding this, makes no difference
			loader.setLocation( location );
			Parent root = loader.load( location );
			Scene scene = new Scene(root,800,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(IOException e) {
			throw new IllegalStateException("Unable to load view:", e);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("JavaFXApplication main called");
		//Application.launch(JavaFXApplicationFx.class, args);
		savedArgs = args;
		launch( args );
	}
}
