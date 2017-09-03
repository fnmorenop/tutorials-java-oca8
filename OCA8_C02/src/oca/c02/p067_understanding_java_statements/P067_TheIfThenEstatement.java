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
public class P067_TheIfThenEstatement {
    public static void main(String[] args) {
        String message;
/**
Often, we only want to execute a block of code under certain circumstances. The if-then
statement, as shown in Figure 2.2, accomplishes this by allowing our application to execute
a particular block of code if and only if a boolean expression evaluates to true at runtime.

For example, imagine we had a function that used the hour of day, an integer value from
0 to 23, to display a message to the user:

    if(hourOfDay < 11)
        System.out.println("Good Morning");

If the hour of the day is less than 11, then the message will be displayed. Now let’s say
we also wanted to increment some value, morningGreetingCount, every time the greeting
is printed. We could write the if-then statement twice, but luckily Java offers us a more
natural approach using a block:

    if(hourOfDay < 11) {
        System.out.println("Good Morning");
        morningGreetingCount++;
    }

The block allows multiple statements to be executed based on the if-then evaluation.
Notice that the fi rst statement didn’t contain a block around the print section, but it easily
could have. For readability, it is considered good coding practice to put blocks around the
execution component of if-then statements, as well as many other control fl ow statements,
although it is not required.
 */
        {
            message = "---- THE IF THEN STATEMENT ----";
            System.out.printf("%n %50s%n", message);
            
            int hourOfDay = 10;
            int morningGreetingCount = 0;
            System.out.printf("%n morningGreetingCount = %d%n", morningGreetingCount);
            
            if(hourOfDay < 11)
                System.out.println("Unbraced if: Good Morning");
            
            System.out.printf(" morningGreetingCount = %d%n", morningGreetingCount);
            
            if (hourOfDay < 11) {
                System.out.println("Braced if: Good Morning");
                morningGreetingCount++;
                System.out.printf(" morningGreetingCount = %d%n", morningGreetingCount);
            }
            System.out.printf(" morningGreetingCount = %d%n", morningGreetingCount);
        }
/**
Watch Indentation and Braces
One area that the exam writers will try to trip you up is on if-then statements without
braces ({}). For example, take a look at this slightly modified form of our example:

if(hourOfDay < 11)
System.out.println("Good Morning");
morningGreetingCount++;

Based on the indentation, you might be inclined to think the variable morningGreeting-
Count is only going to be incremented if the hourOfDay is less than 11, but that’s not what
this code does. It will execute the print statement only if the condition is met, but it will
always execute the increment operation.

Remember that in Java, unlike some other programming languages, tabs are just
whitespace and are not evaluated as part of the execution. When you see a control fl ow
statement in a question, be sure to trace the open and close braces of the block and
ignore any indentation you may come across.
 */
        {
            message = "---- WATCH INDENTATION AND BRACES ----";
            System.out.printf("%n %50s%n", message);
            
            int hourOfDay = 11;
            int morningGreetingCount = 0;
            
            System.out.printf("%n morningGreetingCount = %d%n", morningGreetingCount);
            
            if(hourOfDay < 11)
                System.out.println("Good Morning");
                morningGreetingCount++;
                
            System.out.printf(" morningGreetingCount = %d%n", morningGreetingCount);
        }
        
    }
}
