package com.rplbo.pecahan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fraction numberOne = new Fraction(10,15);
        Fraction numberTwo = new Fraction(3,10);
        Fraction numberThree = new Fraction(4,6);

        Fraction summation = numberOne.summation(numberOne,numberTwo,numberThree);
        System.out.println("The Summation between two fractions");
        System.out.println(summation.toString());
        System.out.println(summation.toString("Summation"));
        System.out.println();
        System.out.println("The summation between three fractions");

        summation = numberOne.summation(numberOne,numberTwo,numberThree);
        System.out.println(summation.toString("Summation"));

        System.out.println("=============================================================================");

        System.out.println("=============================================================================");
        System.out.println();
        System.out.println("The subtraction between two fractions");
        Fraction subtraction = numberOne.subtraction(numberOne,numberTwo);
        System.out.println(subtraction.toString("Subtraction"));
        System.out.println();
        System.out.println("The subtraction between three fractions");
        subtraction = numberOne.subtraction(numberOne,numberTwo,numberThree);
        System.out.println(subtraction.toString("Subtraction"));
        System.out.println("=============================================================================");

        System.out.println("=============================================================================");
        System.out.println();
        System.out.println("The multiplication between two fractions");
        Fraction multiplication = numberOne.multiplications(numberOne,numberTwo);
        System.out.println(multiplication.toString("Multiplication"));
        System.out.println();
        System.out.println("The multiplication between three fractions");
        multiplication = numberOne.multiplication(numberOne,numberTwo,numberThree);
        System.out.println(multiplication.toString("Multiplication"));
        System.out.println("=============================================================================");

        System.out.println("=============================================================================");
        System.out.println();
        System.out.println("The Division between two fractions");
        Fraction division = numberOne.division(numberOne,numberTwo);
        System.out.println(division.toString("Division"));
        System.out.println();
        System.out.println("The division between three fractions");

        division = numberOne.division(numberOne,numberTwo,numberThree);
        System.out.println(division.toString("Division"));

        System.out.println("=============================================================================");

        System.out.println("=============================================================================");
    }
}
