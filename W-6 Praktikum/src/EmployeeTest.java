import com.polban.jtk.employee.*;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Call the shell_sort method from Sortable
        Sortable.shell_sort(staff);

        // Print sorted employees
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
