import java.util.*;

public class FiboancciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of Nth term: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");
        for(int i = 1; i <= n; i++){
            int res = a + b;
            System.out.print(res + " ");

            a = b;
            b = res;
        }
    }
}
