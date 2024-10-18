public class Weeklysales {
    //-----------------------------------------------------------------
    //  Creates an array of sales staff and sorts them.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        Salesperson[] staff = new Salesperson[10];

        staff[0] = new Salesperson("Jane", "Jones", 3000);
        staff[1] = new Salesperson("Daffy", "Duck", 4935);
        staff[2] = new Salesperson("James", "Jones", 3000);
        staff[3] = new Salesperson("Dick", "Walter", 2800);
        staff[4] = new Salesperson("Don", "Trump", 1570);
        staff[5] = new Salesperson("Jane", "Black", 3000);
        staff[6] = new Salesperson("Harry", "Hacker", 3000);
        staff[7] = new Salesperson("Sam", "Snake", 1800);
        staff[8] = new Salesperson("Madonna", "Maddox", 7000);
        staff[9] = new Salesperson("Tom", "Smith", 5000);

        Sorting.insertionSort(staff);

        System.out.println("\nRanking of Sales for the Week:\n");
        for (Salesperson person : staff) {
            System.out.println(person);
        }
    }
}
