import java.util.*;

public class PrimeNumberInARange {
    static boolean isPrime(int num) {
        if(num <= 0 || num == 1)
            return false;

        for(int i = 2; i < num ;i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    static void printPrimebwRange(int start, int end) {
        for(int i = start; i <= end; i++) {
            boolean res = isPrime(i);
            if(res){
                System.out.print(i + " ");
            }
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start range: ");
        int start = sc.nextInt();

        System.out.println("Enter end range: ");
        int end = sc.nextInt();

        printPrimebwRange(start, end);

    }
}
// TIME COMPLEXITY - O(N^2) SPACE COMPLEXITY - O(1)
