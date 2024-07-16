package TypeConversionInJava;

// Type Conversion - In Java, type conversion  refers to changing a variable from one data type to another. 
// There are two types of type conversion in Java:

// 1. Implicit type conversion (Automatic Type Conversion or Widening Conversion) (TYPE CONVERSION): - 
    // In java, this type of conversion is automatic in which the smaller type is converted in to larger data type withoud explicit conversion.
    // e.g., byte -> short -> char -> int -> long -> float -> double

// 2. Explicit type conversion (Casting or Narrowing Conversion) (TYPE CASTING) - 
    // In java, Explicit conversion refers to manual conversion of larger data type into smaller type using cast operator, 
    // It may result in data loss or precision loss, and requires careful handling.
    // e.g., double -> float -> long -> int -> char -> short -> byte
    // Examples include converting a double to an int, a long to a short, etc.
    // e.g., 
        // double d = 9.78;
        // int e = (int) d; // explicit conversion from double to int


// Some common type parsing methods are as follows: 
// Type parsing involves converting a string to primitive data types.
// 1. String to Integer/Float/Double/Boolean/Long/Short/Byte/Character - 
    // e.g., 
        // String str = "123.30";
        // int inum = Integer.parseInt(str);
        // float fnum = Float.parseFloat(str);
        // Double dnum = Double.parseDouble(str);
        
    // String to boolean conversion
        // String res = "true";
        // Boolean bres = Boolean.parseBoolean(res);

    // string to character conversion
        // String str = "A";
        // char ch = str.charAt(0);

    // 2. other types to String conversion i.e., Integer/Float/Double/Boolean/Long/Short/Byte/Character
        // e.g., 
            // int number = 123;
            // String str = Integer.toString(number);

            // float num = 12.3;
            // String str = Float.toString(num);

            // char ch  = 'A';
            // String str = Character.toString(ch);


public class TypeConversionInJava {
    
}
