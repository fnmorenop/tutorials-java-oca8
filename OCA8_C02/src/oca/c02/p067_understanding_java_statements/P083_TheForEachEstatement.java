/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p067_understanding_java_statements;

import java.time.*;
import java.util.*;

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
        {
            message = "---- FOR-EACH STATEMENT - ARRAYS ----";
            System.out.printf("%n %50s%n", message);
            
            final String[] names = new String[3];
            names[0] = "Lisa";
            names[1] = "Kevin";
            names[2] = "Roger";
            for (String name : names) {
                System.out.printf(" name = %s%n", name);
            }
        }
/**
What will this code output?

java.util.List<String> values = new java.util.ArrayList<String>();
values.add("Lisa");
values.add("Kevin");
values.add("Roger");
for(String value : values) {
    System.out.print(value + ", ");
}

This code will compile and print the same values:

Lisa, Kevin, Roger,

When you see a for-each loop on the exam, make sure the right-hand side is an array
or Iterable object and the left-hand side has a matching type. For example, the two
examples that follow will not compile.
*/
        {
            message = "---- FOR-EACH STATEMENT - ITERABLES ----";
            System.out.printf("%n %50s%n", message);
            
            java.util.List<String> values = new java.util.ArrayList<>();
            values.add("Lisa");
            values.add("Kevin");
            values.add("Roger");
            for (String value : values) {
//                System.out.print(value + ", ");
                System.out.printf(" value = %s%n", value);
            }
        }
/**
■ Why will the following fail to compile?

String names = "Lisa";
for(String name : names) { // DOES NOT COMPILE
    System.out.print(name + " ");
}

In this example, the String names is not an array, nor does it implement java.lang.
Iterable, so the compiler will throw an exception since it does not know how to iterate
over the String.
 */
        {
            message = "---- FOR-EACH STATEMENT - FOR EACH FOR NOT ITERABLES ----";
            System.out.printf("%n %50s%n", message);
            
            String names = "Lisa";
//            for (String name : names) { // DOES NOT COMPILE - REQUIRED ARRAY OR ITERABLE
//                System.out.print(name + " ");
//            }
            message = "String names = \"Lisa\";\nfor (String name : names) { // DOES NOT COMPILE - REQUIRED ARRAY OR ITERABLE";
            System.out.printf("%n message = %s%n", message);
            System.out.printf(" names = %s%n", names);
        }
/**
■ Why will the following fail to compile?

String[] names = new String[3];
for(int name : names) { // DOES NOT COMPILE
    System.out.print(name + " ");
}

This code will fail to compile because the left-hand side of the for-each statement does
not define an instance of String. Notice that in this last example, the array is initialized
with three null pointer values. In and of itself, that will not cause the code to not
compile, as a corrected loop would just output null three times.
 */
        {
            message = "---- FOR-EACH STATEMENT - WRONG LEFT HAND SIDE TYPE ----";
            System.out.printf("%n %50s%n", message);
            
//            String[] names = new String[3];
//            for (int name : names) { // DOES NOT COMPILE - INCOMPATIBLE TYPES - STRING CAN'T CONVERTED IN INT
//                System.out.print(name + " ");
//            }
            message = "String[] names = new String[3];\n"
                    + "            for (int name : names) { // DOES NOT COMPILE - INCOMPATIBLE TYPES - STRING CAN'T CONVERTED IN INT\n"
                    + "                System.out.print(name + \" \");\n"
                    + "            }";
            System.out.printf("%n message = %s%n", message);
        }
        {
            message = "---- FOR-EACH STATEMENT - NULL ARRAY ----";
            System.out.printf("%n %50s%n", message);
            
            String[] names = new String[3];
            for (String name : names) { // DOES NOT COMPILE
//                System.out.print(name + " ");
                System.out.printf(" name = %s,%n", name);
            }
            System.out.printf("%n names = %s%n", (Object[]) names);
            
            List<String> names2 = new ArrayList<>(3);
            for(String name2 : names2){
                System.out.printf(" name2 = %s,%n", name2);
            }
            System.out.printf("%n names2 = %s%n", names2);
        }
/**
Comparing for and for-each Loops

Since for and for-each both use the same keyword, you might be wondering how they
are related. While this discussion is out of scope for the exam, let’s take a moment to
explore how for-each loops are converted to for loops by the compiler.
When for-each was introduced in Java 5, it was added as a compile-time enhancement.
This means that Java actually converts the for-each loop into a standard for loop during
compilation. For example, assuming names is an array of String[] as we saw in the first
example, the following two loops are equivalent:

for(String name : names) {
    System.out.print(name + ", ");
}

for(int i=0; i < names.length; i++) {
    String name = names[i];
    System.out.print(name + ", ");
}
 */
        {
            message = "---- FOR-EACH STATEMENT - FOR-EACH = COMPILE-TIME ENHANCEMENT FOR LOOP----";
            System.out.printf("%n %50s%n", message);
            
            String[] names = {"Alice", "Lois", "Esteban"};
            for (String name : names) {
                System.out.printf("For-each: name = %s,%n", name);
            }
            
            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                System.out.printf("For: name = %s,%n", name);
            }
        }
/**
For objects that inherit java.lang.Iterable, there is a different, but similar, conversion.
For example, assuming values is an instance of List<Integer>, as we saw in the second
example, the following two loops are equivalent:

for(int value : values) {
    System.out.print(value + ", ");
}

for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
    int value = i.next();
    System.out.print(value + ", ");
}

Notice that in the second version, there is no update statement as it is not required when
using the java.util.Iterator class.

You may have noticed that in the previous for-each examples, there was an extra
comma printed at the end of the list:

Lisa, Kevin, Roger,
 */
        {
            message = "---- FOR-EACH STATEMENT - FOR ON ITERATOR ----";
            System.out.printf("%n %50s%n", message);
            
            List<Long> values = new ArrayList<>();
            
//            values.add(5);
//            values.add(10);
//            values.add(15);
            
            long ldt = LocalTime.now().toNanoOfDay();
//            System.out.printf("%n ldt = %,d%n", ldt);
            {
                long temLdt = 0;
                for(long i = 0; i < Long.MAX_VALUE; i++) {
//                    System.out.printf("%n temLdt = %,d%n", temLdt);
//                    System.out.printf(" LocalTime.now().toNanoOfDay() = %,d%n", LocalTime.now().toNanoOfDay());
//                    System.out.printf(" ldt = %,d%n", ldt);
                    if((temLdt = LocalTime.now().toNanoOfDay() - ldt) > (100 * 1000 * 1000)) {
                        break;
                    }
                    values.add(i);
//                    System.out.printf(" temLdt = %,d%n", temLdt);
                }
            }
            
            long forEachTime;
            ldt = LocalTime.now().toNanoOfDay();
//            System.out.printf("%n ldt = %,d%n", ldt);
            for (long value : values) {
//                System.out.printf("for-each principal value: value = %s,%n", value);
                System.out.print("");
            }
            System.out.printf("%n for-each: execution = %,d%n%n", forEachTime = LocalTime.now().toNanoOfDay() - ldt);
            
            long forEachWrapper;
            ldt = LocalTime.now().toNanoOfDay();
//            System.out.printf("%n ldt = %,d%n", ldt);
            for (Long value : values) {
//                System.out.printf("for-each-wrapper value: value = %s,%n", value);
                System.out.print("");
            }
            System.out.printf("%n for-each-wrapper: execution = %,d%n%n", forEachWrapper = LocalTime.now().toNanoOfDay() - ldt);
            
            long forIterableTime;
            ldt = LocalTime.now().toNanoOfDay();
//            System.out.printf("%n ldt = %,d%n", ldt);
            for(Iterator<Long> i = values.iterator(); i.hasNext(); ) {
                long value = i.next();
//                System.out.printf("for-iterable: value = %s,%n", value);
                System.out.print("");
            }
            System.out.printf("%n for-iterable: execution = %,d%n%n", forIterableTime = LocalTime.now().toNanoOfDay() - ldt);
            
            long forIterable2Time;
            {
                Iterator<Long> i = values.iterator();
                ldt = LocalTime.now().toNanoOfDay();
//                System.out.printf("%n ldt = %,d%n", ldt);
                for (
                        long value = (i.hasNext() ? i.next() : Integer.MIN_VALUE); 
                        value != Integer.MIN_VALUE;
                        value = (i.hasNext() ? i.next() : Integer.MIN_VALUE) 
                    ) {
//                    System.out.printf("for-iterable-v2: value = %s,%n", value);
                    System.out.print("");
                }
                System.out.printf("%n for-iterable-v2: execution = %,d%n%n", forIterable2Time = LocalTime.now().toNanoOfDay() - ldt);
            }
            
            long forIterable3Time;
            {
                Iterator<Long> i = values.iterator();
                ldt = LocalTime.now().toNanoOfDay();
//                System.out.printf("%n ldt = %,d%n", ldt);
                for (
                        Long value = (i.hasNext() ? i.next() : null); 
                        value != null;
                        value = (i.hasNext() ? i.next() : null) 
                    ) {
//                    System.out.printf("for-iterable-v3: value = %s,%n", value);
                    System.out.print("");
                }
                System.out.printf("%n for-iterable-v3: execution = %,d%n%n", forIterable3Time = LocalTime.now().toNanoOfDay() - ldt);
            }
            
            long forListTime;
            ldt = LocalTime.now().toNanoOfDay();
//                System.out.printf("%n ldt = %,d%n", ldt);
            for (
                    long i = 0L, value = (values.size() > 0 ? values.get(0) : 0);
                    i < values.size();
                    value = (values.size() > ++i ? values.get((int) i) : 0)
                ) {
//                    System.out.printf("for-list: value = %s,%n", value);
                System.out.print("");
            }
            System.out.printf("%n for-list: execution = %,d%n%n", forListTime = LocalTime.now().toNanoOfDay() - ldt);
            
            
            System.out.printf("%n forEachTime = %,d%n", forEachTime);
            System.out.printf(" forEachWrapper = %,d%n", forEachWrapper);
            System.out.printf(" forIterableTime = %,d%n", forIterableTime);
            System.out.printf(" forIterable2Time = %,d%n", forIterable2Time);
            System.out.printf(" forIterable3Time = %,d%n", forIterable3Time);
            System.out.printf(" forListTime = %,d%n", forListTime);
        }
/**
While the for-each statement is convenient for working with lists in many cases, it does
hide access to the loop iterator variable. If we wanted to print only the comma between
names, we could convert the example into a standard for loop, as in the following example:

java.util.List<String> names = new java.util.ArrayList<String>();
names.add("Lisa");
names.add("Kevin");
names.add("Roger");
for(int i=0; i<names.size(); i++) {
    String name = names.get(i);
        if(i>0) {
            System.out.print(", ");
        }
    System.out.print(name);
}

This sample code would output the following:
Lisa, Kevin, Roger
 */
        {
            message = "---- FOR-EACH STATEMENT - FOR OVER FOR-EACH ----";
            System.out.printf("%n %50s%n", message);
            
            java.util.List<String> names = new java.util.ArrayList<String>();
            names.add("Lisa");
            names.add("Kevin");
            names.add("Roger");
            
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(name);
            }
        }
/**
It is also common to use a standard for loop over a for-each loop if comparing multiple
elements in a loop within a single iteration, as in the following example. Notice that
we skip the first loop’s execution, since value[-1] is not defined and would throw an
IndexOutOfBoundsException error.

int[] values = new int[3];
values[0] = 10;
values[1] = new Integer(5);
values[2] = 15;
for(int i=1; i<values.length; i++) {
    System.out.print(values[i]-values[i-1]);
}

This sample code would output the following:

-5, 10,

Despite these examples, enhanced for-each loops are quite useful in Java in a variety of
circumstances. As a developer, though, you can always revert to a standard for loop if you
need fi ne-grain control.
 */
        {
            message = "---- FOR-EACH STATEMENT - FOR OVER FOR-EACH ----";
            System.out.printf("%n %50s%n", message);
            
            int[] values = new int[3];
            values[0] = 10;
            values[1] = new Integer(5);
            values[2] = 15;
            for (int i = 1; i < values.length; i++) {
                System.out.printf(" values[i] - values[i - 1] = %s%n", values[i] - values[i - 1]);
            }
        }
    }
}
