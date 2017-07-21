/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p094_review_questions;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P094_02_DataTypes {
/**
What data type (or types) will allow the following code snippet to compile? (Choose all that
apply)

byte x = 5;
byte y = 10;
_____ z = x + y;

A. int
B. long
C. boolean
D. double
E. short
F. byte
 */
    
/*
 * A. B. D. 
 */

    
    
    public static void main(String[] args) {
        
        byte x = 5;
        byte y = 10;
        
        A:{
            int z = x + y;
        }
        B:{
            long z = x + y;
        }
        C:{
//            boolean z = x + y; // DOESN'T COMPILE - INCOMPATIBLE TYPES - INT CANNOT BE CONVERTED TO BOOLEAN
        }
        D:{
            double z = x + y;
        }
        E:{
//            short  z = x + y; // DOESN'T COMPILE - INCOMPATIBLE TYPES - LOOSY CONVERTION FROM INT TO SHORT
           short  z = (short) (x + y); 
        }
        F:{
//            byte z = x + y; // DOESN'T COMPILE - INCOMPATIBLE TYPES - LOOSY CONVERTION FROM INT TO BYTE
            byte z = (byte) (x + y);
        }
    }
}
