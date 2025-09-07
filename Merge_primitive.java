
import java.util.Arrays;

class Merge_primitive{
    public static void main(String[ ]args){
        int a[]={1,2,3,4,5,10,9,8,7,6};
        System.out.println("the array elements:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("the sorted elements are:"+Arrays.toString(a));


    }
}