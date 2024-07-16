// Array - 
// Normally an array is a collection of similar type of elements, and these array elements are stored in a contiguous memory location.

// In java, an array is an object which contains elements of similar data type.The elements of an array are stored in a contiguous memory location.
// Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.

// Advantage
// 1. Random access of any element in the array.

// Disadvantage
// 2. Fixed size - the size of the array is fixed. It doesn't grow or shrink its size at runtime.
// Note - To solve this problem, collection framework is used in Java which grows automatically.

// Types of array - There are two types of array
// 1. Single dimensional array
// 2. Multidimensional array

// 1. Single dimensional array -  
        // Syntax to Declare an Array in Java
            // dataType []arr; 
                // (or)
            // dataType arr[];  

        // Instantiation of an Array in Java
            // int a[] = new int[5]; 

        //declaration, instantiation and initialization  
            // int a[] = {33,3,4,5}; 


    // LOOPS in Array - We can traverse the following array using - 
        // int a[] = {1,2,3,4,5};

        //1. for loop
            // e.g., 
                // for (int i=0;i<a.length;i++){
                //     System.out.println(a[i]);
                // }

        //2. for-each loop
            // e.g.,
                // for (int i : a){
                //     System.out.println(i);
                // }


    // Note - 
    // 1. We can also pass an array to a method to perform some specific calculation inside the method
        // e.g., 
            // main() {
            //     int a[] = {1,2,3,4,5};
            //     minElement(a);
            // }
            // class Test {
            //     static void minElement(int arr[]){
            //         int min = 0;
            //         // logic for finding min element in the array...
            //     }   
            // }

    // 2. We can also return an array from the method

    // 3. ArrayIndexOutOfBoundsException - 
        // JVM throws an ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the array size while traversing the array.


// 2. Multidimensional array - In such case, data is stored in row and column based index (also known as matrix form).
    // Syntax - 
        // int[][] arr=new int[3][3];//3 row and 3 column  

    




            