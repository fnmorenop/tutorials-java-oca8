/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p020_primitive_types;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class PrimitiveTypesDeclaring {
    /**
     * When a number is present in the code, it is called a literal. 
     * By default, Java assumes you are defining an int value with a literal.
     */
    
    //literal
    
    // long max = 3123456789; // DOES NOT COMPILE
    /**
     * Java complains the number is out of range. And it is—for an int. 
     * However, we don’t have an int. The solution is to add the character L 
     * to the number:
     */
    long max = 3123456789L; // now Java knows it is a long
    long max2 = 312345678; // This is a valid int value
    
    /**
     * Another way to specify numbers is to change the “base.” When 
     * you learned how to count, you studied the digits 0–9. This 
     * numbering system is called base 10 since there are 10 numbers. 
     * It is also known as the decimal number system. Java allows you 
     * to specify digits in several other formats:
     * ■ octal (digits 0–7), which uses the number 0 as a prefix—for
     * example, 017
     * ■ hexadecimal (digits 0–9 and letters A–F), which uses the 
     * number 0 followed by x or X as a prefix—for example, 0xFF
     * ■ binary (digits 0–1), which uses the number 0 followed by b 
     * or B as a prefix—for example, 0b10
     */
    
    
    public static void main(String... arg){
        
        int decimal = 56;
        int octal = 017;
        int hexadecimal = 0x1F;
        int binary = 0b11;
        
        System.out.print("decimal: ");
        System.out.print(decimal);
        System.out.printf("%n formatted decimal = %,d%n", decimal);
        System.out.println("  -- --");
        
        System.out.print("octal: ");
        System.out.print(octal);
        System.out.printf("%n formatted octal = %o%n", octal);
        System.out.println("  -- --");
        
        System.out.print("hexadecimal: ");
        System.out.print(hexadecimal);
        System.out.printf("%n formatted hexadecimal = 0x%X%n", hexadecimal);
        System.out.println("  -- --");
        
        System.out.print("binary: ");
        System.out.print(binary);
        System.out.printf("%n formatted binary = 0x%X%n", binary);
        System.out.println("  -- --");
        
        /**
         * You can have underscores in numbers to make them easier to read
         */
        
        int million1 = 1000000;
        int million2 = 1_000_000;
        
        System.out.printf("%n million1 = %,d%n", million1);
        System.out.printf("%n million2 = %,d%n", million2);
        
        /**
         * You can add underscores anywhere except at the beginning
         * of a literal, the end of a literal, right before a decimal 
         * point, or right after a decimal point.
         */
        
//        double notAtStart = _1000.00; // DOES NOT COMPILE
//        double notAtEnd = 1000.00_; // DOES NOT COMPILE
//        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_00_0.1_28_9; // this one compiles
        
        System.out.printf("%n annoyingButLegal = %,.2f%n", annoyingButLegal);
    }
}
