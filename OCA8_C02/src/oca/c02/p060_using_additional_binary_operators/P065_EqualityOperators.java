/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p060_using_additional_binary_operators;

import java.io.*;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P065_EqualityOperators {
    public static void main(String[] args) {
        String message;
/**
Determining equality in Java can be a nontrivial endeavor as there’s a semantic difference
between “two objects are the same” and “two objects are equivalent.” It is further complicated
by the fact that for numeric and boolean primitives, there is no such distinction.
Let’s start with the basics, the equals operator == and not equals operator !=. Like the
relational operators, they compare two operands and return a boolean value about whether
the expressions or values are equal, or not equal, respectively.

The equality operators are used in one of three scenarios:

1. Comparing two numeric primitive types. If the numeric values are of different data
types, the values are automatically promoted as previously described. For example,
5 == 5.00 returns true since the left side is promoted to a double.
2. Comparing two boolean values.
3. Comparing two objects, including null and String values.

The comparisons for equality are limited to these three cases, so you cannot mix and
match types. For example, each of the following would result in a compiler error:

boolean x = true == 3; // DOES NOT COMPILE
boolean y = false != "Giraffe"; // DOES NOT COMPILE
boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
 */
        {
            message = "---- EQUALITY OPERATORS - INVALID ----";
            System.out.printf("%n %50s%n", message);
            
//            boolean x = true == 3; // DOES NOT COMPILE - INCOMPARABLE TYPES
            System.out.printf("%n boolean x = true == 3; // DOES NOT COMPILE - INCOMPARABLE TYPES %n");
//            boolean y = false ! "Giraffe"; // DOES NOT COMPILE - INCOMPARABLE TYPES
            System.out.printf(" boolean y = false != \"Giraffe\"; // DOES NOT COMPILE - INCOMPARABLE TYPES %n");
//            boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE - INCOMPARABLE TYPES
            System.out.printf(" boolean z = 3 == \"Kangaroo\"; // DOES NOT COMPILE - INCOMPARABLE TYPES %n");
        }
/**
Pay close attention to the data types when you see an equality operator on the exam.
The exam creators also have a habit of mixing assignment operators and equality operators,
as in the following snippet:

boolean y = false;
boolean x = (y = true);
System.out.println(x); // Outputs true

At first glance, you might think the output should be false, and if the expression was
(y == true), then you would be correct. In this example, though, the expression is assigning
the value of true to y, and as you saw in the section on assignment operators, the
assignment itself has the value of the assignment. Therefore, the output would be true.
 */
        {
            message = "---- EQUALITY OPERATORS - MIXING ASSIGNMENT OPERATORS ----";
            System.out.printf("%n %50s%n", message);
            
            boolean y = false;
            boolean x = (y = true);
            System.out.printf("%n x = %b%n", x); // Outputs true
        }
/**
For object comparison, the equality operator is applied to the references to the objects,
not the objects they point to. Two references are equal if and only if they point to the same
object, or both point to null. Let’s take a look at some examples:

File x = new File("myFile.txt");
File y = new File("myFile.txt");
File z = x;
System.out.println(x == y); // Outputs false
System.out.println(x == z); // Outputs true

Even though all of the variables point to the same file information, only two, x and z,
are equal in terms of ==. In this example, as well as during the OCA exam, you may be presented
with classnames that are unfamiliar, such as File. Many times you can answer questions
about these classes without knowing the specific details of these classes. In particular,
you should be able to answer questions that indicate x and y are two separate and distinct
objects, even if you do not know the data types of these objects.
In Chapter 3, “Core Java APIs,” we'll continue the discussion of object equality by introducing
what it means for two different objects to be equivalent. We'll also cover String
equality and show how this can be a nontrivial topic.
 */
        {
            message = "---- EQUALITY OPERATORS - OBJECTS COMPARISON ----";
            System.out.printf("%n %50s%n", message);
            
            File x = new File("myFile.txt");
            File y = new File("myFile.txt");
            File z = x;
            System.out.printf("%n (x == y) = %b%n", (x == y));
            System.out.printf(" (x == z) = %b%n", (x == z));
        }
    }

}
