/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p010_wildcards;

import java.util.*; // imports java.util.Random among other things
/**
 * You might think that including so many classes slows down your program, but it doesn’t. The
 * compiler figures out what’s actually needed. Which approach you choose is personal preference.
 */
/**
 *
 * @author fabio.moreno.dlbi
 */
public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random(); 
        System.out.println(r.nextInt(10));
    }
}
