public class Palindrome {

    public static void main(String[] args) {
        String s="madam";
        String reverse=new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            System.out.println("String is palindrome: " + reverse);
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
