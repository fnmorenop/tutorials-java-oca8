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
public class P042_02_VariableScope {
    /**
     * What is the output of the following program?
     * 
     * 1: public class WaterBottle {
     * 2:   private String brand;
     * 3:   private boolean empty;
     * 4:   public static void main(String[] args) {
     * 5:       WaterBottle wb = new WaterBottle();
     * 6:       System.out.print("Empty = " + wb.empty);
     * 7:       System.out.print(", Brand = " + wb.brand);
     * 8: } }
     * 
     * A. Line 6 generates a compiler error.
     * B. Line 7 generates a compiler error.
     * C. There is no output.
     * D. Empty = false, Brand = null
     * E. Empty = false, Brand =
     * F. Empty = null, Brand = null
     */
    /**
     * A. x
     * C.
     */
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        P042_02_VariableScope wb = new P042_02_VariableScope();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}

class TestP042_02_VariableScope{
    public static void main(String[] args) {
        P042_02_VariableScope wb = new P042_02_VariableScope();
//        System.out.print("Empty = " + wb.empty); // empty HAS PRIVATE ACCESS
//        System.out.print(", Brand = " + wb.brand); // brand HAS PRIVATE ACCESS
    }
}