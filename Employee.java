class Employee
{
    private int id;

    public Employee (int id)
    {
        this.id = id;
    }

    public String toString()
    {
        return "An employee with ID " + id;
    }
}

class FullTime extends Employee
{
    private double salary;

    public FullTime(int id, double salary)
    {
        super(id);
        this.salary = salary;
    }

    public String toString()
    {
        String str;
        str = String.format(super.toString() + " is a full-time employee \n" + "with salary $%.2f.\n", compensation());
        return str;
    }

    public double compensation()
    {
        return salary;
    }
}

class PartTime extends Employee
{
    private double hourlyRate; 
    private double hoursWorked;

    public PartTime(int id, double hourlyRate, double hoursWorked)
    {
        super(id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String toString()
    {
    String str;
    str = String.format(super.toString() + " is a part-time employee \n" + "with wages $%.2f\n", compensation());
    return str;
    }

    public double compensation()
    {
    return hourlyRate * hoursWorked;
    }
}
