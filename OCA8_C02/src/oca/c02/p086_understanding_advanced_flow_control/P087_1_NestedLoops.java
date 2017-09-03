/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p086_understanding_advanced_flow_control;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P087_1_NestedLoops {
    public static void main(String[] args) {
        String message;
/**
First off, loops can contain other loops. For example, consider the following code that iterates
over a two-dimensional array, an array that contains other arrays as its members. We'll
cover multidimensional arrays in detail in Chapter 3, but for now assume the following is
how you would declare a two-dimensional array.

int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
for(int[] mySimpleArray : myComplexArray) {
    for(int i=0; i<mySimpleArray.length; i++) {
        System.out.print(mySimpleArray[i]+"\t");
    }
    System.out.println();
}

Notice that we intentionally mix a for and for-each loop in this example. The outer
loops will execute a total of three times. Each time the outer loop executes, the inner loop
is executed four times. When we execute this code, we see the following output:

5 2 1 3
3 9 8 9
5 7 12 7

 */
        {
            message = "---- NESTED LOOPS - FOR-FOR-EACH ----";
            System.out.printf("%n %50s%n", message);
            
            int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
            for (int[] mySimpleArray : myComplexArray) {
                for (int i = 0; i < mySimpleArray.length; i++) {
                    System.out.print(mySimpleArray[i] + "\t");
                }
                System.out.println();
            }
        }
/**
Nested loops can include while and do-while, as shown in this example. See if you can
determine what this code will output.

int x = 20;
while(x>0) {
    do {
        x -= 2;
    } while (x>5);
    x--;
    System.out.print(x+"\t");
}

The first time this loop executes, the inner loop repeats until the value of x is 4. The
value will then be decremented to 3 and that will be the output at the end of the first iteration
of the outer loop. On the second iteration of the outer loop, the inner do-while will
be executed once, even though x is already not greater than 5. As you may recall, do-while
statements always execute the body at least once. This will reduce the value to 1, which will
be further lowered by the decrement operator in the outer loop to 0. Once the value reaches
0, the outer loop will terminate. The result is that the code will output the following:

3 0

 */
        {
            message = "---- NESTED LOOPS - WHILE-DO-WHILE ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 20;
            while (x > 0) {
                do {
                    x -= 2;
                } while (x > 5);
                x--;
                System.out.print(x + "\t");
            }
        }
    }
}
