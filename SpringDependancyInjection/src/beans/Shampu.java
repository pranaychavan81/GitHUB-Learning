package beans;

public class Shampu {
	private static String shampuname;

	public static void setShampuname(String shampuname) {
		Shampu.shampuname = shampuname;
	}
	public static  void printShampu() {
		System.out.println("I alaways use shampu "+shampuname);
	}

}
