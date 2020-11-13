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

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.airhacks.afterburner.views.FXMLView;

import javafx.scene.Parent;

@Component
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
