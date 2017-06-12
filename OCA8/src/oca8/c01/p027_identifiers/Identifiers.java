/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p027_identifiers;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Identifiers {
    public static void main(String[] args) {
        /**
         * It probably comes as no surprise that Java has precise rules 
         * about identifier names. Luckily, the same rules for identifiers
         * apply to anything you are free to name, including variables, 
         * methods, classes, and fields. There are only three rules to 
         * remember for legal identifiers: 
         * 
         * ■ The name must begin with a letter or the symbol $ or _.
         * ■ Subsequent characters may also be numbers.
         * ■ You cannot use the same name as a Java reserved word. As you
         * 
         * might imagine, a reserved word is a keyword that Java has reserved
         * so that you are not allowed to use it. Remember that Java is case 
         * sensitive, so you can use versions of the keywords that only differ
         * in case. Please don’t, though. Don’t worry—you won’t need to memorize
         * the full list of reserved words. The exam will only ask you about 
         * ones you've already learned, such as class. The following is a list 
         * of all the reserved words in Java. const and goto aren't actually 
         * used in Java. They are reserved so that people coming from other 
         * languages don’t use them by accident—and in theory, in case Java 
         * wants to use them one day.
         */
        
        /**
         * abstract     assert          boolean         break           byte
         * case         catch           char            class           const*
         * continue     default         do              double          else
         * enum         extends         false           final           finally
         * float        for             goto*           if              implements
         * import       instanceof      int             interface       long
         * native       new             null            package         private
         * protected    public          return          short           static
         * strictfp     super           switch          synchronized    this
         * throw        throws          transient       true            try
         * void         volatile        while
         */
        
        /**
         * The following examples are legal:
         */
        
        Object okidentifier;
        Object $OK2Identifier;
        Object _alsoOK1d3ntifi3r;
        Object __SStillOkbutKnotsonice$;
        
        /**
         * These examples are not legal:
         */
        
//        Object 3DPointClass; // identifiers cannot begin with a number
//        Object hollywood@vine; // @ is not a letter, digit, $ or _
//        Object *$coffee; // * is not a letter, digit, $ or _
//        Object public; // public is a reserved word
        
        /**
         * Although you can do crazy things with identifier names, you shouldn't.
         * Java has conventions so that code is readable and consistent. This 
         * consistency includes CamelCase. In CamelCase, each word begins with 
         * an uppercase letter. This makes multiple-word variable names easier 
         * to read. Which would you rather read: Thisismyclass name or 
         * ThisIsMyClass name? The exam will mostly use common conventions for 
         * identifiers, but not always. When you see a nonstandard identifier, 
         * be sure to check if it is legal. If not, you get to mark the answer 
         * “does not compile” and skip analyzing everything else in the question.
         */
        
        /**
         * Most Java developers follow these conventions for identifier names:
         * 
         * ■ Method and variables names begin with a lowercase letter followed 
         * by CamelCase.
         * ■ Class names begin with an uppercase letter followed by CamelCase. 
         * Don’t start any identifiers with $. The compiler uses this symbol for
         * some files. Also, know that valid letters in Java are not just 
         * characters in the English alphabet. Java supports the Unicode 
         * character set, so there are more than 45,000 characters that can 
         * start a legal Java identifier. A few hundred more are non-Arabic 
         * numerals that may appear after the first character in a legal 
         * identifier. Luckily, you don’t have to worry about memorizing those 
         * for the exam. If you are in a country that doesn't use the English 
         * alphabet, this is useful to know for a job.
         */
        
        Object ñoño;
        Object çoño;
        Object __;
        Object $;
        Object ă_ă;
        Object œœ;
        Object ƢƢ;
        Object Ʃ;
        Object ƪ;
        Object Ƹ;
        Object π;
        Object Ѭ;
        Object Ѿ = "String Ѿ";
        System.out.printf("%n Ѿ = %s%n", Ѿ);
        Object ぜ = new Object();
        System.out.printf("%n ぜ.hashCode() = %,d%n", ぜ.hashCode());
        Object 益 = 354354354.5635634334;
        System.out.printf("%n 益 = %,.2f%n", 益);
    }
}
