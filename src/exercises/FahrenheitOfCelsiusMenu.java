package exercises;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class FahrenheitOfCelsiusMenu {

	private List<String> tempOptions = new ArrayList<>();

	public FahrenheitOfCelsiusMenu() {
		tempOptions.add("C");
		tempOptions.add("F");
	}

	public List<String> getTempOptions() {
		return tempOptions;
	}

}
