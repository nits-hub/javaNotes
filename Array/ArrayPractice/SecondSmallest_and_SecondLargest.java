package ArrayPractice;

public class SecondSmallest_and_SecondLargest {

     static int findSecondMin(int arr[]) {
        if( arr.length < 2)
            return -1;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for( int i : arr ) {
            if( i < min) {
                secondMin = min;
                min = i;
            }
            else if( (i < secondMin) && i != min) {
                secondMin = i;
            }
        }
        return secondMin;
     }

     static int findSecondMax(int arr[]) {
        if( arr.length < 2)
            return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i : arr) {
            if(i > max) {
                secondMax = max;
                max = i;
            }
            else if((i > secondMax) && (i != max)) {
                secondMax = i;
            }
        }
        return secondMax;
     }

    public static void main(String[] args) {
        int a[] = {1,2,4,7,7,5};
        int secondMin = findSecondMin(a);
        int secondMax = findSecondMax(a);

        System.out.println("Second Min Element: " + secondMin);
        System.out.println("Second Max Element: " + secondMax);

    }
}

// This solution is the optimal approach where 