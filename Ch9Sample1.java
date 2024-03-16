import java.util.*;

public class Ch9Sample1
{
    public static void main(String[] args)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        Triangle triangle;
        int lenSide;
        double area;

        System.out.print("Enter the length of a side: "); 
        lenSide = scanner.nextInt();

        triangle = new Triangle(lenSide); 
        area = triangle.calcArea();

        System.out.println();
        System.out.printf("The area is: $5.2f", area); 
        System.out.println();
    }
}

class Triangle extends RegPolygon
{
    public Triangle(int lenside)
    {
        super(lenSide);
    }

    public double calcArea()
    {
        double area;
        area = Math.sqrt(3.0)/4.0 * calcRegPolyArea();
        return area;
    }
}

class RegPolygon
{
    private int lenSide;

    public RegPolygon(int lenSide)
    { 
        this.lenSide = lenSide;
    }

    public double calcRegPolyArea()
    {
        double a;
        a = Math.pow(lenSide, 2);
        return a;
    }
}

/*


D:\mahesh\home-120324>javac Ch9Sample1.java

D:\mahesh\home-120324>java Ch9Sample1
Enter the length of a side: 4

The area is: $5.2f

*/