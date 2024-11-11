# Java Course - Code Section

Welcome to the Code section of the Java course! This section contains example Java programs to help you understand and practice the fundamental concepts of Java programming.

## What is Java?

Java is a powerful, object-oriented programming language known for its portability across platforms. Once written, a Java program can run on any system with a Java Virtual Machine (JVM), making it popular in web, mobile, and enterprise software development.

## Why Learn Java?

Java is widely used due to several advantages:

- **Object-Oriented**: Supports modular and reusable code.
- **Platform Independence**: Programs can run on any platform with a JVM.
- **Rich Library and API Support**: Java provides a vast set of libraries for various functionalities.
- **Strong Community**: Extensive support and resources are available.
- **Career Opportunities**: Java is in demand across various industries.

## Getting Started with Java

### Writing Your First Program: Hello, World!

Let's start with a simple "Hello, World!" program, which is often the first program written in any language to verify the setup and understand the syntax basics.

```java
// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

To run this program, you will need to have a Java Development Kit (JDK) installed on your computer. Once you have the JDK set up, you can compile and run the program using the following commands:

``` bash
javac HelloWorld.java

java HelloWorld
```

This will output Hello, World! to the console.

## Data Types and Variables

Java is a statically typed language, which means that variables must be declared with a specific data type. Some of the most common data types in Java include:
Primitive Data Types

### Integer Types:

byte: Stores 8-bit signed integers (-128 to 127)

short: Stores 16-bit signed integers (-32,768 to 32,767)

int: Stores 32-bit signed integers (-2,147,483,648 to 2,147,483,647)

long: Stores 64-bit signed integers (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)


### Floating-Point Types:

float: Stores 32-bit IEEE 754 floating-point 
numbers

double: Stores 64-bit IEEE 754 floating-point numbers


### Boolean Type:

boolean: Stores a logical value (true or false)


### Character Type:

char: Stores a single 16-bit Unicode character

Here's an example of declaring and using 

```java
class DataTypesExample {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        // Floating-point types
        float floatVar = 3.14159f;
        double doubleVar = 3.14159265358979;

        // Boolean type
        boolean booleanVar = true;

        // Character type
        char charVar = 'A';

        // Printing the values
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Boolean value: " + booleanVar);
        System.out.println("Char value: " + charVar);
    }
}


This will output:

``` bash
Byte value: 127
Short value: 32767
Int value: 2147483647
Long value: 9223372036854775807
Float value: 3.14159
Double value: 3.14159265358979
Boolean value: true
Char value: A
```

Understanding data types and variables is crucial for writing effective Java programs. In the next section, we'll dive deeper into control structures and basic programming concepts.

# Variable Swapping Task
## Task Description
Your task is to write a Java program that swaps the values of two integer variables.
Steps

Declare two integer variables, a and b, and initialize them with any values of your choice.
Print the initial values of a and b.
Implement the logic to swap the values of a and b.
Print the values of a and b after the swap.

### Requirements

Use a temporary variable to perform the swap.
Explain the logic of the variable swapping process in your code comments.
Ensure that the initial and final values of a and b are correctly displayed.

Example Output

``` bash
Before swapping:
a = 10
b = 20
```

``` bash
After swapping:
a = 20
b = 10
```
### Instructions for Students

- Create a new Java file in your preferred IDE or text editor.
- Declare the two integer variables a and b and initialize them with the values of your choice.
- Write the logic to swap the values of a and b using a temporary variable.
- Print the initial and final values of a and b to demonstrate the successful swap.
- Add comments to explain the swapping process.
- Save the file and run the program to see the output.

### Hints

- Remember to use the appropriate data type for the variables (in this case, int).
- The swapping logic involves the use of a temporary variable to store the original value of one of the variables.
- The final values of a and b should be the opposite of their initial values.
