package ArrayPractice;
import java.util.*;

//Approach-1 - Maintain another array to store the elements in reverse order. 
// TIME COMPLEXITY - O(N) and SPACE COMPLEXITY - O(N)
// public class ReverseArray {
//     static int[] reverseArray(int a[],int n) {
//         int b[] = new int[n];

//         for(int i=0;i<n;i++) {
//             b[n-i-1] = a[i];
//         }
//         return b;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};

//         // reverse array method will take an array as argument and return the reversed array
//         int revArr[] = reverseArray(arr, arr.length);
//         for(int i: revArr) {
//             System.out.print(i + " ");
//         }
//     }
// }


//Approach-2 - This a two pointer approach and it will not take an extra array for reversing the array.
// TIME COMPLEXITY - O(N) and SPACE COMPLEXITY - O(1)
// public class ReverseArray {

//     static int[] reverseArray(int a[]) {
//         int start = 0;
//         int end = a.length-1;

//         while (start < end) {
//             int temp = a[start];
//             a[start] = a[end];
//             a[end] = temp;
//             start++;
//             end--;
//         }

//         return a;
//     }
//     public static void main(String args[]) {
//         int arr[] = {1,2,3,4,5,6};

//         int revArr[] = reverseArray(arr);
//         for(int i : revArr) {
//             System.out.print(i + " ");
//         }
//     }
// }


// Approach-3 - Collections.reverse() method is used to reverse the array
// TIME COMPLEXITY - O(n)  and SPACE COMPLEXITY - O(1)

public class ReverseArray {

    static void reverseArray(Integer arr[]) {
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
        
        // Print the array using Arrays.toString to display the contents
        System.out.println(Arrays.toString(arr));
     }
     public static void main(String[] args) {
        Integer arr[] = {5,4,3,2,1};
        reverseArray(arr);
     }
}