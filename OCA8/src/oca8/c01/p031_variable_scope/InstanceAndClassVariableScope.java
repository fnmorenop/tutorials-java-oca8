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
public class InstanceAndClassVariableScope {
    /**
     *  The rule for class (static) variables is even easier: they go into scope
     * when declared like the other variables types. However, they stay in scope
     * for the entire life of the program.
     */
    static int classVariable_maxLength = 5;
    
    /**
     * The rule for instance variables is easier: they are available as soon as
     * they are defined and last for the entire lifetime of the object itself.
     */
    int instanceVariable_Length = 2;
    
    public void grow(int inches) {
        System.out.printf("%ngrow: classVariable_maxLength = %d%n", classVariable_maxLength);
        System.out.printf("grow: instanceVariable_Length = %d%n", instanceVariable_Length);
        System.out.printf("grow: inches = %d%n", inches);
//        System.out.printf("%n newSize = %d%n", newSize); // DON'T COMPILE
        System.out.printf("grow: instanceVariable_Length[%d] < classVariable_maxLength[%d] = %b%n", 
                instanceVariable_Length, classVariable_maxLength, 
                instanceVariable_Length < classVariable_maxLength);
        if (instanceVariable_Length < classVariable_maxLength) {
            int newSize = instanceVariable_Length + inches;
            instanceVariable_Length = newSize;

            System.out.printf("%ngrow.if: classVariable_maxLength = %d%n", classVariable_maxLength);
            System.out.printf("grow.if: instanceVariable_Length = %d%n", instanceVariable_Length);
            System.out.printf("grow.if: inches = %d%n", inches);
            System.out.printf("grow.if: newSize = %d%n", newSize);
        }
        System.out.printf("%ngrow-f: classVariable_maxLength = %d%n", classVariable_maxLength);
        System.out.printf("grow-f: instanceVariable_Length = %d%n", instanceVariable_Length);
        System.out.printf("grow-f: inches = %d%n", inches);
//        System.out.printf("%n newSize = %d%n", newSize); // DON'T COMPILE
    }
    
    /**
     * In this class, we have one class variable (classVariable_maxLength), one
     * instance variable (instanceVariable_Length), and two local variables
     * (inches and newSize.) classVariable_maxLength is a class variable because
     * it has the static keyword in its declaration. classVariable_maxLength
     * goes into scope on line 18 where it is declared. It stays in scope until
     * the program ends. instanceVariable_Length goes into scope on line 24
     * where it is declared. It stays in scope as long as this Mouse object
     * exists. inches goes into scope where it is declared on line 26. It goes
     * out of scope at the end of the method on line 44. newSize goes into scope
     * where it is declared on line 32. Since it is defined inside the if
     * statement block, it goes out of scope when that block ends on line 39.
     * Got all that? Let’s review the rules on scope:
     *
     * ■ Local variables—in scope from declaration to end of block
     * ■ Instance variables—in scope from declaration until object garbage 
     * collected
     * ■ Class variables—in scope from declaration until program ends
     */
    
    public static void main(String[] args) {
        InstanceAndClassVariableScope icvs = new InstanceAndClassVariableScope();
        final int INCHES_3 = 3;
        final int INCHES_2 = 2;
        final int INCHES_4 = 4;
        {
            System.out.println("0------- Class Instance ---------");
            System.out.printf("%n InstanceAndClassVariableScope.classVariable_maxLength = %d%n",
                    InstanceAndClassVariableScope.classVariable_maxLength);
        }
        {
            System.out.println("1------- add 3 inches ---------");
            icvs.grow(INCHES_3);
        }
        {
            System.out.println("2------- add 2 inches ---------");
            icvs.grow(INCHES_2);
        }
        {
            System.out.println("3------- add 4 inches ---------");
            icvs.grow(INCHES_4);
        }
        {
            System.out.println("4------- modify instanceVariable_Length ---------");

            System.out.printf("%n InstanceAndClassVariableScope.classVariable_maxLength = %d%n",
                    InstanceAndClassVariableScope.classVariable_maxLength);
            System.out.printf("%n icvs.instanceVariable_Length = %d%n",
                    icvs.instanceVariable_Length);

            icvs.instanceVariable_Length = INCHES_4;
            System.out.printf("%n icvs.instanceVariable_Length = %d%n",
                    icvs.instanceVariable_Length);

            icvs.grow(INCHES_4);
        }
        {
            System.out.println("5------- add 4 inches ---------");
            icvs.grow(INCHES_4);
        }
        {
            System.out.println("6------- modify classVariable_maxLength ---------");

            System.out.printf("%n InstanceAndClassVariableScope.classVariable_maxLength = %d%n",
                    InstanceAndClassVariableScope.classVariable_maxLength);
            System.out.printf("%n icvs.instanceVariable_Length = %d%n",
                    icvs.instanceVariable_Length);

            InstanceAndClassVariableScope.classVariable_maxLength *= INCHES_2;
            System.out.printf("%n InstanceAndClassVariableScope.classVariable_maxLength = %d%n",
                    InstanceAndClassVariableScope.classVariable_maxLength);

            icvs.grow(INCHES_4);
        }
        {
            System.out.println("7------- add 4 inches ---------");
            icvs.grow(INCHES_4);
        }
        {
            System.out.printf("%n8------- icvs = null --------- %n" );
            icvs = null;
            System.out.printf(" icvs = %s%n", icvs);
//            System.out.printf(" icvs.instanceVariable_Length = %d%n", icvs.instanceVariable_Length);  // NullPointerException
            System.out.printf(" icvs.instanceVariable_Length = %s%n", "NullPointerException");
            System.out.printf(" InstanceAndClassVariableScope.classVariable_maxLength = %d%n", 
                    InstanceAndClassVariableScope.classVariable_maxLength);
        }
        {
            System.out.printf("%n9------- icvs = new InstanceAndClassVariableScope(); --------- %n" );
            icvs = new InstanceAndClassVariableScope();
            System.out.printf(" icvs = %s%n", icvs);
            System.out.printf(" icvs.instanceVariable_Length = %d%n", icvs.instanceVariable_Length); 
            System.out.printf(" InstanceAndClassVariableScope.classVariable_maxLength = %d%n", 
                    InstanceAndClassVariableScope.classVariable_maxLength);
            icvs.grow(INCHES_4*INCHES_4);
        }
        {
            System.out.printf("%n10------- add 2 inches --------- %n" );
            icvs.grow(INCHES_2);
        }
    }
}
