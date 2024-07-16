package ArrayPractice;

public class Min_Max_Element {
    static int minElement(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i : arr ){
            if( i < min) 
                min = i;
        }
        return min;
    }

    static int maxElement (int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if( i > max)
                max = i;
        }
        return max;
    }

    static int[] min_max_Element(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int ele[] = {min, max};
        return ele;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,9,5,1,2,3};
        System.out.println("Min: " + minElement(arr));
        System.out.println("Max: " + maxElement(arr));

        int []res = min_max_Element(arr);
        System.out.println("Min: "+ res[0] + " " + "Max: " + res[1]);
    }
}
