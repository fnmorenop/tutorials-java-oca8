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
public class P042_03_TypesAndDeference {
    public static void main(String[] args) {
        /**
         * Which of the following are true? (Choose all that apply)
         * 
         * 4: short numPets = 5;
         * 5: int numGrains = 5.6;
         * 6: String name = "Scruffy";
         * 7: numPets.length();
         * 8: numGrains.length();
         * 9: name.length();
         * 
         * A. Line 4 generates a compiler error.
         * B. Line 5 generates a compiler error.
         * C. Line 6 generates a compiler error.
         * D. Line 7 generates a compiler error.
         * E. Line 8 generates a compiler error.
         * F. Line 9 generates a compiler error.
         * G. The code compiles as is.
         */
        /**
         * B. D. E. 
         */
        short numPets = 5;
//        int numGrains = 5.6; // INCOMPATIBLE TYPES: LOOSY CONVERSION
        String name = "Scruffy";
//        numPets.length(); // SHORT CAN'T BE DEFERENCED    
//        numGrains.length(); // int CAN'T BE DEFERENCED
        name.length();
    }
}
