import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();

        if(num < 0 || num == 1){
            System.out.println("Not a prime number: ");
            return;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("Not a prime number");
                break;
            }
        }
        System.out.println(num + " is a Prime number");
    }
}
