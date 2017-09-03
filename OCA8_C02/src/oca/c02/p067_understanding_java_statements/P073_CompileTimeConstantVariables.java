/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p067_understanding_java_statements;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P073_CompileTimeConstantVariables {
    public static void main(String[] args) {
        String message;
/**
The values in each case statement must be compile-time constant values of the same data
type as the switch value. This means you can use only literals, enum constants, or final
constant variables of the same data type. By final constant, we mean that the variable
must be marked with the final modifier and initialized with a literal value in the same
expression in which it is declared.

Let’s look at a simple example using the day of the week, with 0 for Sunday, 1 for
Monday, and so on:

int dayOfWeek = 5;
switch(dayOfWeek) {
    default:
        System.out.println("Weekday");
        break;
    case 0:
        System.out.println("Sunday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
}

With a value of dayOfWeek of 5, this code will output:

Weekday
 */
        {
            message = "---- SWITCH STATEMENT - COMPILE TIME VARIABLES ----";
            System.out.printf("%n %50s%n", message);
            
            int dayOfWeek = 5;
            switch (dayOfWeek) {
//                System.out.printf("%n dayOfWeek = %s%n", dayOfWeek); // DOESN'T COMPILE - WRONG STATEMENT
                default:
                    System.out.println("Weekday");
                    break;
//                    System.out.printf("%n dayOfWeek = %s%n", dayOfWeek); // DOESN'T COMPILE - UNREACHABLE STATEMENT
                case 0:
                    System.out.println("Sunday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
//                    System.out.printf("%n dayOfWeek = %s%n", dayOfWeek); // DOESN'T COMPILE - UNREACHABLE STATEMENT
            }
            System.out.printf(" outOfSwitch = %s%n", "Already out of switch statement");
        }
/**
The first thing you may notice is that there is a break statement at the end of each case
and default section. We'll discuss break statements in detail when we discuss loops, but
for now all you need to know is that they terminate the switch statement and return flow
control to the enclosing statement. As we'll soon see, if you leave out the break statement,
flow will continue to the next proceeding case or default block automatically.
Another thing you might notice is that the default block is not at the end of the switch
statement. There is no requirement that the case or default statements be in a particular
order, unless you are going to have pathways that reach multiple sections of the switch
block in a single execution.
To illustrate both of the preceding points, consider the following variation:

int dayOfWeek = 5;
switch(dayOfWeek) {
    case 0:
        System.out.println("Sunday");
    default:
        System.out.println("Weekday");
    case 6:
        System.out.println("Saturday");
    break;
}

This code looks a lot like the previous example except two of the break statements have
been removed and the order has been changed. This means that for the given value of day-
OfWeek, 5, the code will jump to the default block and then execute all of the proceeding
case statements in order until it finds a break statement or finishes the structure:

Weekday
Saturday
 */
        {
            message = "---- SWITCH STATEMENT - ORDER AND BREAK ----";
            System.out.printf("%n %50s%n", message);
            
            int dayOfWeek = 5;
            switch (dayOfWeek) {
                case 0:
                    System.out.println("Sunday");
                default:
                    System.out.println("Weekday");
                case 6:
                    System.out.println("Saturday");
                    break; // The break is completely optionally
            }
        }
/**
The order of the case and default statements is now important since placing the
default statement at the end of the switch statement would cause only one word to be
output.

What if the value of dayOfWeek was 6 in this example? Would the default block still be
executed? The output of this example with dayOfWeek set to 6 would be:
 
Saturday

Even though the default block was before the case block, only the case block was executed.
If you recall the definition of the default block, it is only branched to if there is no
matching case value for the switch statement, regardless of its position within the switch
statement.

Finally, if the value of dayOfWeek was 0, all three statements would be output:

Sunday
Weekday
Saturday

Notice that in this last example, the default is executed since there was no break statement
at the end of the preceding case block. While the code will not branch to the default
statement if there is a matching case value within the switch statement, it will execute the
default statement if it encounters it after a case statement for which there is no terminating
break statement.

The exam creators are fond of switch examples that are missing break statements!
When evaluating switch statements on the exam, always consider that multiple branches
may be visited in a single execution.
 */   
        
/**
We conclude our discussion on switch statements by acknowledging that the data type
for case statements must all match the data type of the switch variable. As already discussed,
the case statement value must also be a literal, enum constant, or final constant
variable. For example, given the following switch statement, notice which case statements
will compile and which will not:

private int getSortOrder(String firstName, final String lastName) {
    String middleName = "Patricia";
    final String suffix = "JR";
    int id = 0;
    switch(firstName) {
        case "Test":
            return 52;
        case middleName: // DOES NOT COMPILE
            id = 5;
            break;
        case suffix:
            id = 0;
            break;
        case lastName: // DOES NOT COMPILE
            id = 8;
            break;
        case 5: // DOES NOT COMPILE
            id = 7;
            break;
        case 'J': // DOES NOT COMPILE
            id = 10;
            break;
        case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
            id=15;
            break;
    }
    return id;
}

The first case statement compiles without issue using a String literal and is a good
example of how a return statement, like a break statement, can be used to exit the switch
statement early. The second case statement does not compile because middleName is not a
final variable, despite having a known value at this particular line of execution. The third
case statement compiles without issue because suffix is a final constant variable.

In the fourth case statement, despite lastName being final, it is not constant as it is
passed to the function; therefore, this line does not compile as well. Finally, the last three
case statements don’t compile because none of them have a matching type of String; the
last one is an enum value.
 */
        {
            message = "---- SWITCH STATEMENT - DATA VARIABLE ----";
            System.out.printf("%n %50s%n", message);
            
            String firstName = "Test";
            System.out.printf("%n firstName = %s%n", firstName);
            
            String middleName = "Patricia";
            System.out.printf(" middleName = %s%n", middleName);
            
            final String suffix = "JR";
            System.out.printf(" suffix = %s%n", suffix);
            
            String lastName = "Test";
            System.out.printf(" lastName = %s%n", lastName);
                        
            P073_CompileTimeConstantVariables p = 
                    new P073_CompileTimeConstantVariables();
                        
            System.out.printf(" p.getSortOrder(firstName, \"Test\") = %d%n", 
                    p.getSortOrder(firstName, "TestLast"));
            
            System.out.printf(" p.getSortOrder(middleName, \"Test\") = %d%n", 
                    p.getSortOrder(middleName, "Test"));
            
            System.out.printf(" p.getSortOrder(suffix, \"Test\") = %d%n", 
                    p.getSortOrder(suffix, "Test"));
        }
        
        {
            message = "---- SWITCH STATEMENT - DATA VARIABLE REVIEWED ----";
            System.out.printf("%n %50s%n", message);
            
            String firstName = "Test";
            System.out.printf("%n firstName = %s%n", firstName);
            
            String middleName = "Patricia";
            System.out.printf(" middleName = %s%n", middleName);
            
            final String suffix = "JR";
            System.out.printf(" suffix = %s%n", suffix);
            
            String lastName = "lastName";
            System.out.printf(" lastName = %s%n", lastName);
            
            String case5 = "5";
            System.out.printf(" case5 = %s%n", case5);
            
            String caseJ = "J";
            System.out.printf(" caseJ = %s%n", caseJ);
            
            Character caseJchar = 'J';
            System.out.printf(" caseJchar = %s%n", caseJchar);
            
            String caseWeekOfDay = java.time.DayOfWeek.SUNDAY.toString().toLowerCase();
            System.out.printf(" caseWeekOfDay = %s%n", caseWeekOfDay);
                        
            System.out.printf(" getSortOrderFixed(firstName, \"lastName\") = %d%n", 
                    getSortOrderFixed(firstName, "lastName"));
            
            System.out.printf(" getSortOrderFixed(middleName, \"Test\") = %d%n", 
                    getSortOrderFixed(middleName, "Test"));
            
            System.out.printf(" getSortOrderFixed(suffix, \"Test\") = %d%n", 
                    getSortOrderFixed(suffix, "Test"));
            
            System.out.printf(" getSortOrderFixed(lastName, \"Test\") = %d%n", 
                    getSortOrderFixed(lastName, "Test"));
            
            System.out.printf(" getSortOrderFixed(case5, \"Test\") = %d%n", 
                    getSortOrderFixed(case5, "Test"));
            
            System.out.printf(" getSortOrderFixed(caseJ, \"Test\") = %d%n", 
                    getSortOrderFixed(caseJ, "Test"));
            
            System.out.printf(" getSortOrderFixed(caseJchar.toString(), \"Test\") = %d%n", 
                    getSortOrderFixed(caseJchar.toString(), "Test"));
            
            System.out.printf(" getSortOrderFixed(caseWeekOfDay, \"Test\") = %d%n", 
                    getSortOrderFixed(caseWeekOfDay, "Test"));
        }
    }
    
    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
//            case middleName: // DOES NOT COMPILE - CONSTANT STRING EXPRESSION REQUIRED
//                id = 5;
//                break;
            case suffix:
                id = -10;
                break;
//            case lastName: // DOES NOT COMPILE - CONSTANT STRING EXPRESSION REQUIRED
//                id = 8;
//                break;
//            case 5: // DOES NOT COMPILE - INCOMPATIBLE TYPES - INT TO STRING
//                id = 7;
//                break;
//            case 'J': // DOES NOT COMPILE - INCOMPATIBLE TYPES INT TO STRING
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE - INCOMPATIBLE TYPES - DAYOFWEEK TO STRING
//                id = 15;
//                break;
        }
        return id;
    }
    
    private static int getSortOrderFixed(String firstName, final String lastName) {
        final String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        
//         final String lastNameFinal = lastName; // CASE DOESN'T COMPILE - REFERENCE NOT FINAL NOT LOCAL
//        final String lastNameFinal = "Test"; // CASE DOESN'T COMPILE - CASE DUPLICATED
        final String lastNameFinal = "lastName";
        final String dayOfWeekLiteral = "sunday";
//        final String dayOfWeek = java.time.DayOfWeek.SUNDAY.toString(); // CASE DOESN'T COMPILE - NOT LITERAL
        final String dayOfWeek = dayOfWeekLiteral;
        
        switch (firstName) {
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE - CONSTANT STRING EXPRESSION REQUIRED
                id = 5;
                break;
            case suffix:
                id = -10;
                break;
            case lastNameFinal: // DOES NOT COMPILE - CONSTANT STRING EXPRESSION REQUIRED
                id = 8;
                break;
            case "5": // DOES NOT COMPILE - INCOMPATIBLE TYPES - INT TO STRING
                id = 7;
                break;
            case "J": // DOES NOT COMPILE - INCOMPATIBLE TYPES INT TO STRING
                id = 10;
                break;
            case dayOfWeek:// DOES NOT COMPILE - INCOMPATIBLE TYPES - DAYOFWEEK TO STRING
                {
                    {
                        id = 15;
                    }
                }
                break;
        }
        return id;
    }
}
