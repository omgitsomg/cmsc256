package cmsc256;

public class Person
{
    private int id;
    private String phoneNumber;
    private String email;
    private static int recordNumber;
    private Name name1;
    private Address address1;

    public Person ()
    {
        this.name1 = new Name();
        this.address1 = new Address();
        this.phoneNumber = "None given";
        this.email = "None given";
        recordNumber++;
        id = recordNumber;
    }

    public Person (String first, String middle, String last, Address homeAddress, String phoneNumber, String email)
    {
        this.name1 = new Name(first, middle, last);
        this.address1 = homeAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        recordNumber++;
        id = recordNumber;
    }

    public String getName()
    {
        return this.name1.toString();
    }

    public String toString ()
    {
        String result1 = "";
        String name = getName();
        StringBuilder str = new StringBuilder(this.getClass().getSimpleName());
        str.append(":\n---------------------------------------\n" + name);
        str.append("\n---------------------------------------\n");
        str.append("Home Address: " + this.address1.toString() + "\n");
        str.append("Phone Number: " + this.phoneNumber + "\n");
        str.append("Email Address: " + this.email + "\n");
        str.append("ID: " + this.id + "\n");
        result1 = str.toString();

        return result1;
    }
}
