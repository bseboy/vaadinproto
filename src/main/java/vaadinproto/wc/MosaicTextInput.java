package vaadinproto.wc;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.shared.ui.LoadMode;

@Tag("mosaic-text-input")
@JavaScript(loadMode = LoadMode.LAZY, value = "mosaiclocal.js")
@JavaScript(loadMode = LoadMode.LAZY, value = "bower_components/mosaic-components/9.0.0/mosaic-components/dist/components-loader.js")
public class MosaicTextInput extends AbstractSinglePropertyField<MosaicTextInput, String>{

	private static final long serialVersionUID = 1L;

	private static final String ATTR_REQUIRED = "required";
	private static final String ATTR_HELPTEXT = "helpText";
	private static final String ATTR_LABEL    = "label";
	private static final String ATTR_SIZE = "size";
	
	public MosaicTextInput() {
		super("value", "", String.class, MosaicTextInput::toModel, MosaicTextInput::toPresentation );
	}
	
	private static String toModel(String presentation) {
		if ("".equals(presentation)) { return null; }
		return presentation;
	}
	
	private static String toPresentation(String model) {
		if (model == null) { return ""; }
		return model;
	}
	
	public void sizeLarge() {
		getElement().setAttribute(ATTR_SIZE, "lg");
	}

	public void sizeSmall() {
		getElement().setAttribute(ATTR_SIZE, "sm");
	}
	
	public void setRequired(boolean required) {
		getElement().setAttribute(ATTR_REQUIRED, required);
	}
	
	public void setHelpText(String helpText) {
		getElement().setAttribute(ATTR_HELPTEXT, helpText);
	}
	
	public void setLabel(String label) {
		getElement().setAttribute(ATTR_LABEL, label);
	}
}
