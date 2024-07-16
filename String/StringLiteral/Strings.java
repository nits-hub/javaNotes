package String.StringLiteral;

// String - In java, a string is a object which represents a sequence of characters. Strings are immutable, which means that once a String object is created, it cannot be changed. Any modification to a String creates a new String object.

// There are three ways of creating string, they are - 
// 1. String (Immutable)
// 2. String Builder (Mutable)
// 3. String Buffer (Mutable and Thread safe)

// There are multiple ways to create string in java: 
// 1. Using String Literals - 
    // String str1 = "Hello, World!";

// 2. Using the 'new' keyword
    // String str2 = new String("Hello, World!");
    
// Common String Methods
// 1. Length of a String -   str.length();

// 2. Concatenation - str1.concat(str2);
// 2b. str1 = "Hello"; str2 = "World"; str3 = str1 + " " + str2;
// 2c. str1.concat(", ").concat(str2).concat("!");

// 3. String str = "Hello, World!";
//String subStr1 = str.substring(7); // "World!"
//String subStr2 = str.substring(0, 5); // "Hello"

// 4. Character at specified index
// String str = "Hello, World!";
// char ch = str.charAt(1); //'e'

// 5.index of a character or substring
// String str = "Hello, World!";
// int index1 = str.indexOf('o'); // 4
// int index2 = str.indexOf("World"); // 7
// int index3 = str.lastIndexOf('o'); // 8

// 6. String comparison - 
// String str1 = "Hello";
// String str2 = "hello";
// boolean isEqual1 = str1.equals(str2); // false
// boolean isEqual2 = str1.equalsIgnoreCase(str2); // true
// int compare = str1.compareTo(str2); // negative value because "Hello" < "hello"

// 7. changin case
// String str = "Hello, World!";
// String upper = str.toUpperCase(); // "HELLO, WORLD!"
// String lower = str.toLowerCase(); // "hello, world!"

// 8. Trimming whitespace
// String str = "   Hello, World!   ";
// String trimmed = str.trim(); // "Hello, World!"

// 9. Replacing characters or substrings
// String str = "Hello, World!";
// String replaced1 = str.replace('o', 'a'); // "Hella, Warld!"
// String replaced2 = str.replace("World", "Java"); // "Hello, Java!"


public class Strings {
    
}
