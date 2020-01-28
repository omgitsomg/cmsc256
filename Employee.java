package cmsc256;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Employee extends Person
{
    private String phoneNumber;
    private String email;
    private Name name1;
    private Address address1;
    private String office;
    private int salary;
    private LocalDate hireDate;

    public Employee ()
    {
        this.phoneNumber = "None given";
        this.email = "None given";
        this.office = "Unassigned";
        this.salary = 0;
        this.hireDate = null;
    }

    public Employee (String first, String middle, String last, Address homeAddress, String phoneNumber,
                     String email, String office, int salary, int month, int day, int year)
    {
        super(first, middle, last, homeAddress, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String toString()
    {
        String result3 = super.toString() + "Office:\t" + this.office + "\nSalary:\t$" + this.salary + "\nDate Hired:\t" + this.hireDate + "\n";
        return result3;
    }
}
