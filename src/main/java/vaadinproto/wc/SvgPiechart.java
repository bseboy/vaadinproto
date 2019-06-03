package vaadinproto.wc;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("svg-piechart")
@HtmlImport("bower_components/svg-piechart/svg-piechart.html")
public class SvgPiechart extends Component {

	private static final long serialVersionUID = 1L;

	private static final PropertyDescriptor<String, String> propertyData = PropertyDescriptors.propertyWithDefault("data", "[]");
	private static final PropertyDescriptor<String, String> propertySize = PropertyDescriptors.propertyWithDefault("size", "100");
	
	public SvgPiechart(Integer size, List<Integer> data) {
		super();
		setSize(size);
		setData(data);
	}

	public void setData(List<Integer> data) {
		String ds = (data == null) ? "[]" : data.stream().map(i->i.toString()).collect(Collectors.joining(",", "[", "]")); 
		System.out.println("data=" + ds);
		propertyData.set(this, ds);
	}

	public void setSize(Integer size) {
		propertySize.set(this, (size==null?"0":size.toString()));
	}
}
