import java.util.*;

public class Company
{
    public static void main(String[] args)
    {
        Employee [] employee;
        int numEmp, id;
        double salary, hourlyRate, hoursWorked;
        String type;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        numEmp = scanner.nextInt();
        employee = new Employee [numEmp];
        System.out.println();

        for(int i=0; i<employee.length; i++)
        {
            System.out.print("Enter id of employee " + (i+1) + ": ");
            id = scanner.nextInt();
            System.out.print("Enter either 'f' for full-time or ");
            System.out.print("'p' for part-time: ");
            type = scanner.next();

            if(type.equals("f"))
            {
                System.out.print("Enter salary of employee " + (i+1) + ": ");
                salary = scanner.nextDouble();
                employee [i] = new FullTime (id, salary);
            }
            else
            {
                System.out.print("Enter hourly rate of employee " + (i+1) + ": ");
                hourlyRate = scanner.nextDouble();
                System.out.print("Enter number of hours worked: ");
                hoursWorked = scanner.nextDouble();
                employee[i] = new PartTime(id, hourlyRate, hoursWorked);
            }
            System.out.println();
        }
        for(int i=0; i<employee.length; i++)
        System.out.println(employee [i].toString());
    }
}

/*


D:\mahesh\home-120324\continue>javac Company.java

D:\mahesh\home-120324\continue>java Company
Enter number of employees: 2

Enter id of employee 1: 18069
Enter either 'f' for full-time or 'p' for part-time: f
Enter salary of employee 1: 200000

Enter id of employee 2: 16057
Enter either 'f' for full-time or 'p' for part-time: p
Enter hourly rate of employee 2: 10000
Enter number of hours worked: 10

An employee with ID 18069 is a full-time employee
with salary $200000.00.

An employee with ID 16057 is a part-time employee
with wages $100000.00


*/