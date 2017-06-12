/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p031_variable_scope;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class LocalVariableScope {

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
        /**
         * There are two local variables in this method. bitesOfCheese is
         * declared inside the method. piecesOfCheese is called a method
         * parameter. It is also local to the method. Both of these variables
         * are said to have a scope local to the method. This means they cannot
         * be used outside the method.
         */
        System.out.printf("%n eat: piecesOfCheese = %1$d%n", piecesOfCheese);
        System.out.printf("eat: bitesOfCheese = %d%n", bitesOfCheese);
    }

    /**
     * Local variables can never have a scope larger than the method they are
     * defined in. However, they can have a smaller scope.
     */
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            System.out.printf("%n eatIfHungry.if: bitesOfCheese = %d%n", bitesOfCheese);
        } // bitesOfCheese goes out of scope here
        
//        System.out.printf("%n eatIfHungry: bitesOfCheese = %d%n", bitesOfCheese); // DOES NOT COMPILE

        /**
         * hungry has a scope of the entire method. bitesOfCheese has a smaller
         * scope. It is only available for use in the if statement because it is
         * declared inside of it. When you see a set of braces ({ }) in the
         * code, it means you have entered a new block of code. Each block of
         * code has its own scope. When there are multiple blocks, you match
         * them from the inside out. In our case, the if statement block begins
         * at line 30 and ends at line 32. The method’s block begins at line 29
         * and ends at line 50. Since bitesOfCheese is declared in such a block,
         * the scope is limited to that block. When the compiler gets to line
         * 34, it complains that it doesn't know anything about this
         * bitesOfCheese thing and gives an error: bitesOfCheese cannot be
         * resolved to a variable
         */
    }
    
    /**
     * Remember that blocks can contain other blocks. These smaller contained
     * blocks can reference variables defined in the larger scoped blocks, but
     * not vice versa.
     */
    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                final boolean teenyBit = true;
                System.out.printf("%n eatIfHungry2.if.{}: teenyBit = %b%n", teenyBit); 
                System.out.printf("eatIfHungry2.if.{}: bitesOfCheese = %d%n", bitesOfCheese); 
                System.out.printf("eatIfHungry2.if.{}: hungry = %b%n", hungry);
                hungry = !hungry;
            }
//            System.out.printf("%n eatIfHungry2.if: teenyBit = %b%n", teenyBit);  // DOES NOT COMPILE
            System.out.printf("eatIfHungry2.if: bitesOfCheese = %d%n", bitesOfCheese); 
            System.out.printf("eatIfHungry2.if: hungry = %b%n", hungry);
        } else {
            System.out.println("");
        }
//        System.out.printf("%n eatIfHungry2: teenyBit = %b%n", teenyBit);  // DOES NOT COMPILE
//        System.out.printf("%n eatIfHungry2: bitesOfCheese = %d%n", bitesOfCheese);  // DOES NOT COMPILE
        System.out.printf("eatIfHungry2: hungry = %b%n", hungry);
    }
    
    /**
     * The exam may attempt to trick you with questions on scope. You'll
     * probably see a question that appears to be about something complex and
     * fails to compile because one of the variables is out of scope.
     */
    
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
                System.out.printf("%n eatMore.if.while: amountEaten = %d%n", amountEaten);
                System.out.printf("eatMore.if.while: timeToEat = %b%n", timeToEat);
                System.out.printf("eatMore.if.while: roomInBelly = %d%n", roomInBelly);
                System.out.printf("eatMore.if.while: amountOfFood = %d%n", amountOfFood);
                System.out.printf("eatMore.if.while: hungry = %b%n", hungry);
            }
//            System.out.printf("eatMore.if.while: amountEaten = %d%n", amountEaten);  // DOES NOT COMPILE
            System.out.printf("eatMore.if: timeToEat = %b%n", timeToEat);
            System.out.printf("eatMore.if: roomInBelly = %d%n", roomInBelly);
            System.out.printf("eatMore.if: amountOfFood = %d%n", amountOfFood);
            System.out.printf("eatMore.if: hungry = %b%n", hungry);
        } else {
            System.out.println("");
        }
//        System.out.printf("eatMore: amountEaten = %d%n", amountEaten);  // DOES NOT COMPILE
//        System.out.printf("eatMore: timeToEat = %b%n", timeToEat);  // DOES NOT COMPILE
        System.out.printf("eatMore: roomInBelly = %d%n", roomInBelly);
        System.out.printf("eatMore: amountOfFood = %d%n", amountOfFood);
        System.out.printf("eatMore: hungry = %b%n", hungry);
        
        /**
         * The first step in figuring out the scope is to identify the blocks of
         * code. In this case, there are three blocks. You can tell this because
         * there are three sets of braces. Starting from the innermost set, we
         * can see where the while loop’s block starts and ends. Repeat this as
         * we go out for the if statement block and method block.
         */
        
        /**
         * Line         First line in block         Last line in block 
         * 
         * while        91                          100
         * if           89                          106
         * Method       87                          130
         */
    }
    
    public static void main(String[] args) {
        LocalVariableScope vs = new LocalVariableScope();
        final int PIECE_OF_CHEESE = 4;
        final boolean EAT_IF_HUNGRY = true;
        
        vs.eat(PIECE_OF_CHEESE);
        vs.eatIfHungry(EAT_IF_HUNGRY);
        vs.eatIfHungry2(EAT_IF_HUNGRY);
        vs.eatIfHungry(!EAT_IF_HUNGRY);
        vs.eatIfHungry2(!EAT_IF_HUNGRY);
        vs.eatMore(EAT_IF_HUNGRY, PIECE_OF_CHEESE);
        vs.eatMore(!EAT_IF_HUNGRY, PIECE_OF_CHEESE);
    }
}
