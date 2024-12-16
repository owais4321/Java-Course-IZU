# Java Course - Code Section

Welcome to the Code section of the Java course! This section contains example Java programs to help you understand and practice the fundamental concepts of Java programming.

# Class 1

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

# Class 2
# Java Course - Operators in Java

This section introduces different types of operators in Java. Operators are special symbols that perform operations on variables and values. Java operators are essential for manipulating data and creating complex expressions.

---

## Types of Operators

### 1. Arithmetic Operators

Arithmetic operators perform basic mathematical operations on numeric values.

| Operator | Description       | Example               |
|----------|-------------------|-----------------------|
| `+`      | Addition          | `a + b`              |
| `-`      | Subtraction       | `a - b`              |
| `*`      | Multiplication    | `a * b`              |
| `/`      | Division          | `a / b`              |
| `%`      | Modulus (remainder) | `a % b`          |

**Example**:
```java
int a = 10;
int b = 3;
System.out.println("Addition: " + (a + b));      // Output: 13
System.out.println("Subtraction: " + (a - b));   // Output: 7
System.out.println("Multiplication: " + (a * b)); // Output: 30
System.out.println("Division: " + (a / b));      // Output: 3
System.out.println("Modulus: " + (a % b));       // Output: 1
```
**Task**:  
- Declare two integer variables, `a = 10` and `b = 3`.
- Perform the following operations and print the results:
  - Addition: `a + b`
  - Subtraction: `a - b`
  - Multiplication: `a * b`
  - Division: `a / b`
  - Modulus: `a % b`


### 2. Assignment Operators
Assignment operators assign values to variables. The most common assignment operator is =.

| Operator | Description              | Example     |
|----------|--------------------------|-------------|
| `=`      | Simple assignment        | `a = 10`    |
| `+=`     | Addition assignment      | `a += 5`    |
| `-=`     | Subtraction assignment   | `a -= 2`    |
| `*=`     | Multiplication assignment | `a *= 3`    |
| `/=`     | Division assignment      | `a /= 4`    |
| `%=`     | Modulus assignment       | `a %= 3`    |


**Example:**
```java

int a = 10;
a += 5;  // a = a + 5, so a is now 15
System.out.println("After += : " + a); // Output: 15
a -= 3;  // a = a - 3, so a is now 12
System.out.println("After -= : " + a); // Output: 12

```
**Task**:  
- Declare a variable `x = 5`.
- Use the following assignment operators:
  - Add 3 to `x` using `+=`.
  - Subtract 2 from `x` using `-=`.
  - Multiply `x` by 2 using `*=`.
  - Divide `x` by 2 using `/=`.
  - Find the remainder of `x` when divided by 3 using `%=`.
- Print `x` after each operation.

**Task:** 
Calculate Total and Discounted Price

- Declare and Initialize Variables:
    - Declare a double variable named price and assign it a value of 200.0 (representing the original price of an item).
    - Declare an int variable named quantity and set it to 3 (representing the number of items bought).
    - Declare a double variable named discount and assign it a value of 0.1 (representing a 10% discount).
- Calculate Total Price:
    - Use arithmetic and assignment operators to calculate the total price by multiplying price by quantity. Store the result back in price using an assignment operator.
- Apply Discount:
    - Use an arithmetic operator to calculate a 10% discount on the price and then use the assignment operator to subtract this discount from price.
- Output the Final Price:
    - Print the final value of price, which should show the total amount after applying the discount.

# Class 3
### 3. Comparison Operators
Comparison operators are used to compare two values. The result is a boolean (true or false).

| Operator | Description                | Example     |
|----------|----------------------------|-------------|
| `==`     | Equal to                   | `a == b`    |
| `!=`     | Not equal to               | `a != b`    |
| `>`      | Greater than               | `a > b`     |
| `<`      | Less than                  | `a < b`     |
| `>=`     | Greater than or equal to   | `a >= b`    |
| `<=`     | Less than or equal to      | `a <= b`    |


**Example**
```java

int a = 10;
int b = 5;
System.out.println("a == b: " + (a == b)); // Output: false
System.out.println("a > b: " + (a > b));   // Output: true
```
**Task**:  
- Declare two variables, `a = 10` and `b = 5`.
- Use comparison operators to compare the values of `a` and `b` and print the results:
  - `a == b`
  - `a != b`
  - `a > b`
  - `a < b`
  - `a >= b`
  - `a <= b`


### 4. Logical Operators
Logical operators are used to combine multiple conditions.

| Operator | Description     | Example              |
|----------|-----------------|----------------------|
| `&&`     | Logical AND     | `(a > b) && (a > c)` |
| `||`     | Logical OR      | `(a > b) || (a > c)` |
| `!`      | Logical NOT     | `!(a > b)`           |

**Example**
```java

int a = 10;
int b = 5;
int c = 20;
System.out.println("Logical AND: " + ((a > b) && (a < c))); // Output: true
System.out.println("Logical OR: " + ((a > b) || (a > c)));  // Output: true
System.out.println("Logical NOT: " + !(a == b));            // Output: true
```
**Task**:  
- Declare three integer variables `a = 10`, `b = 5`, and `c = 15`.
- Perform the following logical operations and print the results:
  - Logical AND: `(a > b) && (a < c)`
  - Logical OR: `(a > b) || (a > c)`
  - Logical NOT: `!(a == b)`


### 5. Unary Operators
Unary operators operate on a single operand to perform operations like incrementing, decrementing, negating, or inverting a boolean value.

| Operator | Description              | Example        |
|----------|--------------------------|----------------|
| `+`      | Unary plus               | `+a`          |
| `-`      | Unary minus              | `-a`          |
| `++`     | Increment                | `++a` or `a++` |
| `--`     | Decrement                | `--a` or `a--` |
| `!`      | Logical complement (NOT) | `!a`          |

**Example**
```java
int a = 5;
System.out.println("Unary plus: " + (+a));  // Output: 5
System.out.println("Unary minus: " + (-a)); // Output: -5
System.out.println("Increment: " + (++a));  // Output: 6
System.out.println("Decrement: " + (--a));  // Output: 5
```
**Task**:  
- Declare an integer variable `a = 5`.
- Perform the following unary operations and print the results:
  - Unary plus: `+a`
  - Unary minus: `-a`
  - Increment: `++a` and `a++`
  - Decrement: `--a` and `a--`
  - Logical NOT: `!(a > 3)`

### 6. Ternary Operator
The ternary operator (? :) is a shorthand for if-else statements. It takes three operands and evaluates a boolean expression.

Syntax:

```java
variable = (condition) ? expression1 : expression2;
```
**Example:**
```java
int a = 10;
int b = 5;
int max = (a > b) ? a : b;
System.out.println("Maximum value: " + max); // Output: 10
```

### 7. Bitwise Operators
Bitwise operators perform operations on individual bits of integer values.

| Operator | Description           | Example     |
|----------|-----------------------|-------------|
| `&`      | Bitwise AND           | `a & b`     |
| `|`      | Bitwise OR            | `a | b`     |
| `^`      | Bitwise XOR           | `a ^ b`     |
| `~`      | Bitwise Complement    | `~a`        |
| `<<`     | Left Shift            | `a << 1`    |
| `>>`     | Right Shift           | `a >> 1`    |


**Example:**
```java

int a = 5;  // Binary: 0101
int b = 3;  // Binary: 0011
System.out.println("Bitwise AND: " + (a & b));  // Output: 1 (Binary: 0001)
System.out.println("Bitwise OR: " + (a | b));   // Output: 7 (Binary: 0111)
System.out.println("Bitwise XOR: " + (a ^ b));  // Output: 6 (Binary: 0110)
```

**Task**:  
- Declare two integer variables, `a = 5` (binary `0101`) and `b = 3` (binary `0011`).
- Perform the following bitwise operations and print the results:
  - Bitwise AND: `a & b`
  - Bitwise OR: `a | b`
  - Bitwise XOR: `a ^ b`
  - Bitwise Complement: `~a`
  - Left Shift: `a << 1`
  - Right Shift: `a >> 1`
 


# Class 11 Java OOP Elements with Examples and Tasks

## 1. **Class and Object**
### Definition
- **Class**: A blueprint for objects. Defines properties (fields) and behaviors (methods).
- **Object**: An instance of a class.

### Example
```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.drive();
    }
}
```

### Task
- Create a `Person` class with fields `name` and `age`.
- Add a method `introduce()` that prints a self-introduction.
- Create an object of the `Person` class and call `introduce()`.

---

## 2. **Inheritance**
### Definition
- Mechanism where a class (subclass) acquires properties and behaviors of another class (superclass).

### Example
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
```

### Task
- Create a superclass `Vehicle` with a method `move()`.
- Create a subclass `Bicycle` that inherits from `Vehicle` and adds a method `ringBell()`.
- Create an object of `Bicycle` and call both methods.

---

## 3. **Polymorphism**
### Definition
- Ability of a method or object to take multiple forms.
- Two types:
  - **Compile-time (Method Overloading)**
  - **Runtime (Method Overriding)**

### Example
#### Method Overloading
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5.5, 10.5));
    }
}
```

#### Method Overriding
```java
class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.sound();
    }
}
```

### Task
- Implement method overloading in a `Printer` class with `print(int)`, `print(String)`, and `print(double)`.
- Implement method overriding for a `Shape` superclass with a `draw()` method, and subclasses `Circle` and `Rectangle`.

---

## 4. **Encapsulation**
### Definition
- Bundling data and methods within a class, restricting direct access to some of its components.
- Achieved using private fields and public getter/setter methods.

### Example
```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
```

### Task
- Create a `Student` class with private fields `name` and `grade`.
- Provide public getter and setter methods for these fields.
- Ensure that `grade` cannot be set to a negative value.

---

## 5. **Abstraction**
### Definition
- Hiding implementation details and showing only essential features.
- Achieved using abstract classes or interfaces.

### Example
#### Abstract Class
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
```

#### Interface
```java
interface Animal {
    void eat();
}

class Cow implements Animal {
    public void eat() {
        System.out.println("Cow eats grass.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cow();
        animal.eat();
    }
}
```

### Task
- Create an abstract class `Appliance` with an abstract method `turnOn()`.
- Create a subclass `Fan` that implements the `turnOn()` method.
- Create an interface `Playable` with a method `play()` and a class `Piano` that implements it.

---

## 6. **Association, Aggregation, and Composition**
### Definitions
- **Association**: A general relationship between classes.
- **Aggregation**: A "has-a" relationship with independent lifecycles.
- **Composition**: A "has-a" relationship where the lifecycles are dependent.

### Example
#### Association
```java
class Driver {
    String name;
}

class Car {
    Driver driver;
}
```

#### Aggregation
```java
class Engine {
    void start() {
        System.out.println("Engine starts.");
    }
}

class Vehicle {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Vehicle is moving.");
    }
}
```

#### Composition
```java
class Library {
    private Book book;

    Library() {
        book = new Book();
    }
}

class Book {}
```

### Task
- Implement an example of aggregation using a `Team` and `Player` class.
- Implement an example of composition using a `House` and `Room` class.


# Class 14 Java File Handling with Examples and Tasks

## 1. **Introduction to File Handling**
### Definition
- File handling in Java allows you to read, write, and manipulate files.
- Common classes used:
  - `File`
  - `FileReader` and `BufferedReader`
  - `FileWriter` and `BufferedWriter`
  - `Scanner`
  - `PrintWriter`
  - `Files` (from `java.nio.file`)

---

## 2. **Creating and Checking a File**
### Example
```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Task
- Write a program to check if a file named `data.txt` exists. If not, create the file.

---

## 3. **Writing to a File**
### Example
```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, world!\nWelcome to file handling in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Task
- Write a program to write the numbers 1 to 10, each on a new line, into a file named `numbers.txt`.

---

## 4. **Reading from a File**
### Example
#### Using `FileReader`
```java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

#### Using `Scanner`
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
```

### Task
- Write a program to read all lines from the file `data.txt` and print them to the console.

---

## 5. **Appending to a File**
### Example
```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); // Enable append mode
            writer.write("\nThis line is appended.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Task
- Write a program to append the current date and time to a file named `log.txt`.

---

## 6. **Deleting a File**
### Example
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
```

### Task
- Write a program to delete a file named `temporary.txt` if it exists.

---

## 7. **Handling Binary Files**
### Example
#### Writing a Binary File
```java
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("binary.dat");
            output.write(new byte[]{65, 66, 67}); // Writing A, B, C
            output.close();
            System.out.println("Binary file written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

#### Reading a Binary File
```java
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("binary.dat");
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Task
- Write a program to write the bytes of the string `"Hello Binary"` into a file named `output.dat` and then read it back.

---

## 8. **File Copy**
### Example
```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("source.txt");
            FileOutputStream output = new FileOutputStream("destination.txt");

            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Task
- Write a program to copy the contents of a file named `input.txt` to another file named `output.txt`.

---

## 9. **Listing Files in a Directory**
### Example
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("./"); // Current directory
        String[] files = directory.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}
```

### Task
- Write a program to list all files in a directory named `documents`.

---

## 10. **Error Handling in File Operations**
### Example
```java
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileReader reader = new FileReader(file);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

### Task
- Write a program to handle exceptions when trying to open a non-existent file named `missing.txt`.
