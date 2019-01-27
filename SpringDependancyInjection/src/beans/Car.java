package beans;

public class Car {
	private String[] carname;
	private Engin[] engin;

	public void setEngin(Engin[] engin) {
		this.engin = engin;
	}

	public void setCarname(String[] carname) {
		this.carname = carname;
	}

	public void printCarData() {
		for (String car : carname) {
			System.out.println(car);

		}
		for (Engin e : engin) {
         System.out.println(e.getModelYear());
		}
	}

}
