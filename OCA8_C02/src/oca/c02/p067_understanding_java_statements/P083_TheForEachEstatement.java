/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p067_understanding_java_statements;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P083_TheForEachEstatement {
    public static void main(String[] args) {
        String message;
/**
Starting with Java 5.0, Java developers have had a new type of enhanced for loop at their
disposal, one specifically designed for iterating over arrays and Collection objects. This
enhanced for loop, which for clarity we'll refer to as a for-each loop, is shown in Figure 2.8.

The for-each loop declaration is composed of an initialization section and an object to
be iterated over. The right-hand side of the for-each loop statement must be a built-in Java
array or an object whose class implements java.lang.Iterable, which includes most of
the Java Collections framework. The left-hand side of the for-each loop must include a
declaration for an instance of a variable, whose type matches the type of a member of the
array or collection in the right-hand side of the statement. On each iteration of the loop, the
named variable on the left-hand side of the statement is assigned a new value from the array
or collection on the right-hand side of the statement.

For the OCA exam, the only members of the Collections framework that
you need to be aware of are List and ArrayList. In this chapter, we'll
show how to iterate over List objects, and in Chapter 3 we'll go into detail
about how to create List objects and how they differ from traditional Java
arrays.
 
Let’s review some examples:

■ What will this code output?

final String[] names = new String[3];
names[0] = "Lisa";
names[1] = "Kevin";
names[2] = "Roger";
for(String name : names) {
    System.out.print(name + ", ");
}

This code will compile and print:
Lisa, Kevin, Roger,
 */
    }
}
