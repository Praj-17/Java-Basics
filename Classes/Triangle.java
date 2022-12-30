public class Triangle
{
    double height;
    double base;

    public Triangle(double height, double base)
    {
        this.height = height;
        this.base = base;
    }

    public double findArea()
    {
        return (this.base*this.height)/2;
    }
}