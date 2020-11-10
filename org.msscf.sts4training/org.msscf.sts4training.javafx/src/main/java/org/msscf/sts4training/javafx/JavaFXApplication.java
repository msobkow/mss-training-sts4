package org.msscf.sts4training.javafx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.msscf.sts4training.javafx.ui.JavaFXApplicationFx;

import javafx.application.Application;

@SpringBootApplication
public class JavaFXApplication {
	@Value("${spring.application.name}")
	private String name;
	
	public static void main(String[] args) {
		System.out.println("JavaFXApplication main called");
		Application.launch(JavaFXApplicationFx.class, args);
	}
}
