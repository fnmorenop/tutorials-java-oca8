/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p018_1_reading_and_writing_object_fields;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Name {
    
    /**
     * You can even read and write fields directly
     * on the line declaring them:
     */
    String first = "Theodore";
    String last = "Moose";
    String full = first + last;
    
    public static void main(String[] args) {
        Name name = new Name();
        System.out.println("full: "+name.full);
    }
}
