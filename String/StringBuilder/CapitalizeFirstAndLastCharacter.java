package String.StringBuilder;
import java.util.*;

public class CapitalizeFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to capitalize the first and last character of each word in a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();

        // handling the character present at first index
        if(sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z'){
            char ch = (char) ((int)sb.charAt(0) - 32);
            sb.setCharAt(0,ch);
        }
        
        // handling the character present at last index
        if(sb.charAt(n-1) >= 'a' && sb.charAt(n-1) <= 'z'){
            char ch = (char) ((int)sb.charAt(n-1) - 32);
            sb.setCharAt(n-1,ch);
        }

        for(int i = 1; i < n-1; i++){
            if(sb.charAt(i) == ' '){
                if(sb.charAt(i-1) >= 'a' && sb.charAt(i-1) <= 'z') {
                    char ch = (char) ((int)sb.charAt(i-1) - 32);
                    sb.setCharAt(i-1,ch);
                }

                if(sb.charAt(i+1) >= 'a' && sb.charAt(i+1) <= 'z') {
                    char ch = (char) ((int)sb.charAt(i+1) - 32);
                    sb.setCharAt(i+1,ch);
                }
            }
        }

        System.out.println(sb.toString());
    }
}