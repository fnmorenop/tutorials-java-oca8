/*
 * To change this license header, choose License 
 * Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p011_redundant_imports;
/**
* import java.lang.System;
* import java.lang.*;
* are redundant because everything in java.lang 
* is automatically considered to be imported
*/ 
import java.util.Random;
/**
 * import java.util.*;
 * is also redundant in this example because Random 
 * is already imported from java.util.Random.
 * If line 15 wasn’t present, java.util.* wouldn’t be 
 * redundant, though, since it would cover importing Random.
 * /

/**
 *
 * @author fabio.moreno.dlbi
 */
public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random(); // DOES NOT COMPILE without import java.util.Random;
        System.out.println(r.nextInt(10));
    }
}
