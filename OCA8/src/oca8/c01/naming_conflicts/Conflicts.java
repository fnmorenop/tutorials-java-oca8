/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.naming_conflicts;

 
// import java.util.*;
// import java.sql.*; // DOES NOT COMPILE
/** 
 * When the class is found in multiple packages, 
 * Java gives you the compiler error: The type Date is ambiguous
 */


// import java.util.Date;
// import java.sql.*;
/**
 * Ah, now it works. If you explicitly import a class name, 
 * it takes precedence over any wildcards present. 
 * Java thinks, “Okay! The programmer really wants me to assume use of
 * the java.util.Date class.
 */


// import java.util.Date;
// import java.sql.Date;
/**
 * Java is smart enough to detect that this code is no good. 
 * As a programmer, you’ve claimed to explicitly want the 
 * default to be both the java.util.Date and java.sql.Date
 * implementations. Because there can’t be two defaults, 
 * the compiler tells you: The import java.sql.Date 
 * collides with another import statement
 */

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Conflicts {
    //Date date;
    // some more code
    java.util.Date date;
    java.sql.Date sqlDate;
}
