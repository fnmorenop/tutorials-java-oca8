/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p042_review_questions;

import oca8.c01.p044_review_questions.q07_employee.*;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P044_07_ClassImport {
    /**
     * Given the following classes, which of the following snippets can be
     * inserted in place of INSERT IMPORTS HERE and have the code compile?
     * (Choose all that apply) 
     * 
     * package aquarium; 
     * public class Water { 
     *  boolean salty = false; } 
     * 
     * package aquarium.jellies; 
     * public class Water { 
     *  boolean salty = true; } 
     * 
     * package employee; 
     * INSERT IMPORTS HERE 
     * public class WaterFiller { 
     *  Water water; } 
     * 
     * A. import aquarium.*; 
     * B. import aquarium.Water; 
     *    import aquarium.jellies.*; 
     * C. import aquarium.*; 
     *    import aquarium.jellies.Water;
     * D. import aquarium.*; 
     *    import aquarium.jellies.*;
     * E. import aquarium.Water; 
     *    import aquarium.jellies.Water; 
     * F. None of these imports can make the code compile.
     */
    /**
     * A. B. C.
     */
    public static void main(String[] args) {
        WaterFiller wf = new WaterFiller();
        
    }
}
