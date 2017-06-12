//import java.util.*; // DOES NOT COMPILE
//package oca8.c01.p034_ordering_elements_in_a_class; // DOES NOT COMPILE
//String name; // DOES NOT COMPILE

package oca8.c01.p034_ordering_elements_in_a_class;
public class BadStructure {
    
}

/**
 * There are two problems here. One is that the package and import statements
 * are reversed. Though both are optional, package must come before import if
 * present. The other issue is that a field attempts declaration outside a
 * class. This is not allowed. Fields and methods must be within a class.
 *
 * Got all that? Think of the acronym PIC (picture): package, import, and class.
 * Fields and methods are easier to remember because they merely have to be
 * inside of a class.
 */
