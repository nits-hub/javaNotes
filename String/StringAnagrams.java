package String;
import java.util.*;

public class StringAnagrams {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        str1 = new String(ch1);
        str2 = new String(ch2);

        System.out.println(str1);
        System.out.println(str2);
    }


}
