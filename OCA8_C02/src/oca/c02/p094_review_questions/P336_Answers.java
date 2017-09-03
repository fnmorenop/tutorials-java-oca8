/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p094_review_questions;

/**
 * 01. A. D. 
 * 02. A. B. D. 
 * 03. F.
 * 04. B. C. D. F.
 * 05. C.
 * X 06. E. --> F
 * X 07. D.
 * 08. B.
 * X 09. A. --> F.
 * 10. D.
 * 11. A.
 * X 12. B. --> D.
 * 13. A.
 * 14. C.
 * X 15. F. --> E.
 * 16. D.
 * 17. D.
 * X 18. C. --> B.
 * 19. D.
 * X 20. E. --> B.
 */
/**
 * 14/20 = %
 */
public class P336_Answers {
/**
1. A, D. Option A is the equality operator and can be used on numeric primitives, boolean
values, and object references. Options B and C are both arithmetic operators and
cannot be applied to a boolean value. Option D is the logical complement operator
and is used exclusively with boolean values. Option E is the modulus operator, which
can only be used with numeric primitives. Finally, option F is a relational operator that
compares the values of two numbers.
* 
2. A, B, D. The value x + y is automatically promoted to int, so int and data types that
can be promoted automatically from int will work. Options A, B, D are such data
types. Option C will not work because boolean is not a numeric data type. Options E
and F will not work without an explicit cast to a smaller data type.
* 
3. F. In this example, the ternary operator has two expressions, one of them a String and
the other a boolean value. The ternary operator is permitted to have expressions that
don’t have matching types, but the key here is the assignment to the String reference.
The compiler knows how to assign the first expression value as a String, but the second
boolean expression cannot be set as a String; therefore, this line will not compile.
* 
4. B, C, D, F. The code will not compile as is, so option A is not correct. The value 2 * x
is automatically promoted to long and cannot be automatically stored in y, which is
in an int value. Options B, C, and D solve this problem by reducing the long value to
int. Option E does not solve the problem and actually makes it worse by attempting
to place the value in a smaller data type. Option F solves the problem by increasing the
data type of the assignment so that long is allowed.
* 
5. C. This code does not contain any compilation errors or an infinite loop, so options D,
E, and F are incorrect. The break statement on line 8 causes the loop to execute once
and finish, so option C is the correct answer.
* 
6. F. The code does not compile because two else statements cannot be chained together
without additional if-then statements, so the correct answer is option F. Option E is
incorrect as Line 6 by itself does not cause a problem, only when it is paired with Line 7. 
One way to fix this code so it compiles would be to add an if-then statement on
line 6. The other solution would be to remove line 7.
* 
7. D. As you learned in the section “Ternary Operator,” although parentheses are not
required, they do greatly increase code readability, such as the following equivalent
statement:

System.out.println((x > 2) ? ((x < 4) ? 10 : 8) : 7)

We apply the outside ternary operator first, as it is possible the inner ternary expression
may never be evaluated. Since (x>2) is true, this reduces the problem to:

System.out.println((x < 4) ? 10 : 8)

Since x is greater than 2, the answer is 8, or option D in this case.
* 
8. B. This example is tricky because of the second assignment operator embedded in line
5. The expression (z=false) assigns the value false to z and returns false for the
entire expression. Since y does not equal 10, the left-hand side returns true; therefore,
the exclusive or (^) of the entire expression assigned to x is true. The output reflects
these assignments, with no change to y, so option B is the only correct answer. The
code compiles and runs without issue, so option F is not correct.
* 
9. F. In this example, the update statement of the for loop is missing, which is fine as the
statement is optional, so option D is incorrect. The expression inside the loop increments
i but then assigns i the old value. Therefore, i ends the loop with the same value
that it starts with: 0. The loop will repeat infinitely, outputting the same statement over
and over again because i remains 0 after every iteration of the loop.
* 
10. D. Line 4 generates a possible loss of precision compiler error. The cast operator has
the highest precedence, so it is evaluated first, casting a to a byte. Then, the addition is
evaluated, causing both a and b to be promoted to int values. The value 90 is an int
and cannot be assigned to the byte sum without an explicit cast, so the code does not
compile. The code could be corrected with parentheses around (a + b), in which case
option C would be the correct answer.
* 
11. A. The * and % have the same operator precedence, so the expression is evaluated
from left-to-right. The result of 5 * 4 is 20, and 20 % 3 is 2 (20 divided by 3 is 18, the
remainder is 2). The output is 2 and option A is the correct answer.
* 
12. D. The variable x is an int and s is a reference to a String object. The two data types
are incomparable because neither variable can be converted to the other variable’s type.
The compiler error occurs on line 5 when the comparison is attempted, so the answer
is option D.
* 
13. A. The code compiles successfully, so options C and D are incorrect. The value of b
after line 4 is false. However, the if-then statement on line 5 contains an assignment,
not a comparison. The variable b is assigned true on line 3, and the assignment operator
returns true, so line 5 executes and displays Success, so the answer is option A.
* 
14. C. The code compiles successfully, so option F is incorrect. On line 5, the pre-increment
operator is used, so c is incremented to 4 and the new value is returned to the
expression. The value of result is computed by adding 4 to the original value of 8,
resulting in a new value of 12, which is output on line 6. Therefore, option C is the
correct answer.
* 
15. E. This is actually a much simpler problem than it appears to be. The while statement
on line 4 is missing parentheses, so the code will not compile, and option E is the correct
answer. If the parentheses were added, though, option F would be the correct
answer since the loop does not use curly braces to include x++ and the boolean expression
never changes. Finally, if curly braces were added around both expressions, the
output would be 10, 6 and option B would be correct.
* 
16. D. The variable y is declared within the body of the do-while statement, so it is out of
scope on line 6. Line 6 generates a compiler error, so option D is the correct answer.
* 
17. D. The code compiles without issue, so option F is incorrect. After the first execution
of the loop, i is decremented to 9 and result to 13. Since i is not 8, keepGoing is
false, and the loop continues. On the next iteration, i is decremented to 8 and result
to 11. On the second execution, i does equal 8, so keepGoing is set to false. At the
conclusion of the loop, the loop terminates since keepGoing is no longer true. The
value of result is 11, and the correct answer is option D.
* 
18. A. The expression on line 5 is true when row * col is an even number. On the first
iteration, row = 1 and col = 1, so the expression on line 6 is false, the continue is
skipped, and count is incremented to 1. On the second iteration, row = 1 and
col = 2, so the expression on line 6 is true and the continue ends the outer loop with
count still at 1. On the third iteration, row = 2 and col = 1, so the expression on line
6 is true and the continue ends the outer loop with count still at 1. On the fourth
iteration, row = 3 and col = 1, so the expression on line 6 is false, the continue is
skipped, and count is incremented to 2. Finally, on the fifth and final iteration, row
= 3 and col = 2, so the expression on line 6 is true and the continue ends the outer
loop with count still at 2. The result of 2 is displayed, so the answer is option B.
* 
19. D. Prior to the first iteration, m = 9, n = 1, and x = 0. After the iteration of the first
loop, m is updated to 8, n to 3, and x to the sum of the new values for m + n, 0 + 11 =
11. After the iteration of the second loop, m is updated to 7, n to 5, and x to the sum
of the new values for m + n, 11 + 12 = 23. After the iteration of the third loop, m is
updated to 6, n to 7, and x to the sum of the new values for m + n, 23 + 13 = 36. On
the fourth iteration of the loop, m > n evaluates to false, as 6 < 7 is not true. The
loop ends and the most recent value of x, 36, is output, so the correct answer is option
D.
* 
20. B. The code compiles and runs without issue, so options C, D, and E are not correct. The
value of grade is 'B' and there is a matching case statement that will cause "great" to
be printed. There is no break statement after the case, though, so the next case statement
will be reached, and "good" will be printed. There is a break after this case statement,
though, so the switch statement will end. The correct answer is thus option B.
 */
}
