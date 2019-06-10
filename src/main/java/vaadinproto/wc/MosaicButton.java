package vaadinproto.wc;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.dom.DomEvent;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.shared.ui.LoadMode;

// mosaic-button wrapped for Vaadin
@Tag("mosaic-button")
@JavaScript(loadMode = LoadMode.LAZY, value = "mosaiclocal.js")
@JavaScript(loadMode = LoadMode.LAZY, value = "bower_components/mosaic-components/9.0.0/mosaic-components/dist/components-loader.js")
public class MosaicButton extends Component {

	private static final long serialVersionUID = 1L;
	
	private static final String ATTR_SIZE = "size";
	private static final String ATTR_ICON = "icon";
	
	private final DomEventListener listener = (ev)->handleClick(ev);
	private Runnable onClick;
	
	public MosaicButton() {
		super();
		initDefaults();
	}

	private void handleClick(DomEvent ev) {
		if (onClick != null) {
			onClick.run();
		}
	}

	private void initDefaults() {
		sizeLarge();
		setText("Button");
		getElement().addEventListener("click", listener);
	}

	public void sizeLarge() {
		getElement().setAttribute(ATTR_SIZE, "lg");
	}

	public void sizeSmall() {
		getElement().setAttribute(ATTR_SIZE, "sm");
	}
	
	public void setText(String text) {
		getElement().setText(text);
	}
	
	public void setIcon(String icon) {
		getElement().setAttribute(ATTR_ICON, icon);
	}
	
	public void onClick(Runnable onClick) {
		this.onClick = onClick; 
	}
}
