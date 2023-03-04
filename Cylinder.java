package lab4.baitap;

public class Cylinder extends Circle
{
    private Double height;

    public Cylinder() {
        //todo auto-generated constructor stub
    }

    public Cylinder(double d, String color,int j)
    {
        super(d, color); //todo auto-generated constructor stub
        this.height = j;
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
