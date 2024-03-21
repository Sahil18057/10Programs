import java.util.*;

/**
 * A program to calculate two roots of a quadratic equation.
 * Assume that a <> 0 and the relationship b^2 >= 4ac holds,
 * so there will be real number solutions for x.
 * 
 * @author James T. Streib and Takako Soma
 * 
*/

public class QuadEq
{
    
/**
 * This method inputs three numbers then calculates and
 * outputs two roots.
 */
 
    public static void main(String[] args)
    {
        // declaration and initialization of variables 
        double a, b, c, root1, root2, sqrtDiscr;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // input a, b, and c 
        System.out.print("Enter a: "); 
        a = scanner.nextDouble(); 
        System.out.print("Enter b: "); 
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        // compute the two roots
        sqrtDiscr = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        root1 = (-b + sqrtDiscr) / (2*a);
        root2 = (-b - sqrtDiscr) / (2*a);

        // output two roots
        System.out.println();
        System.out.println("Two roots of the equation, " + a + "*x*x + " + b + "*x + " + c + " = 0, are");

        System.out.printf("%.2f and %.2f.", root1, root2);

    }
}



