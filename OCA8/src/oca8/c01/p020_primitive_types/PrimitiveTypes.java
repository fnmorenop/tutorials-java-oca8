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
public class PrimitiveTypes {
    /**
     * Keyword      Type                            Example
     * 
     * boolean      true or false                   true
     * byte         8-bit integral value            123
     * short        16-bit integral value           123
     * int          32-bit integral value           123
     * long         64-bit integral value           123
     * float        32-bit floating-point value     123.45f
     * double       64-bit floating-point value     123.456
     * char         16-bit Unicode value            'a'
     */
    
    /**
     * ■ float and double are used for floating-point (decimal) 
     * values.
     * ■ A float requires the letter f following the number so 
     * Java knows it is a float.
     * ■ byte, short, int, and long are used for numbers without
     * decimal points.
     * ■ Each numeric type uses twice as many bits as the smaller
     * similar type. For example, short uses twice as many bits 
     * as byte does.
     */
    
    public static void main(String[] args) {
        /**
         * boolean      true or false 
         * 
         * Boolean TRUE value: true
         * Boolean FALSE value: false
         */
        System.out.printf("Boolean TRUE value: %b%n", Boolean.TRUE);
        System.out.printf("Boolean FALSE value: %b%n", Boolean.FALSE);
        System.out.println("---");
        
        /**
         * byte         8-bit integral value
         * 
         * Byte MAX value: 127
         * Byte MIN value: -128
         */
        System.out.printf("Byte MAX value: %,d%n", Byte.MAX_VALUE);
        System.out.printf("Byte MIN value: %,d%n", Byte.MIN_VALUE);
        System.out.println("---");
        
        /**
         * short        16-bit integral value
         * 
         * Short MAX value: 32.767
         * Short MIN value: -32.768
         */
        System.out.printf("Short MAX value: %,d%n", Short.MAX_VALUE);
        System.out.printf("Short MIN value: %,d%n", Short.MIN_VALUE);
        System.out.println("---");
        
        /**
         * int          32-bit integral value 
         * 
         * Integer MAX value: 2.147.483.647 -> 2.15 X 10^9 -> Mil millones
         * Integer MIN value: -2.147.483.648 -> -2.15 X 10^9
         */
        System.out.printf("Integer MAX value: %,d%n", Integer.MAX_VALUE);
        System.out.printf("Integer MIN value: %,d%n", Integer.MIN_VALUE);
        System.out.println("---");
        
        /**
         * long         64-bit integral value
         * 
         * Long MAX value: 9.223.372.036.854.775.807 -> 9.2 X 10^18 -> Trillon
         * Long MIN value: -9.223.372.036.854.775.808 -> -9.2 X 10^18
         */
        System.out.printf("Long MAX value: %,d%n", Long.MAX_VALUE);
        System.out.printf("Long MIN value: %,d%n", Long.MIN_VALUE);
        System.out.println("---");
        
        /**
         * float        32-bit floating-point value
         * 
         * Float MAX value: 340.282.346.638.528.860.000.000.000.000.000.000.000,000000
         * Float MIN value: 0,000000
         */
        System.out.printf("Float MAX value: %,f%n", Float.MAX_VALUE);
        System.out.printf("Float MIN value: %,#f%n", Float.MIN_VALUE);
        System.out.println("---");
        
        /**
         * double       64-bit floating-point value
         * 
         * Double MAX value: 179.769.313.486.231.570.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000,000000
         * Double MIN value: 0,000000
         */
        System.out.printf("Double MAX value: %,f%n", Double.MAX_VALUE);
        System.out.printf("Double MIN value: %,#f%n", Double.MIN_VALUE);
        System.out.println("---");
        
        /**
         * char         16-bit Unicode value
         * 
         * Double MAX value: 179.769.313.486.231.570.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000.000,000000
         * Double MIN value: 0,000000
         */
        System.out.printf("Character MAX value: %c%n", Character.MAX_VALUE);
        System.out.printf("Character MIN value: %c%n", Character.MIN_VALUE);
        System.out.println("---");
    }
}
