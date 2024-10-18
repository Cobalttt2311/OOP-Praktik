public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the sales person object with the given
    //  data.
    //-----------------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //-----------------------------------------------------------------
    //  Returns the sales person as a string.
    //-----------------------------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //-----------------------------------------------------------------
    //  Returns true if the sales people have the same name.
    //-----------------------------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    //-----------------------------------------------------------------
    //  Order is based on total sales with the name (last, then first)
    //  breaking a tie.
    //-----------------------------------------------------------------
    public int compareTo(Salesperson other) {
        if (this.totalSales < other.totalSales)
            return -1;
        else if (this.totalSales > other.totalSales)
            return 1;
        else {
            // If total sales are the same, compare by name
            int nameCompare = this.lastName.compareTo(other.lastName);
            if (nameCompare != 0)
                return nameCompare;
            else
                return this.firstName.compareTo(other.firstName);
        }
    }

    //-----------------------------------------------------------------
    //  Retrieves the first name of the sales person.
    //-----------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    //-----------------------------------------------------------------
    //  Retrieves the last name of the sales person.
    //-----------------------------------------------------------------
    public String getLastName() {
        return lastName;
    }

    //-----------------------------------------------------------------
    //  Retrieves the total sales of the sales person.
    //-----------------------------------------------------------------
    public int getSales() {
        return totalSales;
    }
}
