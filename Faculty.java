package cmsc256;

import java.time.LocalDate;

public class Faculty extends Employee
{
    private String phoneNumber;
    private String email;
    private Name name1;
    private Address address1;
    private String office;
    private int salary;
    private LocalDate hireDate;
    private String rank;

    public Faculty ()
    {
        this.phoneNumber = "None given";
        this.email = "None given";
        this.office = "Unassigned";
        this.salary = 0;
        this.hireDate = null;
        this.rank = "Instructor";
    }

    public Faculty (String first, String middle, String last, Address homeAddress, String phoneNumber,
                    String email, String office, int salary, int month, int day, int year, String newRank)
    {
        super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
        isValidRank(newRank);
        this.rank = newRank;
    }

    public boolean isValidRank (String rank1)
    {

        if (rank1.equals("Adjunct") || rank1.equals("Instructor") || rank1.equals("Assistant Professor")
                || rank1.equals("Associate Professor") || rank1.equals("Professor"))
        {
            return true;
        }
        else
            throw new IllegalArgumentException();

    }

    public String toString ()
    {
        String result4 = super.toString() + "Rank:\t" + this.rank;
        return result4 + "\n";
    }
}
