package beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String Modelyear;
	
	public void setModelyear(String modelyear) {
		Modelyear = modelyear;
	}
	public String getModelyear() {
		return Modelyear;
	}
}
