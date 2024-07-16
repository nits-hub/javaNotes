package STACK_DataStructure;
import java.util.*;
// import java.lang.*;

// Stack - Stack is a type of linear data structure. It allows for the storage and retrieval of elements in the LIFO manner.

public class StackImplementation {
    public static void main(String []args) {
        int []arr = {1,2,3,4,5};
        
        // stack declaration
        Stack<Integer> stack = new Stack<>();

        // loop to store element in lifo manner
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        System.out.println(stack);

        // peek() returns the top element
        int top = stack.peek();
        System.out.println("top/peek element"+ top);

        // pop() removes the element available at top
        int popped1 = stack.pop();
        System.out.println("Popped element: "+ popped1);

        // isEmpty() is used to check the whether the stack is empty or not
        if(stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");

        // search() Returns the position from the top of the stack where the object is located, or -1 if the object is not found.
        int position = stack.search(3);
        System.out.println("position: "+ position);
        System.out.println(stack);
    }
}

// public class StackImplementation {
//         public static void main(String[] args) {
//             String str = "Hello g kya haal chal hai aapke";
    
//             Stack<String> stack = new Stack<>();
//             String words[] = str.split(" ");
    
//             for(String word : words) {
//                 stack.push(word);
//             }
//             System.out.println(stack);
    
//         }
// }