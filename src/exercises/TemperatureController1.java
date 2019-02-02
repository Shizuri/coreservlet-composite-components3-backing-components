package exercises;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TemperatureController1 {

	private String soupType;
	private Double temperature = 0.0;

	public Double getTemperature() {
		return temperature;
	}
	
	public Double getTemperatureInF() {
		return(temperature * 9.0/5.0 + 32);
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	
	public String getSoupType() {
		return soupType;
	}

	public void setSoupType(String soupType) {
		this.soupType = soupType;
	}

	public String toResult() {
		return "exercise1-result";
	}
	
}
