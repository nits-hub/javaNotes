package String.StringBuilder;

// There are three ways of creating string, they are - 
// 1. String (Immutable)
// 2. String Builder (Mutable)
// 3. String Buffer (Mutable and Thread safe)

// 2. String Builder class - The StringBuilder class is used to create mutable string. It means the string can be changed without creating new objects.

// Key Features of StringBuilder class - 
// 1. Mutability -  Unlike String, StringBuilder objects can be modified after they are created.
// 2. Efficiency - Performing operations like appending, inserting, or modifying strings is more efficient with StringBuilder compared to String because it doesn't create new objects with every modification.

// Syntax - 
// StringBuilder sb = new StringBuilder("Hello");

// Important methods of StringBuilder class - 
    // 1. append() - 
        // sb.append(" World");
        // System.out.println(sb.toString());

    // 2. insert() - 
        // sb.insert(6, "Beautiful ");
        // System.out.println(sb.toString());

    // 3. replace() - 
        // StringBuilder sb = new StringBuilder("Hello World");
        // sb.replace(6, 11, "Java");
        // System.out.println(sb.toString()); // Output: Hello Java
    
    // 4. delete() - 
        // StringBuilder sb = new StringBuilder("Hello World");
        // sb.delete(5, 11);
        // System.out.println(sb.toString()); // Output: Hello

    // 5. reverse() - 
        // sb.reverse()
    
    // 6. toString() - 
        // sb.toString();
    
    // 7. sb.length() 

    // 8. sb.setCharAt(6, 'J');

    // 9. sb.charAt(4);

    // 10. sb.subString(0,5);


public class StringBuilderClass {
    public static void main(String[] args) {
        
    }
}