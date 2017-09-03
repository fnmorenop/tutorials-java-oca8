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
public class P076_TheWhileStatement {
    public static void main(String[] args) {
        String message;
/**
A repetition control structure, which we refer to as a loop, executes a statement of code
multiple times in succession. By using nonconstant variables, each repetition of the statement
may be different. For example, a statement that iterates over a list of unique names
and outputs them would encounter a new name on every execution of the loop.

A repetition control structure, which we refer to as a loop, executes a statement of code
multiple times in succession. By using nonconstant variables, each repetition of the statement
may be different. For example, a statement that iterates over a list of unique names
and outputs them would encounter a new name on every execution of the loop.

* As shown in Figure 2.5, a while loop is similar to an if-then statement in that it is
composed of a boolean expression and a statement, or block of statements. During execution,
the boolean expression is evaluated before each iteration of the loop and exits if the
evaluation returns false. It is important to note that a while loop may terminate after its
first evaluation of the boolean expression. In this manner, the statement block may never
be executed.

Let’s return to our mouse example from Chapter 1 and show a loop can be used to
model a mouse eating a meal:

int roomInBelly = 5;
public void eatCheese(int bitesOfCheese) {
    while (bitesOfCheese > 0 && roomInBelly > 0) {
        bitesOfCheese--;
        roomInBelly--;
    }
    System.out.println(bitesOfCheese+" pieces of cheese left");
}

This method takes an amount of food, in this case cheese, and continues until the mouse
has no room in its belly or there is no food left to eat. With each iteration of the loop, the
mouse “eats” one bite of food and loses one spot in its belly. By using a compound boolean
statement, you ensure that the while loop can end for either of the conditions.
 */
        {
            message = "---- SWITCH STATEMENT - STRUCTURE - SINGLE STATEMENT ----";
            System.out.printf("%n %50s%n", message);
            
            P076_TheWhileStatement p = new P076_TheWhileStatement();
            
            int bitesOfCheese = 10;
            System.out.printf("%n p.roomInBelly = %s%n", p.roomInBelly);
            System.out.printf("%n bitesOfCheese = %s%n", bitesOfCheese);
            
            p.eatCheese(bitesOfCheese);
            System.out.printf("%n bitesOfCheese = %s%n", bitesOfCheese);
            System.out.printf("%n p.roomInBelly = %s%n", p.roomInBelly);
            
            p.roomInBelly = 5;
            System.out.printf("%n p.roomInBelly = %s%n", p.roomInBelly);
            System.out.printf("%n bitesOfCheese = %s%n", bitesOfCheese);
            
            p.eatCheese(p.roomInBelly);
            System.out.printf("%n bitesOfCheese = %s%n", bitesOfCheese);
            System.out.printf("%n p.roomInBelly = %s%n", p.roomInBelly);
        }
    }
    int roomInBelly = 5; 
    
    public void eatCheese(int bitesOfCheese) {
        System.out.println("eatCheese");
        System.out.printf("%n roomInBelly = %s%n", roomInBelly);
        System.out.printf("%n bitesOfCheese = %s%n", bitesOfCheese);
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            System.out.printf("%n bitesOfCheese = %s%n", bitesOfCheese);
            
            roomInBelly--;
            System.out.printf(" roomInBelly = %s%n", roomInBelly);
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }
    
/**
Consider the following segment of code:

int x = 2;
int y = 5;
while(x < 10)
y++;

You may notice one glaring problem with this statement: it will never end! The boolean
expression that is evaluated prior to each loop iteration is never modifi ed, so the expression
(x < 10) will always evaluate to true. The result is that the loop will never end, creating
what is commonly referred to as an infi nite loop.
* 
Infi nite loops are something you should be aware of any time you create a loop in your
application. You should be absolutely certain that the loop will eventually terminate
under some condition. First, make sure the loop variable is modifi ed. Then, ensure that
the termination condition will be eventually reached in all circumstances. As you’ll see
in the upcoming section “Understanding Advanced Flow Control,” a loop may also exit
under other conditions such as a break statement.
 */
    
}
