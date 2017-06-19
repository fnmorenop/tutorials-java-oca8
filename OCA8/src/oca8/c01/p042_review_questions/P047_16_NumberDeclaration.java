/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * Given the following class, which of the following lines of code can replace
 * INSERT CODE HERE to make the code compile? (Choose all that apply) 
 * 
 * public class Price { 
 *  public void admission() { 
 *      INSERT CODE HERE
 *      System.out.println(amount); 
 * } } 
 * 
 * A. int amount = 9L; 
 * B. int amount = 0b101; 
 * C. int amount = 0xE; 
 * D. double amount = 0xE; 
 * E. double amount = 1_2_.0_0; 
 * F. int amount = 1_2_; 
 * G. None of the above.
 */
/**
 * B. C. D.
 */

class Price {

    public void admission() {
        // INSERT CODE HERE
        
//        int amount = 9L; // LOOSY CONVERSION FROM LONG TO INT
//        int amount = 0b101; // VALID
//        int amount = 0xE; // VALID
//        int amount = 1_2_; // ILLEGAL UNDERSCORE
        
//        int amount = Integer.valueOf("101", 2);
//        
//        System.out.printf("%nINT amount = %s%n", Integer.toString(amount));
//        System.out.printf("%nBINARY amount = 0b%s%n", Integer.toBinaryString(amount));
//        System.out.printf("%nHEX amount = 0x%s%n", Integer.toHexString(amount));
        
//        double amount = 0xE; // VALID
//        double amount = 1_2_.0_0; // ILLEGAL UNDERSCORE
        
//        double amount = Double.valueOf("25.983");
//        double amount = Double.valueOf("0xe");
        double amount = 12;
        
        System.out.printf("%nDouble amount = %s%n", Double.toString(amount));
        System.out.printf("%nHEX amount = %s%n", Double.toHexString(amount));
        System.out.printf("%nString.valueOf amount = %s%n", String.valueOf(amount));
    }
}

public class P047_16_NumberDeclaration {
    
    public static void main(String[] args) {
        Price price = new Price();
        price.admission();
    }
}
