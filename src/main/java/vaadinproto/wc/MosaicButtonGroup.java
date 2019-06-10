package vaadinproto.wc;

import java.util.Collection;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.shared.ui.LoadMode;

// example wrapping for mosaic-button-group
//   - includes a set of child buttons
@Tag("mosaic-button-group")
@JavaScript(loadMode = LoadMode.LAZY, value = "mosaiclocal.js")
@JavaScript(loadMode = LoadMode.LAZY, value = "bower_components/mosaic-components/9.0.0/mosaic-components/dist/components-loader.js")
public class MosaicButtonGroup extends Component {

	private static final long serialVersionUID = 1L;

	private static final String ATTR_SIZE     = "size";
	private static final String ATTR_VERTICAL = "vertical";
	private static final String ATTR_SPACED   = "spaced";
	
	public MosaicButtonGroup() {
		super();
		initDefaults();
	}

	private void initDefaults() {
		setSizeLarge();
		setVertical(false);
		setSpaced(false);
	}

	private void setSpaced(boolean spaced) {
		getElement().setAttribute(ATTR_SPACED, spaced);
	}

	public void setVertical(boolean vertical) {
		getElement().setAttribute(ATTR_VERTICAL, vertical);
	}
	
	public void setSizeSmall() {
		getElement().setAttribute(ATTR_SIZE, "sm");
	}
	
	public void setSizeLarge() {
		getElement().setAttribute(ATTR_SIZE, "lg");
	}
	
	public void add(MosaicButton button) {
		getElement().appendChild(button.getElement());
	}
	
	public void add(MosaicButton... buttons) {
		if (buttons != null) {
			for (MosaicButton button : buttons) {
				add(button);
			}
		}
	}
	
	public void add(Collection<MosaicButton> buttons) {
		if (buttons != null) {
			buttons.forEach(this::add);
		}
	}
	
	public void clear() {
		getElement().removeAllChildren();
	}
}
