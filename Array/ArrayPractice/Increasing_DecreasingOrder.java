package ArrayPractice;
import java.util.*;

public class Increasing_DecreasingOrder {
    public static void main(String[] args) {
        int arr[] = {8,7,1,6,5,9};
        System.out.println("Array before sorting: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        
        int n = arr.length;
        int start = (n/2)+1;
        int end = n-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Array after sorting in increasing-decreasing order: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
// TIME COMPLEXITY - O(N) and SPACE COMPLEXITY - O(1);