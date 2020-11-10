package org.msscf.sts4training.javafx.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Getter;
import lombok.Setter;

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

	public String getFontChoice			   () {		return fontChoice            .get           ();	}	public void setFontChoice			 (String aStringFontChoice			  ) {		this.fontChoice			   .setValue(aStringFontChoice			  );	}	public StringProperty getFontChoiceProperty            () {		return fontChoice            ;	}
	public String getEditArea			   () {		return editArea              .get           ();	}	public void setEditArea				 (String aStringEditArea			  ) {		this.editArea			   .setValue(aStringEditArea			  );	}	public StringProperty getEditAreaProperty   		   () {		return editArea              ;	}

	@Override
	public String toString() {
		return "JavaFX [fontChoice=" + fontChoice + ", editArea=" + editArea + "]";
	}

}
