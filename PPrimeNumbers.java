import java.util.Scanner;
public class PPrimeNumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count=0;
        if(input<=1){
            System.out.println("not prime");
        }
        else{
        for(int i=2;i<=input;i++){
            if(input%i==0){
                count++;
                break;
               
            }
        }if(count==0){
            System.out.println("prime");
        }
        
            else{
                System.out.println("Not prime");
            }

        }

    }}