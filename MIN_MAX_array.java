import java.util.*;
public class MIN_MAX_array {
    public static void main(String[] args) {
        Integer []arr={1,2,3,4,5,6};
        List<Integer> list=Arrays.asList(arr);
        int small=Collections.min(list);
        int large = Collections.max(list);
        System.out.println("small is : " +small);
        System.out.println("large is : "+large);



    }
    
}
