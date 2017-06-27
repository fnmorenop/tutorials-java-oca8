/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p060_using_additional_binary_operators;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P063_RelationalOperators {
    public static void main(String[] args) {
        String message;
/**
We now move on to relational operators, which compare two expressions and return a
boolean value. The first four relational operators (see Table 2.3) are applied to numeric
primitive data types only. If the two numeric operands are not of the same data type, the
smaller one is promoted in the manner as previously discussed.
 
TABLE 2. 3 Relational operators

    <       Strictly less than
    <=      Less than or equal to
    >       Strictly greater than
    >=      Greater than or equal to
    
Let’s look at examples of these operators in action:

int x = 10, y = 20, z = 10;
System.out.println(x < y); // Outputs true
System.out.println(x <= y); // Outputs true
System.out.println(x >= z); // Outputs true
System.out.println(x > z); // Outputs false
 */
        {
            message = "---- RELATIONAL OPERATORS ----";
            System.out.printf("%n %50s%n", message);
            
            int intValue = 10;
            System.out.printf("%n intValue = %d%n", intValue);
            
            long longValue = 20;
            System.out.printf(" longValue = %d%n", longValue);
            
            double doubleValue = 10;
            System.out.printf(" doubleValue = %.2f%n", doubleValue);
            
            boolean intValueLTLongValue = intValue < longValue;
            System.out.printf(" intValueLTLongValue = %b%n", intValueLTLongValue); // Outputs true
            
            boolean intValueLELongValue = intValue <= longValue;
            System.out.printf(" intValueLELongValue = %b%n", intValueLELongValue); // Outputs true
            
            boolean intValueGEDoubleValue = intValue >= doubleValue;
            System.out.printf(" intValueGEDoubleValue = %b%n", intValueGEDoubleValue); // Outputs true
            
            boolean intValueGTDoubleValue = intValue > doubleValue;
            System.out.printf(" intValueGTDoubleValue = %b%n", intValueGTDoubleValue); // Outputs false
        }
/**
Notice that the last example outputs false, because although x and z are the same
value, x is not strictly greater than z.
 */
        
/**
The fifth relational operator (Table 2.4) is applied to object references and classes or
interfaces.

TABLE 2. 4 Relational instanceof operator

a instanceof b      True if the reference that a points to is an instance of
                    a class, subclass, or class that implements a particular
                    interface, as named in b

The instanceof operator, while useful for determining whether an arbitrary object is a
member of a particular class or interface, is out of scope for the OCA exam.
 */
    }
}
