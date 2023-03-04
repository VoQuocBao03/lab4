package lab4.baitap;

public class Cylinder extends Circle
{
    private Double height;






    public Cylinder(double radius, String color, Double height)
    {
        super( radius, color); //todo auto-generated constructor stub
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Double getVolume() {
        return super.getArea() * this.height;
    }   
}
