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
        if (salary < 0)
        {
            throw new IllegalArgumentException();
        }
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);

        // Check if salary is negative, if so throw illegalargument exception
    }

    public String toString()
    {
        if (this.hireDate == null)
        {
            return super.toString() + "Office:\t" + this.office + "\nSalary:\t$" + this.salary + "\nDate Hired:\t" + null + "\n";

        }
        else
            return super.toString() + "Office:\t" + this.office + "\nSalary:\t$" + this.salary + "\nDate Hired:\t"
                    + this.hireDate.getMonthValue() + "/" + this.hireDate.getDayOfMonth() + "/" + this.hireDate.getYear()+  "\n";
    }

    //String shortFormatDate = this.hireDate.getMonthValue() + "/" + this.hireDate.getDayOfMonth() + "/" + this.hireDate.getYear();
    //        String result3 = super.toString() + "Office:\t" + this.office + "\nSalary:\t$" + this.salary + "\nDate Hired:\t" + formatDate + "\n";
}