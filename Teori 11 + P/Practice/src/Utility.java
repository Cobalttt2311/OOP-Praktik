import java.util.Collection;

class Utility {
    public static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}