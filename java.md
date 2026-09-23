## 1. ***PROGRAM EXECUTION***    User Code => Compiler => Byte code => JVM =>machine understandable format and jvm runs it on your machine.
  -compiler and jvm are **translation layers**
  - **byte code** is not understandable by machine and human but can run easily on window mac linux etc because it is **Platform independent**.


## 2. **JDK**
            (installed to tun java files) = { **JRE**(java runtime environment) = **JVM**(Java virtual machine) libraries}
      

## 3. ***Return type*** - If a function returning-string - return type *string*
                                             -integer - return type *integer*
                                             -char    - return type  *char*
                (like just prints name )     -nothing  - return type *void*

## 4. **IN println - ln is like /n**


## 5. ***NAME**    ### Java Variable Naming Rules
               (1) **Case Sensitive** — `age` and `AGE` are different.
               (2) **Starting Character** — Can start with `a–z`, `A–Z`, `_`, `$`.
               (3) **Subsequent Characters** — Can contain `0–9`, `a–z`, `A–Z`, `_`, `$`.
               (4) **No Reserved Keywords** — Cannot use keywords like `class`, `static`, etc.
               (5) **Length** — No fixed limit, but names should be meaningful.
               (6) **Naming Conventions** — Use `camelCase` for variables and `UPPER_CASE` for constants.
               

               (7) **Reserved keywords** -cannot used as names or anything in java :
    
             | 1           | 2            | 3              |
         | ----------- | ------------ | -------------- |
         | `abstract`  | `assert`     | `boolean`      |
         | `break`     | `byte`       | `case`         |
         | `catch`     | `char`       | `class`        |
         | `const`     | `continue`   | `default`      |
         | `do`        | `double`     | `else`         |
         | `enum`      | `extends`    | `final`        |
         | `finally`   | `float`      | `for`          |
         | `goto`      | `if`         | `implements`   |
         | `import`    | `instanceof` | `int`          |
         | `interface` | `long`       | `native`       |
         | `new`       | `package`    | `private`      |
         | `protected` | `public`     | `return`       |
         | `short`     | `static`     | `strictfp`     |
         | `super`     | `switch`     | `synchronized` |
         | `this`      | `throw`      | `throws`       |
         | `transient` | `try`        | `void`         |
         | `volatile`  | `while`      |                |
         
## 6. **Data types**
         

         | Data Type | Variable Example              |
         | --------- | ----------------------------- |
         | `byte`    | `byte age = 20;`              |
         | `short`   | `short marks = 500;`          |
         | `int`     | `int salary = 50000;`         |
         | `long`    | `long population = 1000000L;` |
         | `float`   | `float price = 99.5f;`        |
         | `double`  | `double pi = 3.14159;`        |
         | `char`    | `char grade = 'A';`           |
         | `boolean` | `boolean isPassed = true;`    |
         | `String`  | `String name = "Arman";`      |
         

## 7.**OPERATORS**
                       ### Java Operators

| Operator     | Name                 | Work                        | Example                 |                        |    |   |    |
| ------------ | -------------------- | --------------------------- | ----------------------- | ---------------------- | -- | - | -- |
| `+`          | Addition             | Adds values                 | `5 + 3 = 8`             |                        |    |   |    |
| `-`          | Subtraction          | Subtracts values            | `5 - 3 = 2`             |                        |    |   |    |
| `*`          | Multiplication       | Multiplies values           | `5 * 3 = 15`            |                        |    |   |    |
| `/`          | Division             | Divides values              | `6 / 3 = 2`             |                        |    |   |    |
| `%`          | Modulus              | Gives remainder             | `5 % 2 = 1`             |                        |    |   |    |
| `++`         | Increment            | Increases by 1              | `x++`                   |                        |    |   |    |
| `--`         | Decrement            | Decreases by 1              | `x--`                   |                        |    |   |    |
| `=`          | Assignment           | Assigns a value             | `x = 10`                |                        |    |   |    |
| `+=`         | Add Assignment       | Adds and assigns            | `x += 5`                |                        |    |   |    |
| `-=`         | Subtract Assignment  | Subtracts and assigns       | `x -= 5`                |                        |    |   |    |
| `*=`         | Multiply Assignment  | Multiplies and assigns      | `x *= 5`                |                        |    |   |    |
| `/=`         | Divide Assignment    | Divides and assigns         | `x /= 5`                |                        |    |   |    |
| `%=`         | Modulus Assignment   | Remainder and assigns       | `x %= 5`                |                        |    |   |    |
| `==`         | Equal to             | Checks equality             | `5 == 5`                |                        |    |   |    |
| `!=`         | Not Equal            | Checks inequality           | `5 != 3`                |                        |    |   |    |
| `>`          | Greater Than         | Checks greater value        | `5 > 3`                 |                        |    |   |    |
| `<`          | Less Than            | Checks smaller value        | `3 < 5`                 |                        |    |   |    |
| `>=`         | Greater or Equal     | Checks greater/equal        | `5 >= 5`                |                        |    |   |    |
| `<=`         | Less or Equal        | Checks less/equal           | `3 <= 5`                |                        |    |   |    |
| `&&`         | Logical AND          | True if both are true       | `a && b`                |                        |    |   |    |
| ||           | Logical OR           | True if either is true      | `a |   | b` |
| `!`          | Logical NOT          | Reverses true/false         | `!true`                 |                        |    |   |    |
| `&`          | Bitwise AND          | ANDs individual bits        | `5 & 3`                 |                        |    |   |    |
| |            | Bitwise OR           | ORs individual bits         | `5 \| 3`               |    |   |    |
| `^`          | Bitwise XOR          | XORs individual bits        | `5 ^ 3`                 |                        |    |   |    |
| `~`          | Bitwise NOT          | Inverts all bits            | `~5`                    |                        |    |   |    |
| `<<`         | Left Shift           | Shifts bits left            | `5 << 1`                |                        |    |   |    |
| `>>`         | Right Shift          | Shifts bits right           | `5 >> 1`                |                        |    |   |    |
| `>>>`        | Unsigned Right Shift | Shifts right with zero fill | `5 >>> 1`               |                        |    |   |    |
| `?:`         | Ternary              | Short form of `if-else`     | `x > 5 ? 1 : 0`         |                        |    |   |    |
| `instanceof` | Type Check           | Checks object type          | `obj instanceof String` |                        |    |   |    |

  



## 8 Conditionals in Java

| Conditional    | Syntax                                                        .                                                                                                                              
| -------------- | -------------------------------------------------------------
| **if**         | `if (condition) { }`                                          
| **if-else**    | `if (condition) { } else { }`                                 
| **if-else-if** | `if (condition) { } else if (condition) { } else { }`         
| **Nested if**  | `if (condition) { if (condition) { } }`                       
| **switch**     | `switch (expression) { case value: ... break; default: ... }` 
| **Ternary**    | `condition ? value1 : value2`                                 |
### Common conditions

| Operator | Meaning               | Example           |            |        |   |         |
| -------- | --------------------- | ----------------- | ---------- | ------ | - | ------- |
| `==`     | Equal to              | `a == b`          == means
| `!=`     | Not equal             | `a != b`          |            |        |   |         |
| `>`      | Greater than          | `a > b`           |            |        |   |         |
| `<`      | Less than             | `a < b`           |            |        |   |         |
| `>=`     | Greater than or equal | `a >= b`          |            |        |   |         |
| `<=`     | Less than or equal    | `a <= b`          |            |        |   |         |
| `&&`     | Logical AND           | `a > 5 && b < 10` |            |        |   |         |
| `        |                       | `                 | Logical OR | `a > 5 |   | b < 10` |
| `!`      | Logical NOT           | `!(a > 5)`        |            |        |   |         |


== ->>    Primitive types (int, double, char, boolean)	Compares values
Objects (String, arrays, classes)	Compares references (whether they refer to the same object)
//String a = new String("Hello");
String b = new String("Hello");

a == b          // false (different objects)
a.equals(b)     // true  (same content)




9. ## Methods 


      returnType methodName(parameters) {
    // code
}     //Syntax 

                4 main types
                
                a. No parameter + no return
                
                static void greet() {
                    System.out.println("Hello");
                }
                
                b. Parameter + no return
                
                static void greet(String name) {
                    System.out.println("Hello " + name);
                }
                
                c. No parameter + return 
                
                static int getNumber() {
                    return 10;
                }
                
                d. Parameter + return
                
                static int add(int a, int b) {
                    return a + b;
                }
                Important
                void → returns nothing
                return → sends a value back
                Parameters → input given to the method
                Method call → executes the method
                int result = add(5, 3);
                System.out.println(result);


## 10. Arrays and objects and other dynamic data like new student[] are stored in heap in java according to jvm 
       arrays are not continous in java. otherwise arrays are defined as continous data stored.