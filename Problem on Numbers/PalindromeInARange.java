
import java.util.*;

public class PalindromeInARange {

    static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if(str.equals(sb.toString()))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.print("Palindrome numbers from " + start + " to " + end  + " are: ");
        for(int i = start; i <= end; i++) {
            boolean res = isPalindrome(i);
            if(res)
                System.out.print(i + " ");
        }
    }
}