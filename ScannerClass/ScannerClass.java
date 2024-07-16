package ScannerClass;
import java.util.*;


public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name, age, salary and bio: ");

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());
        String bio = sc.nextLine();

        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
        System.out.println("bio: "+bio);

    }    
}


// Note: In our program if we only want to take integer as input then we use: sc.nextInt(). 
    //   If we only want to take String as input then we use: sc.nextLine(); or sc.next().
    //   But if we want to use both the String and the integer in our program then there's a drawback with the scanner class which cannot let us use     directly  -  so there's a hack to use them together i.e., we have to parse the data from sc.nextLine() to whatever we want.
    // int age = Integer.parseInt(sc.nextLine);
    // String name = sc.nextLine();



