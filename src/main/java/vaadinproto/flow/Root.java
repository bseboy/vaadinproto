package vaadinproto.flow;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

import vaadinproto.wc.MosaicButton;
import vaadinproto.wc.MosaicButtonGroup;
import vaadinproto.wc.MosaicCode;
import vaadinproto.wc.MosaicTextInput;

@Route("hello")
public class Root extends Div {

	private static final long serialVersionUID = 1L;

	public Root() {
		super();

		final MosaicCode code1 = new MosaicCode();
		code1.setLang("html");
		code1.setContent("<p>This is a paragraph.</p>");
		add(code1);

		
		final MosaicCode code2 = new MosaicCode();
		code2.setLang("html");
		code2.setContent("<p>This is a second paragraph.</p>");
		add(code2);
		
		
		final MosaicButton button1 = button("Button 1");
		//button1.setIcon("home");
		add(button1);
		
		
		final MosaicButtonGroup group1 = new MosaicButtonGroup();
		group1.add(button("Button 2"), button("Button 3"), button("Button 4"));
		add(group1);
		
		final MosaicTextInput text1 = new MosaicTextInput();
		text1.setLabel("Text Input 1");
		text1.setRequired(true);
		text1.addValueChangeListener(vce-> {
			Notification.show("Text is now : " + vce.getValue());
		});
		add(text1);
	}

	private MosaicButton button(String text) {
		final MosaicButton button = new MosaicButton();
		button.setText(text);
		button.sizeLarge();
		button.onClick( ()-> Notification.show(text + " Clicked") );
		return button;
	}

}
