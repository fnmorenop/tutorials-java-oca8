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
public class P072_SupportedDataTypes {
    public static void main(String[] args) {
        String message;
        
/**
As shown in Figure 2.4, a switch statement has a target variable that is not evaluated until
runtime. Prior to Java 5.0, this variable could only be int values or those values that could
be promoted to int, specifically byte, short, char, or int. When enum was added in Java
5.0, support was added to switch statements to support enum values. In Java 7, switch
statements were further updated to allow matching on String values. Finally, the switch
statement also supports any of the primitive numeric wrapper classes, such as Byte, Short,
Character, or Integer.

Data types supported by switch statements include the following:
■ int and Integer
■ byte and Byte
■ short and Short
■ char and Character
■ int and Integer
■ String
■ enum values
For the exam, we recommend you memorize this list. Note that boolean and long, and
their associated wrapper classes, are not supported by switch statements.
 */
    }
}
