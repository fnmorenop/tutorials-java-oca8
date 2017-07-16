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
public class P088_TheBreakStatement {
    public static void main(String[] args) {
        String message;
/**
As you saw when working with switch statements, a break statement transfers the flow
of control out to the enclosing statement. The same holds true for break statements that
appear inside of while, do-while, and for loops, as it will end the loop early, as shown in
Figure 2.9

Notice in Figure 2.9 that the break statement can take an optional label parameter.
Without a label parameter, the break statement will terminate the nearest inner loop it is
currently in the process of executing. The optional label parameter allows us to break out
of a higher level outer loop. In the following example, we search for the first (x,y) array
index position of a number within an unsorted two-dimensional array:

public class SearchSample {
    public static void main(String[] args) {
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " +
            "("+positionX+","+positionY+")");
        }
    }
}

When executed, this code will output:

Value 2 found at: (1,1)
 */
        {
            message = "---- BREAK STATEMENT - BREAK + OPTIONAL LABEL ----";
            System.out.printf("%n %50s%n", message);
            
            int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
            int searchValue = 2;
            int positionX = -1;
            int positionY = -1;
            PARENT_LOOP:
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j] == searchValue) {
                        positionX = i;
                        positionY = j;
                        break PARENT_LOOP;
                    }
                }
            }
            if (positionX == -1 || positionY == -1) {
                System.out.println("Value " + searchValue + " not found");
            } else {
                System.out.println("Value " + searchValue + " found at: "
                        + "(" + positionX + "," + positionY + ")");
            }
        }
/**
In particular, take a look at the statement break PARENT_LOOP. This statement will break
out of the entire loop structure as soon as the first matching value is found. Now, imagine
what would happen if we replaced the body of the inner loop with the following:

if(list[i][j]==searchValue) {
    positionX = i;
    positionY = j;
    break;
}

How would this change our flow and would the output change? Instead of exiting when
the first matching value is found, the program will now only exit the inner loop when the
condition is met. In other words, the structure will now find the first matching value of the
last inner loop to contain the value, resulting in the following output:

Value 2 found at: (2,0)
 */
        {
            message = "---- BREAK STATEMENT - BREAK ----";
            System.out.printf("%n %50s%n", message);
            
            int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
            int searchValue = 2;
            int positionX = -1;
            int positionY = -1;
            PARENT_LOOP:
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j] == searchValue) {
                        positionX = i;
                        positionY = j;
                        break; // PARENT_LOOP;
                    }
                }
            }
            if (positionX == -1 || positionY == -1) {
                System.out.println("Value " + searchValue + " not found");
            } else {
                System.out.println("Value " + searchValue + " found at: "
                        + "(" + positionX + "," + positionY + ")");
            }
        }
/**
Finally, what if we removed the break altogether?

if(list[i][j]==searchValue) {
    positionX = i;
    positionY = j;
}

In this case, the code will search for the last value in the entire structure that has the
matching value. The output will look like this:

Value 2 found at: (2,2)

You can see from this example that using a label on a break statement in a nested
loop, or not using the break statement at all, can cause the loop structure to behave quite
differently.
 */
        {
            message = "---- BREAK STATEMENT - NO BREAK ----";
            System.out.printf("%n %50s%n", message);
            
            int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
            int searchValue = 2;
            int positionX = -1;
            int positionY = -1;
            PARENT_LOOP:
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j] == searchValue) {
                        positionX = i;
                        positionY = j;
//                        break PARENT_LOOP;
                    }
                }
            }
            if (positionX == -1 || positionY == -1) {
                System.out.println("Value " + searchValue + " not found");
            } else {
                System.out.println("Value " + searchValue + " found at: "
                        + "(" + positionX + "," + positionY + ")");
            }
        }
    }
}
