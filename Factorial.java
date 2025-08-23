import java.util.Scanner;
import java.util.stream.IntStream;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long fact=IntStream.rangeClosed(1, n).reduce(1,(a,b)->a*b);
        System.out.println("factorial:"+fact);
    }}
    

