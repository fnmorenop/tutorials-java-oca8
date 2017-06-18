/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p042_review_questions;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P043_04_Scope {
    /**
     * Given the following class, which of the following is true? (Choose all
     * that apply) 
     * 
     * 1: public class Snake { 
     * 2: 
     * 3:   public void shed(boolean time) { 
     * 4:
     * 5:       if (time) { 
     * 6: 
     * 7:       } 
     * 8:       System.out.println(result); 
     * 9: 
     * 10:  } 
     * 11:}
     * 
     * A. If String result = "done"; is inserted on line 2, the code will
     * compile. 
     * B. If String result = "done"; is inserted on line 4, the code
     * will compile.
     * C. If String result = "done"; is inserted on line 6, the
     * code will compile.
     * D. If String result = "done"; is inserted on line 9,
     * the code will compile. 
     * E. None of the above changes will make the code
     * compile.
     */
    /**
     * A. B.
     */
    
    String result = "done"; //COMPILES
    
    public void shed(boolean time) {
//        String result = "done"; // COMPILES
        if (time) {
//            String result = "done"; // DOENSN'T COMPILES
        }
        System.out.println("THE RESULT: "+result);
//        String result = "done"; // DOENSN'T COMPILES
    }
}
