package exercises;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

@FacesComponent("exercises.Temperature1")
public class Temperature1 extends UIInput implements NamingContainer{

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
		
		if(menuCorFS.equals("F")) {
			Double result = (inputTempD - 32) * 5 / 9;
			System.out.println("Result is: " + result);
			return result;
		} else {
			return inputTempD;
		}
		
	}
}
