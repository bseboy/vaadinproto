package vaadinproto.flow;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import vaadinproto.wc.PaperSlider;
import vaadinproto.wc.SvgPiechart;

@Route("hello")
public class Root extends Div {

	private static final long serialVersionUID = 1L;

	public Root() {
		super();
		setText("Hello World");
		
		final PaperSlider slider = new PaperSlider();
		slider.setValue(50);
		add(slider);

		final TextField value = new TextField("value");
		add(value);
		
		slider.addValueChangeListener(vce-> {
			value.setValue(vce.getValue().toString());
		});
		
		List<Integer> data = Stream.of(10,15,20,40).collect(Collectors.toList());
		SvgPiechart chart = new SvgPiechart(200, data);
		add(chart);
	}

}
