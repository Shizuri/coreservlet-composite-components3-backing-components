package exercises;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

@FacesComponent("exercises.Temperature2")
public class Temperature2 extends UIInput implements NamingContainer{
	
	private String units;

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public String getFamily() {  //boilerplate, this should always be so
		return("javax.faces.NamingContainer");
	}
	
	@Override
	public Object getSubmittedValue() {  //boilerplate, this should always be so
		return (this);
	}
	
	@Override
	protected Object getConvertedValue(FacesContext context, Object newSubmittedValue) throws ConverterException{
		UIInput uiInputTemp = (UIInput)findComponent("inputTemp");
		UIInput uiMenuCorF = (UIInput)findComponent("menuCorF");
		
		Double inputTempD = Double.parseDouble((String)uiInputTemp.getSubmittedValue());
		String menuCorFS = (String)uiMenuCorF.getSubmittedValue();
		
		System.out.println("menuCorFS = " + menuCorFS);
		System.out.println("This is temp2");
		
		if(menuCorFS.equals("F")) {
			Double result = (inputTempD - 32) * 5 / 9;
			System.out.println("Result is: " + result);
			return result;
		} else {
			return inputTempD;
		}
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException{
		UIInput uiUnits = (UIInput)findComponent("menuCorF");
		System.out.println("Units is: " + units);
		if(units.equals("F")) {
			uiUnits.setValue("F");
		}
		super.encodeBegin(context);
	}
}
