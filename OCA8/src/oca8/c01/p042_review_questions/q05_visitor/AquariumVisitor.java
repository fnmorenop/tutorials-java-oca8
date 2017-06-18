/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p042_review_questions.q05_visitor;

//import oca8.c01.p042_review_questions.q05_aquarium.*; // DOESN'T MAKE THE CODE COMPILE
//import oca8.c01.p042_review_questions.q05_aquarium.*.Jelly; // BAD IMPORT DECLARATION
import oca8.c01.p042_review_questions.q05_aquarium.jellies.Jelly; // MAKES THE CODE COMPILE
//import oca8.c01.p042_review_questions.q05_aquarium.jellies.*; // MAKES THE CODE COMPILE
//import oca8.c01.p042_review_questions.q05_aquarium.jellies.Jelly.*; // DOESN'T MAKE THE CODE COMPILE

/**
 *
 * @author fabio.moreno.dlbi
 */
public class AquariumVisitor {
    public void admire(Jelly jelly) { }
}
