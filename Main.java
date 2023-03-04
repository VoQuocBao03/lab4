package lab4.baitap;


public class Main {
    public static void main(String[] args) {
		Cylinder cylinder = new Cylinder (3, "red", 9);	
        System.out.println("Area: "     + cylinder.getArea());
        System.out.println("volume: "   +((Cylinder) cylinder).getVolume());	
	}
}