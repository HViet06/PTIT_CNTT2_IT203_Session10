package SS10.ex1;

interface Shape{
    double getArea();
    double getPerimeter();
}

class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.height=height;
        this.width=width;
    }
    public  double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width*height);
    }
}
public class ex1 {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        System.out.println("Circle");
        System.out.println("Area= " + circle.getArea());
        System.out.println("Perimeter =" + circle.getPerimeter());
        Shape rectangle = new Rectangle(4,6);
        System.out.println("Rectangle");
        System.out.println("Area= " + rectangle.getArea());
        System.out.println("Perimeter= " + rectangle.getPerimeter());
    }
}
