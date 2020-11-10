package org.msscf.sts4training.javafx.ui;

import java.util.function.Function;

import com.airhacks.afterburner.views.FXMLView;

import javafx.scene.Parent;

public class JavaFXView extends FXMLView{
	
//    public JavaFXView(Function<String, Object> injectionContext) {
//        super(injectionContext);
//    }

    @Override
    public Parent getView() {
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException ex) {
        }
        return super.getView(); //To change body of generated methods, choose Tools | Templates.
    }
}
