package String;
import java.util.*;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "Hello g kya haal chal hai aapke";
        String s[] = str.split(" ");

        int start=0;
        int end = s.length - 1;

        while(start < end) {
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        str = String.join(" ",s);
        System.out.println(str);

        

    }
}
