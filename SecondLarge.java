import java.util.*;

public class SecondLarge {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));

        if (set.size() < 2) {
            System.out.println("No second largest element");
        } else {
            System.out.println("The second largest number is: " + set.lower(set.last())); 
            // lower() gives the element just smaller than last()
        }
    }
}