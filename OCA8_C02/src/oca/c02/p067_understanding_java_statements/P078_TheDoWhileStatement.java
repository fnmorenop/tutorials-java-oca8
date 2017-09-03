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
public class P078_TheDoWhileStatement {
    public static void main(String[] args) {
        String message;
/**
Java also allows for the creation of a do-while loop, which like a while loop, is a
repetition control structure with a termination condition and statement, or block of
statements, as shown in Figure 2.6. Unlike a while loop, though, a do-while loop guarantees
that the statement or block will be executed at least once.

The primary difference between the syntactic structure of a do-while loop and a while
loop is that a do-while loop purposely orders the statement or block of statements before
the conditional expression, in order to reinforce that the statement will be executed before
the expression is ever evaluated. For example, take a look at the output of the following
statements:

int x = 0;
do {
    x++;
} while(false);
System.out.println(x); // Outputs 1

Java will execute the statement block fi rst, and then check the loop condition. Even
though the loop exits right away, the statement block was still executed once and the program
outputs a 1.
 */
        {
            message = "---- DO-WHILE STATEMENT - STRUCTURE ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 0;
            int y = 1;
            
            do {
                x++;
                y *= 1;
            } while (false);
            System.out.printf("%n x = %s%n", x); // Outputs 1
            System.out.printf(" y = %s%n", y);
        }
        
        {
            message = "---- DO-WHILE STATEMENT - STRUCTURE - SINGLE STATEMENT----";
            System.out.printf("%n %50s%n", message);
            
            int x = 0;
            do 
                x++; 
            while (false);
            
            System.out.printf("%n x = %s%n", x); // Outputs 1
        }
/**
When to Use while vs. do-while Loops
In practice, it might be diffi cult to determine when you should use a while loop and when
you should use a do-while loop. The short answer is that it does not actually matter. Any
while loop can be converted to a do-while loop, and vice versa. For example, compare
this while loop:

while(x > 10) {
    x--;
}

and this do-while loop:

if(x > 10) {
    do {
        x--;
    } while(x > 10);
}

Though one of the loops is certainly easier to read, they are functionally equivalent. Java
recommends you use a while loop when a loop might not be executed at all and a do-while
loop when the loop is executed at least once. But determining whether you should
use a while loop or a do-while loop in practice is sometimes about personal preference
and code readability.

For example, although the first statement is shorter, the second has the advantage that
you could leverage the existing if-then statement and perform some other operation in
a new else branch, as shown in the following example:

if(x > 10) {
    do {
        x--;
    } while(x > 10);
} else {
    x++;
}
 */
        {
            message = "---- DO-WHILE VS WHILE ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 15;
            System.out.printf("%n x = %s%n", x);
            
            while (x > 10) {
                x--;
            }
            System.out.printf(" x = %s%n", x);
            
            x = 15;
            System.out.printf("%n x = %s%n", x);
            
            if (x > 10) {
                do {
                    x--;
                } while (x > 10);
            }
            System.out.printf(" x = %s%n", x);
            
            x = 15;
            System.out.printf("%n x = %s%n", x);
            
            if (x > 10) {
                do {
                    x--;
                } while (x > 10);
            } else {
                x++;
            }
            System.out.printf(" x = %s%n", x);
        }
    }
}
