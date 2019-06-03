package vaadinproto.wc;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

/**
 * Wrap the paper-slider web component
 * @author richard
 *
 */
@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider extends AbstractSinglePropertyField<PaperSlider, Integer> {
	private static final long serialVersionUID = 1L;
	
    private static final PropertyDescriptor<Boolean, Boolean> pinProperty = PropertyDescriptors.propertyWithDefault("pin", false);

    public PaperSlider() {
        super("value", 0, false);
    }
    
    public void setPin(boolean pin) {
        pinProperty.set(this, pin);
    }

    public boolean isPin() {
        return pinProperty.get(this);
    }	  
}
