package lab4.baitap;




public class Main {

  public static void main(String[] args) {
    Circle cylinder = new Circle (3, "red", 10);	
        System.out.println("Area: "     + cylinder.getArea());
        System.out.println("volume: "   +((Cylinder) cylinder).getVolume());	
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
  }

}

