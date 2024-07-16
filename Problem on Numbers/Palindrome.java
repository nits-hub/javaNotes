// Approach-1 : Here we are using the straightforward mathematical logic to reverse the integer.
// public class IntegerPalindrome {
//     public static void main(String[] args) {
//         int n = 4554;
//         int num = n;
//         int rev = 0;

//         while(num != 0) {
//             int rem = num % 10;
//             rev = rev * 10 + rem;
//             System.out.println(rev);
//             num /= 10;
//         }
//         if(n == rev)
//             System.out.println("No. is Palindrome");
//         else
//             System.out.println("No. is not a Palindrome");
//     }
// }

// Approach-2 : 
// import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int n = 4554;
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        if(n == rev)
            System.out.println("Palindrome");
        else    
            System.out.println("Not a Palindrome");
    }
}