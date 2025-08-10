public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        str = str.toLowerCase(); 
        char[] chars = str.toCharArray();

        System.out.println("Duplicate characters:");

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] == '0') continue; 

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; // mark as counted
                }
            }
            if (count > 1) {
                System.out.println(chars[i] + " - " + count + " times");
            }
        }
    }
}
