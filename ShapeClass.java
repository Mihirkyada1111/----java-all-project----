public class ShapeClass
{
    double length;
    double width;

    ShapeClass(double length,double width)
    {
        this.length = length;
        this.width = width;
    }

    public double Calculate()
    {
        return length * width;
    }
}
class Rectangle extends ShapeClass
{
    public Rectangle(double length,double width)
    {
        super(length,width);
        System.out.println(length+width);
    }

    public double Calculate()
    {
        return length * width;
    }
}
class Tringle extends ShapeClass
{
    public Tringle(double length,double width)
    {
        super(length,width);
        System.out.println(length+width);
    }

    public double Calculate()
    {
        return  length * width;
    }

    public static void main(String[] args)
    {
        ShapeClass s = new ShapeClass(5,5);
        Rectangle r = new Rectangle(5,5);
        Tringle t = new Tringle(5, 5);
        t.Calculate();
    }
}