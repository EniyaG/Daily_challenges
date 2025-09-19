import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 45, 6};
        List<Integer> l = Arrays.asList(arr);
        int max = Collections.max(l);
        l.remove(max);
        int secondMax = Collections.max(l);
        System.out.println("Second max is: " + secondMax);

    }}