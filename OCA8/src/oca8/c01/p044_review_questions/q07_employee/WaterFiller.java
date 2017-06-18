/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p044_review_questions.q07_employee;

/**
 *
 * @author fabio.moreno.dlbi
 */

// COMPILES
import oca8.c01.p044_review_questions.q07_aquarium.*;

// COMPILES
//import oca8.c01.p044_review_questions.q07_aquarium.Water;
//import oca8.c01.p044_review_questions.q07_aquarium.jellies.*;

// COMPILES
//import oca8.c01.p044_review_questions.q07_aquarium.*;
//import oca8.c01.p044_review_questions.q07_aquarium.jellies.Water;

// DOENS'T COMPILE - AMBIGUOUS REFERENCE
//import oca8.c01.p044_review_questions.q07_aquarium.*; 
//import oca8.c01.p044_review_questions.q07_aquarium.jellies.*;

// DOENS'T COMPILE - TYPE ALREADY DEFINED
//import oca8.c01.p044_review_questions.q07_aquarium.Water;
//import oca8.c01.p044_review_questions.q07_aquarium.jellies.Water;

public class WaterFiller {

    Water water = new Water();
}
