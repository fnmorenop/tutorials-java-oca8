/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p042_review_questions;

import oca8.c01.p042_review_questions.q06_aquarium.*;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P044_06_ClassImport {
    /**
     * Given the following classes, what is the maximum number of imports that
     * can be removed and have the code still compile? 
     * 
     * package aquarium; 
     * public class Water { } 
     * 
     * package aquarium; 
     * import java.lang.*; 
     * import java.lang.System; 
     * import aquarium.Water; 
     * import aquarium.*; 
     * public class Tank { 
     *  public void print(Water water) 
     *      { System.out.println(water); } } 
     * 
     * A. 0 
     * B. 1 
     * C. 2 
     * D. 3 
     * E. 4 
     * F. Does not compile.
     */
    /**
     * E.
     */
    public static void main(String[] args) {
        Tank tank = new Tank();
        Water water = new Water();
        tank.print(water);
    }
}
