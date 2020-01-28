package cmsc256;

public class Student extends Person
{
    private int id;
    private String phoneNumber;
    private String email;
    private String level;
    private static int recordNumber;
    private Name name1;
    private Address address1;


    public Student ()
    {
        this.name1 = new Name();
        this.address1 = new Address();
        this.phoneNumber = "None given";
        this.email = "None given";
        this.level = "Freshman";
    }

    public Student (String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String newLevel)
    {
        super(first, middle, last, homeAddress, phoneNumber, email);
        isValidLevel(newLevel);
        this.level = newLevel;
    }

    public boolean isValidLevel(String level1)
    {
            if (level1.equals("Freshman") || level1.equals("Sophomore") || level1.equals("Junior") || level1.equals("Senior"))
            {
                return true;
            }
            else
                throw new IllegalArgumentException();

    }

    public String toString ()
    {
        String str = super.toString();
        return str + "Student Level:\t" + this.level + "\n";
    }

}
