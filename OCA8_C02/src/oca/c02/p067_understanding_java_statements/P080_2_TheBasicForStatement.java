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
public class P080_2_TheBasicForStatement {
    public static void main(String[] args) {
        String message;
        
/**
A basic for loop has the same conditional boolean expression and statement, or block of
statements, as the other loops you have seen, as well as two new sections: an initialization
block and an update statement. Figure 2.7 shows how these components are laid out.
 
Although Figure 2.7 might seem a little confusing and almost arbitrary at first, the organization
of the components and flow allow us to create extremely powerful statements in a
very small amount of space that otherwise would take multiple lines with a standard while
loop. Note that each section is separated by a semicolon. The initialization and update sections
may contain multiple statements, separated by commas.

Variables declared in the initialization block of a for loop have limited scope and
are only accessible within the for loop. Be wary of any exam questions in which a variable
declared within the initialization block of a for loop is available outside the loop.
Alternatively, variables declared before the for loop and assigned a value in the initialization
block may be used outside the for loop because their scope precedes the for loop
creation.

Let’s take a look at an example that prints the numbers 0 to 9:

for(int i = 0; i < 10; i++) {
    System.out.print(i + " ");
}

The local variable i is initialized fi rst to 0. The variable i is only in scope for the duration
of the loop and is not available outside the loop once the loop has completed. Like a
while loop, the boolean condition is evaluated on every iteration of the loop before the
loop executes. Since it returns true, the loop executes and outputs the 0 followed by a
space. Next, the loop executes the update section, which in this case increases the value
of i to 1. The loop then evaluates the boolean expression a second time, and the process
repeats multiple times, printing:

0 1 2 3 4 5 6 7 8 9

On the 10th iteration of the loop, the value of i reaches 9 and is incremented by 1 to
reach 10. On the 11th iteration of the loop, the boolean expression is evaluated and since
(10 < 10) returns false, the loop terminates without executing the statement loop body.
 */
        {
            message = "---- IF STATEMENT STRUCTURE ----";
            System.out.printf("%n %50s%n", message);
            
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
/**
Although most for loops you are likely to encounter in practice will be well defined and
similar to the previous example, there are a number of variations and edge cases you could
see on the exam. You should familiarize yourself with the following five examples:
variations of these are likely to be seen on the exam.

Let’s tackle some examples for illustrative purposes:

1. Creating an Infinite Loop

for( ; ; ) {
   System.out.println("Hello World");
}

Although this for loop may look like it will throw a compiler error, it will in fact compile
and run without issue. It is actually an infinite loop that will print the same statement
repeatedly. This example reinforces the fact that the components of the for loop are each
optional. Note that the semicolons separating the three sections are required, as for( ; )
and for( ) will not compile.
 */
        {
            message = "---- IF STATEMENT - INFINITE LOOP ----";
            System.out.printf("%n %50s%n", message);

//            for (;;) {
//                System.out.println("Hello World");
//            }
            
            int limit = 1000;
            for (;;) {
                if (limit >= 0) {
                    System.out.println("Hello World - with limit: "+limit);
                } else {
                    break;
                }
                limit--;
            }
        }
/**
2. Adding Multiple Terms to the for Statement

int x = 0;
for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(y + " ");
}
System.out.print(x);

This code demonstrates three variations of the for loop you may not have seen. First, you
can declare a variable, such as x in this example, before the loop begins and use it after it
completes. Second, your initialization block, boolean expression, and update statements
can include extra variables that may not reference each other. For example, z is defined in
the initialization block and is never used. Finally, the update statement can modify multiple
variables. This code will print the following when executed:

0 1 2 3 4

Keep this example in mind when we look at the next three examples, none of which
compile.
 */        
        {
            message = "---- IF STATEMENT - MULTIPLE TERMS ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 0;
            for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
                System.out.print(y + " ");
            }
            System.out.print(x);
            
            System.out.println("");
            
            x = 0;
            for (long y = 0, z = 4; x < 5 && y < 10; x++, y += x++) {
                System.out.printf("%n x = %s%n", x);
                System.out.printf(" y = %s%n", y);
            }
            System.out.printf("%n x = %s%n", x);
        }
/**
3. Redeclaring a Variable in the Initialization Block

int x = 0;
for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
    System.out.print(x + " ");
}

This example looks similar to the previous one, but it does not compile because of the initialization
block. The difference is that x is repeated in the initialization block after already
being declared before the loop, resulting in the compiler stopping because of a duplicate
variable declaration. We can fix this loop by changing the declaration of x and y as follows:

int x = 0;
long y = 10;
for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(x + " ");
}

Note that this variation will now compile because the initialization block simply assigns a
value to x and does not declare it.
 */
        {
            message = "---- IF STATEMENT - REDECLARING VARIABLES ----";
            System.out.printf("%n %50s%n", message);
            
//            int x = 0;
//            for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE - VARIABLE X ALREADY DEFINED
//                System.out.print(x + " ");
//            }
            
            int x = 0;
            long y = 10;
            for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//                System.out.print(x + " ");
                System.out.printf("%n x = %s%n", x);
                System.out.printf(" y = %s%n", y);
            }
            System.out.println("FOR END");
            System.out.printf("%n x = %s%n", x);
            System.out.printf(" y = %s%n", y);
            
            message = "INITIALIZATION BLOCK - ANALISIS";
            System.out.printf("%n %50s%n", message);
            
            x = 1;
            y = 10;
            for (y = x++, x += 2; x < (y += x) && y < 21; x++, y += (y /= 2)) {
//                System.out.print(x + " ");
                System.out.printf("%n x = %s%n", x);
                System.out.printf(" y = %s%n", y);
            }
            System.out.println("FOR END");
            System.out.printf("%n x = %s%n", x);
            System.out.printf(" y = %s%n", y);
        }
/**
4. Using Incompatible Data Types in the Initialization Block

for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
    System.out.print(x + " ");
}

This example also looks a lot like our second example, but like the third example will not
compile, although this time for a different reason. The variables in the initialization block
must all be of the same type. In the first example, y and z were both long, so the code compiled
without issue, but in this example they have differing types, so the code will not compile.
 */
        {
            message = "---- IF STATEMENT - INCOMPATIBLE DATA TYPES ----";
            System.out.printf("%n %50s%n", message);
            
//            for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE - DIFERENT DATA TYPES
//                System.out.print(x + " ");
//            }
            
//            for(Long y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { // DOES NOT COMPILE - LONG WRAPPER NO SUPPORTED
//            for(long y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(Integer y = 0, x = 4; (x < 5) && (y < 10); x++, y++) {
//            for(int y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(Short y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(short y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(Byte y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(byte y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(Character y = 0, x = 4; (x < 5) && (y < 10); x++, y++) { 
//            for(char y = 'A', x = 'C'; (x < 'j') && (y < 'm'); x++, y++) { 
            char charX = 'C';
            char charY = 'A';
            char ñ = '®';
            String y, x;
            for(y = ""+charY, x = ""+charY; 
                    !(x.matches(".*FG.I") && y.contains("EFG")); 
                    x += charX++, y += charY++) {
                
                System.out.printf(" x.matches(\".*FG.I\") = %b%n", x.matches(".*FG.I"));
                System.out.printf(" y.contains(\"EFG\") = %b%n", y.contains("EFG"));
                System.out.printf(" x = %s%n", x);
                System.out.printf(" y = %s%n", y);
                System.out.println("");
            }
            System.out.printf(" x.matches(\".*FG.I\") = %b%n", x.matches(".*FG.I"));
                System.out.printf(" y.contains(\"EFG\") = %b%n", y.contains("EFG"));
                System.out.printf(" x = %s%n", x);
                System.out.printf(" y = %s%n", y);
                System.out.println("");
        }
/**
5. Using Loop Variables Outside the Loop

for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(y + " ");
}
System.out.print(x); // DOES NOT COMPILE

The final variation on the second example will not compile for a different reason than the
previous examples. If you notice, x is defined in the initialization block of the loop, and
then used after the loop terminates. Since x was only scoped for the loop, using it outside
the loop will throw a compiler error.
 */
        {
            message = "---- IF STATEMENT - SCOPE ----";
            System.out.printf("%n %50s%n", message);
            
            for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
                System.out.print(y + " ");
            }
//            System.out.print(x); // DOES NOT COMPILE
        }
    }
}
