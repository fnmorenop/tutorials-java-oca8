/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p029_local_variables;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class LocalVariables {
    /**
     * A local variable is a variable defined within a method. Local variables
     * must be initialized before use. They do not have a default value and
     * contain garbage data until initialized. The compiler will not let you
     * read an uninitialized value. For example, the following code generates a
     * compiler error:
     */

    public int notValid() {
        int y = 10;
        int x; // x is declared here
//        int reply = x + y; // DOES NOT COMPILE x not initialized before used
        /**
         * Until x is assigned a value, it cannot appear within an expression,
         * and the compiler will gladly remind you of this rule. The compiler
         * knows your code has control of what happens inside the method and can
         * be expected to initialize values. The compiler is smart enough to
         * recognize variables that have been initialized after their
         * declaration but before they are used.
         */
        x = 3; // and initialized here
        int reply = x + y;
        System.out.printf("%n reply = %d%n", reply);
        return reply;
    }

    /**
     * The compiler is also smart enough to recognize initializations that are
     * more complex. In this example, there are two branches of code. answer is
     * initialized in both of them so the compiler is perfectly happy.
     * onlyOneBranch is only initialized if check happens to be true. The
     * compiler knows there is the possibility for check to be false, resulting
     * in uninitialized code, and gives a compiler error.
     */
    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.printf("%n answer = %d%n", answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE - Uncompilable source code - variable onlyOneBranch might not have been initialized
    }

    public static void main(String[] args) {
        LocalVariables localVariables = new LocalVariables();
        localVariables.notValid();
        localVariables.findAnswer(true);
    }
}
