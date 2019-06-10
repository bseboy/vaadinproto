package vaadinproto.wc;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.shared.ui.LoadMode;

// wrap a Mosaic 'mosaic-code' element in a Vaadin API
@Tag("mosaic-code")
@JavaScript(loadMode = LoadMode.LAZY, value = "mosaiclocal.js")
@JavaScript(loadMode = LoadMode.LAZY, value = "bower_components/mosaic-components/9.0.0/mosaic-components/dist/components-loader.js")
public class MosaicCode extends Component {

	private static final long serialVersionUID = 1L;

	private static final String ATTR_LANG = "lang";
	
	public MosaicCode() {
		super();
		initDefaults();
	}

	public MosaicCode(Element element) {
		super(element);
		initDefaults();
	}

	private void initDefaults() {
		setLang("html");
	}

	public void setLang(String language) {
		getElement().setAttribute(ATTR_LANG, language);
	}
	
	public void setContent(String content) {
		this.getElement().setText(content);
	}
	
	public void getContent() {
		this.getElement().getText();
	}
}
