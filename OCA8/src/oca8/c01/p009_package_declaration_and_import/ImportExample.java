/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p009_package_declaration_and_import;

import java.util.Random; // import tells us where to find Random

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
