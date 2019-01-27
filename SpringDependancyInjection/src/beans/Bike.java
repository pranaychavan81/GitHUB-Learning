package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Bike {
	@Autowired
	@Qualifier(value="z1")
	private Zip bikeEngine;

	/*public void setBikeEngine(Zip bikeEngine) {
		this.bikeEngine = bikeEngine;
	}*/
	
	 /*public Bike(Zip bikeEngine){
		this.bikeEngine=bikeEngine;
	}*/
	public void printData() {
		System.out.println(bikeEngine.getZipyear());
	}

}
