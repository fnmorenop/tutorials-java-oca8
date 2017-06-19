/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * Which of the following are true? (Choose all that apply) 
 * 
 * A. An instance variable of type boolean defaults to false. 
 * B. An instance variable of type boolean defaults to true. 
 * C. An instance variable of type boolean defaults to null. 
 * D. An instance variable of type int defaults to 0. 
 * E. An instance variable of type int defaults to 0.0. 
 * F. An instance variable of type int defaults to null. 
 * G. None of the above.
 */
/**
 * A. D.
 */
public class P046_13_InstanceTypesDefaults {
    
    boolean booleanInstanceType;
    int intInstanceType;
    
    {
        System.out.printf("%nDefault booleanInstanceType = %s%n", 
                Boolean.toString(booleanInstanceType));
        System.out.printf("%nDefault intInstanceType = %s%n", 
                Integer.toString(intInstanceType));
    }

    public static void main(String[] args) {

        P046_13_InstanceTypesDefaults p046_13_InstanceTypesDefaults = 
                new P046_13_InstanceTypesDefaults();
    }
}
