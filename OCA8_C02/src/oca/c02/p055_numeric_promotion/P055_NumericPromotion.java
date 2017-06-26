/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p055_numeric_promotion;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P055_NumericPromotion {
    public static void main(String[] args) {
/**
Numeric Promotion Rules
*/
        {
            System.out.printf("%n ---- DIFFERENT DATA TYPES ----%n");
            
            char charValue = 'C';
            System.out.printf("%n charValue =         %c%n", charValue);
            byte byteValue = 127;
            System.out.printf(" byteValue =         %,d%n", byteValue);
            short shortValue = 32163;
            System.out.printf(" shortValue =        %,d%n", shortValue);
            int intValue = 356_635_435;
            System.out.printf(" intValue =          %,d%n", intValue);
            long longValue = 2_657_517_346_581_754_522L;
            System.out.printf(" longValue =         %,d%n", longValue);
            float floatValue = 45_365_365_365_365_216_553_887_357_401_687_167_183.3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890f;
            System.out.printf(" floatValue =        %,.2f%n", floatValue);
            double doubleValue = 45_365_365_365_365_216_553_887_357_401_687_167_183___45_365_365_365_365_216_553_887_357_401_687_167_183___45_365_365_365_365_216_553_887_357_401_687_167_183___45_365_365_365_365_216_553_887_357_401_687_167_183___45_365_365_365_365_216_553_887_357_401_687_167_183___45_365_365_365_365_216_553_887_357_401_687_167_183___45_365_365_365_365_216_553_887_357_401_687_167_183____45_365_365_365_365_216_553_887_357_401_687_167_183.3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890__3451025201225653253253625253652365626525655225315682552636523323520352356235623532236236365263256362653656369536967252362365325625563563655363563325424536523625363526352352356321234567891234567890d;
            System.out.printf(" doubleValue =       %,.2f%n", doubleValue);
/* 
1. If two values have different data types, Java will automatically promote one of the values
to the larger of the two data types.
*/
       
/**        
2. If one of the values is integral and the other is floating-point, Java will automatically
promote the integral value to the floating-point value’s data type.
*/
        
/**        
3. Smaller data types, namely byte, short, and char, are first promoted to int any time
they’re used with a Java binary arithmetic operator, even if neither of the operands is
int.
*/
        
/**        
4. After all promotion has occurred and the operands have the same data type, the resulting
value will have the same data type as its promoted operands.
*/
            {
                System.out.printf("%n ---- DIFFERENT DATA TYPES OPERATIONS ----%n");

//            short byteShortValue = byteValue - shortValue; // DON'T COMPILE - LOOSY CONVERTION INT TO SHORT
                int byteShortIntValue = byteValue + shortValue + intValue;// + longValue; //-> loosy convertion
                System.out.printf("%n byteShortIntValue = %,d%n", byteShortIntValue);
                long byteToLongValue = byteValue + shortValue + intValue + longValue;
                System.out.printf(" byteToLongValue = %,d%n", byteToLongValue);
                float byteToFloatValue = byteValue + shortValue + intValue + longValue + floatValue;
                System.out.printf(" byteToFloatValue = %,.2f%n", byteToFloatValue);
                double byteToDoubleValue = byteValue + shortValue + intValue + longValue + floatValue + doubleValue;
                System.out.printf(" byteToDoubleValue = %,.2f%n", byteToDoubleValue);
            }
/**
For the third rule, note that unary operators are excluded from this
rule. For example, applying ++ to a short value results in a short value.
 */     
            {
                System.out.printf("%n ---- UNARY OPERATIONS ----%n");

                char charUnary = ++charValue;
                System.out.printf("%n charUnary = %c%n", charUnary);
                byte unaryByte = ++byteValue;
                System.out.printf(" unaryByte = %,d%n", unaryByte);
                short unaryShort = ++shortValue;
                System.out.printf(" unaryShort = %,d%n", unaryShort);
            }
            
            System.out.printf("%n ---- EXAMPLES ----%n");
/**
■ What is the data type of x * y?
    int x = 1;
    long y = 33;
 */
            {
                int x = 1;
                long y = 33;
                long intLongValue = x * y;
                System.out.printf("%n intLongValue = %,d%n", intLongValue);
            }
/**
If we follow the first rule, since one of the values is long and the other is int, and long
is larger than int, then the int value is promoted to a long, and the resulting value is
long.
 */         
            
/**
What is the data type of x + y?
    double x = 39.21;
    float y = 2.1;
 */    
            {
                double x = 39.21 ;
//                float y = 2.1; // floating-point literals are assumed to be double, unless postfixed with an f
                float y = 2.1f;
                double floatDoubleValue = x * y;
                System.out.printf(" floatDoubleValue = %,.2f%n", floatDoubleValue);
            }
/**
This is actually a trick question, as this code will not compile! As you may remember
from Chapter 1, floating-point literals are assumed to be double, unless postfixed with
an f, as in 2.1f. If the value was set properly to 2.1f, then the promotion would be
similar to the last example, with both operands being promoted to a double, and the
result would be a double value.
 */            
            
/**
■ What is the data type of x / y?
    short x = 10;
    short y = 3;
 */            
            {
                short x = 10;
                short y = 3;
                int shortDivideShort = x / y;
                System.out.printf(" shortDivideShort = %,d%n", shortDivideShort);
            }
/**
In this case, we must apply the third rule, namely that x and y will both be promoted
to int before the operation, resulting in an output of type int. Pay close attention to
the fact that the resulting output is not a short.
 */            

/**
■ What is the data type of x * y / z?
    short x = 14;
    float y = 13;
    double z = 30;
 */            
            {
                short x = 14;
                float y = 13;
                double z = 30;
                double shortFloatDoubleValue = x * y / z;
                System.out.printf(" shortFloatDoubleValue = %,.2f%n", shortFloatDoubleValue);
            }
/**
In this case, we must apply all of the rules. First, x will automatically be promoted to
int solely because it is a short and it is being used in an arithmetic binary operation.
* 
The promoted x value will then be automatically promoted to a float so that it can be
multiplied with y. The result of x * y will then be automatically promoted to a double,
so that it can be multiplied with z, resulting in a double value.
 */            
        }             
    }
}
