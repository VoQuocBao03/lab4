package lab4.baitap;

public class Circle
{
    private Double radius;
    private String color;

    public Circle(int i, String string, int j) 
    {
        super();
        //todo auto - generted constructor stub
    }



    public Circle( Double radius, String color)
    {
        super();
        this.radius = radius;
        this.color = color;
    }


    public Double getRadius() {
        return radius;
    }
     public void setRadius(Double radius) {
        this.radius = radius;
    }



    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }



    public Double getArea() {
        return this.radius * this.radius * Math.PI;
    }


    public String getToString() {
        return "Circle{" + "radius=" + radius +", color='" + color + '\'' +'}';
    }



}

