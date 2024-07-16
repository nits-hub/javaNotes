import java.util.*;

public class MaxAndMinInDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(num > 0){
            int rem = num % 10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
            num/=10;
        }  
        System.out.println("Max: "+ max + " Min: "+ min);
    }
}
