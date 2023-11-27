import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class q {

    public static String duplicate(String s){
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Traverse the input string and add characters to the set
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        // Construct the result string from the set
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();

        
    }
    public static void main(String[] args) {
         System.out.println(duplicate("Happynewyear"));
    }
}
