/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p030_instance_and_class_variables;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class InstanceAndClassVariables {
    /**
     * Variables that are not local variables are known as instance variables or
     * class variables. Instance variables are also called fields. Class 
     * variables are shared across multiple objects. You can tell a variable is
     * a class variable because it has the keyword static before it.
     * 
     * Instance and class variables do not require you to initialize them. As 
     * soon as you declare these variables, they are given a default value. To 
     * make this easier, remember that the compiler doesn't know what value to 
     * use and so wants the simplest type it can give the value: null for an 
     * object and 0/false for a primitive.
     * 
     * Variable type                                Default initialization value
     * 
     * boolean                                      false
     * byte, short, int, long                       0 (in the type’s bit-length)
     * float, double                                0.0 (in the type’s bit-length)
     * char                                         '\u0000' (NUL)
     * All object references (everything else)      null
     */
    Object instanceVariable, field;
    static Object classVariable;
    
    boolean booleanInstanceVariable;
    byte byteInstanceVariable;
    short shortInstanceVariable;
    int intInstanceVariable;
    
    static long longClassVariable;
    static float floatClassVariable;
    static double doubleClassVariable;
    
    char charClassVariable;
    
    public static void main(String[] args) {
        InstanceAndClassVariables instanceAndClassVariables = 
                new InstanceAndClassVariables();
        
        System.out.printf("%n instanceAndClassVariables.instanceVariable = %s%n",
                instanceAndClassVariables.instanceVariable);
        System.out.printf("%n instanceAndClassVariables.field = %s%n",
                instanceAndClassVariables.field);
        System.out.printf("%n InstanceAndClassVariables.classVariable = %s%n",
                InstanceAndClassVariables.classVariable);
        
        System.out.printf("%n instanceAndClassVariables.booleanInstanceVariable = %b%n",
                instanceAndClassVariables.booleanInstanceVariable);
        System.out.printf("%n instanceAndClassVariables.byteInstanceVariable = %d%n",
                instanceAndClassVariables.byteInstanceVariable);
        System.out.printf("%n instanceAndClassVariables.shortInstanceVariable = %d%n",
                instanceAndClassVariables.shortInstanceVariable);
        System.out.printf("%n instanceAndClassVariables.intInstanceVariable = %d%n",
                instanceAndClassVariables.intInstanceVariable);
        
        System.out.printf("%n InstanceAndClassVariables.longClassVariable = %s%n",
                InstanceAndClassVariables.longClassVariable);
        System.out.printf("%n InstanceAndClassVariables.floatClassVariable = %s%n",
                InstanceAndClassVariables.floatClassVariable);
        System.out.printf("%n InstanceAndClassVariables.doubleClassVariable = %s%n",
                InstanceAndClassVariables.doubleClassVariable);
        
        System.out.printf("%n instanceAndClassVariables.charClassVariable = %c%n",
                instanceAndClassVariables.charClassVariable);
    }
}
