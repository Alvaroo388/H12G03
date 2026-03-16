package es.uah.matcomp.mp.e1.ejerciciosclases.ej35;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        length= 1.0;
        width= 1.0;
    }
    public Rectangle(double width,double length){
        super();
        this.width= width;
        this.length=length;
    }

    public Rectangle(double width,double length,String color, boolean filled){
        super(color, filled);
        this.width= width;
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length * 2) + (2 * width);
    }

    @Override
    public String toString(){
        return "Rectangle["+ super.toString()+ ",length=" + length + " ,width=" + width + "]";
    }
}
