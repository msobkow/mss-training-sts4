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
package org.msscf.sts4training.javafx.model;

import org.springframework.stereotype.Component;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Getter;
import lombok.Setter;

@Component
public class JavaFX {

	StringProperty fontChoice = new SimpleStringProperty();
	StringProperty editArea = new SimpleStringProperty();

	public JavaFX() {
	}
	
	public JavaFX( String argFontChoice, String argEditArea ) {
		setFontChoice( argFontChoice );
		setEditArea( argEditArea );
	}

//	Set<Criteria> setOfCriteria = new HashSet<>();
//	Set<StoryLabel> storyLabels = new HashSet<>();

	public String getFontChoice() {	return fontChoice.get(); }
	public void setFontChoice(String aStringFontChoice ) { this.fontChoice.setValue(aStringFontChoice ); }
	public StringProperty getFontChoiceProperty() {	return fontChoice; }
	
	public String getEditArea() { return editArea.get(); }
	public void setEditArea(String aStringEditArea) { this.editArea.setValue(aStringEditArea); }
	public StringProperty getEditAreaProperty() { return editArea; }

	@Override
	public String toString() {
		return "JavaFX [fontChoice=" + fontChoice + ", editArea=" + editArea + "]";
	}

}
