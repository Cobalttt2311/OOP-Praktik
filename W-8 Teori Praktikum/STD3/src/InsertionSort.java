public class InsertionSort {
    
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;

            // Mengubah tanda perbandingan untuk mengurutkan menurun
            while (position > 0 && list[position - 1].compareTo(key) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
    // Metode main untuk menjalankan program
  
