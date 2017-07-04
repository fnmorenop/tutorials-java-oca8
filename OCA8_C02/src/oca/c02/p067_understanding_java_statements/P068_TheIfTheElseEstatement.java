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
public class P068_TheIfTheElseEstatement {
    public static void main(String[] args) {
        String message;
        
/**
Let’s expand our example a little. What if we want to display a different message if it is 11
a.m. or later? Could we do it using only the tools we have? Of course we can!

if(hourOfDay < 11) {
    System.out.println("Good Morning");
}
if(hourOfDay >= 11) {
    System.out.println("Good Afternoon");
}
*/
        {
             message = "---- MULTI IF THEN STATEMENT ----";
            System.out.printf("%n %50s%n", message);
            
            int hourOfDay = 11;
            
            if (hourOfDay < 11) {
                System.out.println("Good Morning");
            }
            if (hourOfDay >= 11) {
                System.out.println("Good Afternoon");
            }
        }
/**
This seems a bit redundant, though, since we’re performing an evaluation on hourOfDay
twice. It’s also wasteful because in some circumstances the cost of the boolean expression
we’re evaluating could be computationally expensive. Luckily, Java offers us a more useful
approach in the form of an if-then-else statement, as shown in Figure 2.3.

Let’s return to this example:

if(hourOfDay < 11) {
    System.out.println("Good Morning");
} else {
    System.out.println("Good Afternoon");
}
 */
        {
            message = "---- IF-ELSE STATEMENT ----";
            System.out.printf("%n %50s%n", message);

            int hourOfDay = 11;

            if (hourOfDay < 11) {
                System.out.println("Good Morning");
            } else {
                System.out.println("Good Afternoon");
            }
        }
/**
Now our code is truly branching between one of the two possible options, with the
boolean evaluation happening only once. The else operator takes a statement or block of
statement, in the same manner as the if statement does. In this manner, we can append
additional if-then statements to an else block to arrive at a more refined example:

if(hourOfDay < 11) {
    System.out.println("Good Morning");
} else if(hourOfDay < 15) {
    System.out.println("Good Afternoon");
} else {
    System.out.println("Good Evening");
}

In this example, the Java process will continue execution until it encounters an if-then
statement that evaluates to true. If neither of the fi rst two expressions are true, it will
execute the fi nal code of the else block.
 */
        {
            message = "---- IF-ELSE-IF STATEMENT ----";
            System.out.printf("%n %50s%n", message);

            int hourOfDay = 11;

            if (hourOfDay < 11) {
                System.out.println("Good Morning");
            } else if (hourOfDay < 15) {
                System.out.println("Good Afternoon");
            } else {
                System.out.println("Good Evening");
            }
        }
/**
One thing to keep in mind in creating complex
if-then-else statements is that order is important. For example, see what happens if we
reorder the previous snippet of code as follows:

if(hourOfDay < 15) {
    System.out.println("Good Afternoon");
} else if(hourOfDay < 11) {
    System.out.println("Good Morning"); // UNREACHABLE CODE
} else {
    System.out.println("Good Evening");
}

For hours of the day less than 11, this code behaves very differently than the previous set
of code. See if you can determine why the second block can never be executed regardless of
the value of hourOfDay.

If a value is less than 11, then it must be also less than 15 by defi nition. Therefore, if the
second branch in the example can be reached, the fi rst branch can also be reached. Since
execution of each branch is mutually exclusive in this example—that is, only one branch
can be executed—if the fi rst branch is executed, then the second cannot be executed.
Therefore, there is no way the second branch will ever be executed, and the code is deemed
unreachable.
 */
        {
            message = "---- IF-ELSE-IF STATEMENT - ORDER IMPORTANCE ----";
            System.out.printf("%n %50s%n", message);

            int hourOfDay = 9;

            if (hourOfDay < 15) {
                System.out.println("Good Afternoon");
            } else if (hourOfDay < 11) {
                System.out.println("Good Morning"); // UNREACHABLE CODE
            } else {
                System.out.println("Good Evening");
            }
        }
/**
Verifying the if Statement Evaluates to a Boolean Expression

Another common place the exam may try to lead you astray is by providing code where
the boolean expression inside the if-then statement is not actually a boolean expression.
For example, take a look at the following lines of code:

int x = 1;
if(x) { // DOES NOT COMPILE
...
}

This statement may be valid in some other programming and scripting languages, but not
in Java, where 0 and 1 are not considered boolean values. Also, be wary of assignment
operators being used as if they were equals == operators in if-then statements:

int x = 1;
if(x = 5) { // DOES NOT COMPILE
...
}
 */
        {
            message = "---- IF-ELSE-IF STATEMENT - ORDER IMPORTANCE ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 1;
//            if (x) { }// DOES NOT COMPILE - CANNOT CONVERT TO BOOLEAN
            
            message = "---- if (x) { }// DOES NOT COMPILE - CANNOT CONVERT TO BOOLEAN ----";
            System.out.printf(" %50s%n", message);    
            
//            if (x = 5) { } // DOES NOT COMPILE - CANNOT CONVERT TO BOOLEAN
                
            message = "---- if (x = 5) { }// DOES NOT COMPILE - CANNOT CONVERT TO BOOLEAN ----";
            System.out.printf(" %50s%n", message); 
            
            if((x = 4) < 10){
                System.out.printf(" x = %d%n", x);
            }
            
            int y = 11;
            if (5 < (x += y) && x > 12) {
                System.out.printf(" x = %d%n", x);
            } else {
                System.out.printf(" ELSE x = %d%n", x);
            }
        }
    }
}
