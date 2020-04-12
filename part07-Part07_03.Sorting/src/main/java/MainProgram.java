
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    
    public static int smallest(int[] array) {
        int least = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if (array[i] < least) {
                least = array[i];
            }
        }
        
        return least;
    }
    
    public static int indexOfSmallest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                return i;
            }
        }
        return 0;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int least = table[startIndex];
        
        for(int i = startIndex; i < table.length; i++) {
            if (table[i] < least) {
                least = table[i];
            }
        }
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == least) {
                return i;
            }
        }
        return 0;
        

    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
