package oca8.c01.p034_ordering_elements_in_a_class; // package must be first non-comment

import java.util.*; // import must come after package

public class OrderingElements { // then comes the class
    /**
     * Elements of a class 
     * 
     * 
     * Element                  Example             Required?   Where does it go? 
     * 
     * Package declaration      package abc;        No          First line in the file 
     * Import statements        import java.util.*; No          Immediately after the package 
     * Class declaration        public class C      Yes         Immediately after the import 
     * Field declarations       int value;          No          Anywhere inside a class 
     * Method declarations      void method()       No          Anywhere inside a class
     */
    
    private Date date = new Date(); // fields and methods can go in either order

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    private Calendar cal = Calendar.getInstance(); // another field – they don't need to be together

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }
    
}
