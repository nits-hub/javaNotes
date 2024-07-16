// The Arrays class in Java is part of the "java.util" package and provides static methods for various operations on arrays, such as sorting, searching, comparing, and filling arrays.

// 1. Arrays.toString() - Converts the array to a string representation.
    // e.g., 
        // int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(numbers)); 
        
        // Output: [1, 2, 3, 4, 5]

// 2. Arrays.sort() - Sorts the array in ascending order.
    // e.g., 
        //  int[] numbers = {5, 3, 1, 4, 2};
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers)); 
        
        // Output: [1, 2, 3, 4, 5]

// 3. Arrays.binarySearch() - Performs a binary search on the sorted array.
    // e.g., 
        //  int[] numbers = {1, 2, 3, 4, 5};
        // int index = Arrays.binarySearch(numbers, 3);
        // System.out.println(index); 
        
        // Output: 2

// 4. Arrays.equals() - Checks if two arrays are equal.
    // e.g., 
        //  int[] numbers1 = {1, 2, 3};
        // int[] numbers2 = {1, 2, 3};
        // System.out.println(Arrays.equals(numbers1, numbers2)); 
        
        // Output: true

// 5. Arrays.fill() - Fills the array with the specified value.
    // e.g., 
        // int[] numbers = new int[5];
        // Arrays.fill(numbers, 10);
        // System.out.println(Arrays.toString(numbers)); 
        
        // Output: [10, 10, 10, 10, 10]

// 6. Arrays.copyOf() - Copies the specified array, truncating or padding with the default value if necessary.
// 7. Arrays.copyOfRange() - Copies the specified range of the array.

    // e.g., 6.
        // int[] numbers = {1, 2, 3};
        // int[] copy = Arrays.copyOf(numbers, 5);
        // System.out.println(Arrays.toString(copy)); 
        
        // Output: [1, 2, 3, 0, 0]
    
    // e.g., 7.
        // int[] numbers = {1, 2, 3, 4, 5};
        // int[] copy = Arrays.copyOfRange(numbers, 1, 4);
        // System.out.println(Arrays.toString(copy)); 
        
        // Output: [2, 3, 4]

// 8. Arrays.asList() - Converts the array to a List.
    // e.g., 
        //  String[] words = {"apple", "banana", "cherry"};
        // List<String> list = Arrays.asList(words);
        // System.out.println(list); 
        
        // Output: [apple, banana, cherry]

    