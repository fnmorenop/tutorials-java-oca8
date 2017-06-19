/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * Which of the following are true? (Choose all that apply) 
 * 
 * A. An instance variable of type double defaults to null. 
 * B. An instance variable of type int defaults to null. 
 * C. An instance variable of type String defaults to null. 
 * D. An instance variable of type double defaults to 0.0. 
 * E. An instance variable of type int defaults to 0.0. 
 * F. An instance variable of type String defaults to 0.0. 
 * G. None of the above.
 */
/**
 * C. D.
 */
public class P046_11_InstanceTypesDefaults {
    
    double doubleInstanceType;
    int intInstanceType;
    String stringInstanceType;
    
    {
        System.out.printf("%nDefault doubleInstanceType = %s%n", Double.toString(doubleInstanceType));
        System.out.printf("%nDefault intInstanceType = %s%n", Integer.toString(intInstanceType));
        System.out.printf("%nDefault stringInstanceType = %s%n", stringInstanceType);
    }
    
    public static void main(String[] args) {
        P046_11_InstanceTypesDefaults itd = new P046_11_InstanceTypesDefaults();
    }
}
