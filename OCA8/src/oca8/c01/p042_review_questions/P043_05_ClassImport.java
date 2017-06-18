/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p042_review_questions;

import oca8.c01.p042_review_questions.q05_aquarium.jellies.*;
import oca8.c01.p042_review_questions.q05_visitor.*;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P043_05_ClassImport {
    /**
     * Given the following classes, which of the following can independently
     * replace INSERT IMPORTS HERE to make the code compile? (Choose all that
     * apply) 
     * 
     * package aquarium; 
     * public class Tank { } 
     * 
     * package aquarium.jellies;
     * public class Jelly { } 
     * 
     * package visitor; 
     * INSERT IMPORTS HERE 
     * public class
     * AquariumVisitor { 
     *  public void admire(Jelly jelly) { } } 
     * 
     * A. import aquarium.*; 
     * B. import aquarium.*.Jelly; 
     * C. import aquarium.jellies.Jelly;
     * D. import aquarium.jellies.*; 
     * E. import aquarium.jellies.Jelly.*; 
     * F. None of these can make the code compile.
     */
    /**
     * C. D.
     */
    public static void main(String[] args) {
        AquariumVisitor av = new AquariumVisitor();
        Jelly jelly = new Jelly();
        av.admire(jelly);
    }
}
