import java.util.*;

class Gcd
{
    private static int gcd(int num1, int num2)
    {
        if (num2 >= 1)
            return gcd (num2, num1%num2);
        else
            return num1;
    }

    public static void main(String[] args)
    {
        int n, k, result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n = scanner.nextInt();

        System.out.print("Enter second number: ");
        k = scanner.nextInt();

        result = gcd(n,k);
        System.out.println();
        System.out.println("The greatest common divisor of " + n + " and " + k + " is " + result + ".");
    }
}

