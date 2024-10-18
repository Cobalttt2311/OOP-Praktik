import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the number of integers:");
            int numItems = scan.nextInt();

            Integer[] numbers = new Integer[numItems];
            System.out.println("Enter the numbers:");

            for (int i = 0; i < numItems; i++) {
                numbers[i] = scan.nextInt();
            }

            Sorting.selectionSort(numbers);

            System.out.println("Sorted numbers:");
            for (int number : numbers) {
                System.out.println(number);
            }
        } finally {
            scan.close(); // Tutup Scanner untuk mencegah kebocoran sumber daya
        }
    }
}
