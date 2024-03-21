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
