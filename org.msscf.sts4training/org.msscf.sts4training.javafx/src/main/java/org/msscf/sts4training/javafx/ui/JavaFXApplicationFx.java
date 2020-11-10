package org.msscf.sts4training.javafx.ui;

import com.airhacks.afterburner.injection.Injector;

//import com.airhacks.followme.dashboard.DashboardView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

public class JavaFXApplicationFx extends Application {
//	private ConfigurableApplicationContext context;

	Stage primaryStage = null;

/*
 * This class is based on https://stackoverflow.com/questions/24875401/is-it-possible-combine-fxinclude-and-afterburner	
 */
	
	
//	private Object createControllerForType(Class<?> type) {
//		return this.context.getBean(type);
//	}
	
	
//	@Override
//	public void init() throws Exception {
////		ApplicationContextInitializer<GenericApplicationContext> initializer = ac -> {
////			ac.registerBean(Application.class, () -> StoryboardApplicationFx.this);
////			ac.registerBean(Parameters.class, this::getParameters);
////			ac.registerBean(HostServices.class, this::getHostServices);
////
////		};
////		
////		this.context = new SpringApplicationBuilder().sources(StoryboardApplicationFx.class).initializers(initializer)
////				.run(getParameters().getRaw().toArray(new String[0]));
////		ConfigurableApplicationContext aContext = this.context;
//
//	}

	    @Override
	    public void start(Stage primaryStage) {
		System.out.println("JavaFXApplicationFx.start called");
		this.primaryStage = primaryStage;
	    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        JavaFXView javaFXView = new JavaFXView();
        JavaFXPresenter javaFXPresenter = (JavaFXPresenter)javaFXView.getPresenter();
        javaFXPresenter.setPrimaryStage( primaryStage );
        fxmlLoader.setRoot( javaFXView );

	        Scene scene = new Scene(javaFXView.getView(), 800, 400);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    @Override
	    public void stop() throws Exception {
	        Injector.forgetAll();
	    }

		public Stage getPrimaryStage() {
			return primaryStage;
		}

		public void setPrimaryStage(Stage primaryStage) {
			this.primaryStage = primaryStage;
		}

}
