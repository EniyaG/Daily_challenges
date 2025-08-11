public class DuplicateCharacters {
    public static void main(String[] args) {
        String s="Programming";
        System.out.println("Unique characters in the string: " + s);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)== s.charAt(j)){
                    System.out.println("unique characters:" + s.charAt(i));
                    break; // Exit the inner loop once a duplicate is found
                }
            }
        }
        

        }

        }
        
    

