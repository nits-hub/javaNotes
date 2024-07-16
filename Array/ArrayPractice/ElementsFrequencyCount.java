package ArrayPractice;
import java.util.*;

// Approach-1: Use two loops and keep track of the elements to count the frequency
// TIME COMPLEXITY - O(N*N) and SPACE COMPLEXITY - O(1)
// public class ElementsFrequencyCount {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,1,2,2,8};

//         for(int i = 0; i < arr.length; i++) {
//             int count = 1;
//             if(arr[i] == 0)
//                 continue;

//             for(int j = i + 1; j < arr.length; j++) {
//                 if(arr[i] == arr[j]) { 
//                     count++;
//                     arr[j] = 0;
//                 }
//             }
//             System.out.println(arr[i] + " present " + count + " times" );
//         }
//     }
// }

// Approach-2: Usage of HashMap<Integer, Integer>
// TIME COMPLEXITY - O(N) and SPACE COMPLEXITY - O(N)
public class ElementsFrequencyCount {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            if(map.containsKey(i)) {
                int value = map.get(i) + 1;
                map.put(i, value);
            }
            else {
                map.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " present " + entry.getValue() + " times" );
        }
    }
}
