package cmsc256;

import java.time.LocalDate;

public class Staff extends Employee
{
    private String phoneNumber;
    private String email;
    private Name name1;
    private Address address1;
    private String office;
    private int salary;
    private LocalDate hireDate;
    private String title;

    public Staff ()
    {
        this.phoneNumber = "None given";
        this.email = "None given";
        this.office = "Unassigned";
        this.salary = 0;
        this.hireDate = null;
        this.title = "None given";

    }

    public Staff (String first, String middle, String last, Address homeAddress, String phoneNumber,
                  String email, String office, int salary, int month, int day, int year, String newTitle)
    {
        super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
        this.title = newTitle;
    }

    public String toString ()
    {
        String result5 = super.toString() + "Title:\t" + this.title;
        return result5 + "\n";
    }
}