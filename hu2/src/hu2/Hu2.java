/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu2;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Hu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester tester = new NumberTester("numbers.csv");
        tester.testFile();

//------------------------------------------------------------------------------
        CalculationOperation rationalAdd = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() + y.getA());
            res.setB(x.getA() + y.getA());
            return res;
        };
        CalculationOperation rationalSubtract = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() - y.getA());
            res.setB(x.getA() - y.getA());
            return res;
        };
        CalculationOperation rationalMultiply = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() * y.getA());
            res.setB(x.getA() * y.getA());
            return res;
        };
        CalculationOperation rationalDivide = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() / y.getA());
            res.setB(x.getA() / y.getA());
            return res;
        };

        CalculationOperation vectorAdd = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() + y.getA());
            res.setB(x.getB() + y.getB());
            return res;
        };
        CalculationOperation vectorSubtract = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() - y.getA());
            res.setB(x.getB() - y.getB());
            return res;
        };
        CalculationOperation vectorMultiply = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() * y.getA());
            res.setB(x.getB() * y.getB());

            return res;
        };
        CalculationOperation vectorDivide = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() * y.getA() + x.getB() * y.getB());
            res.setB(x.getB() / y.getB());
            return res;
        };

        double i = Math.sqrt(-1);
        CalculationOperation comblexAdd = (x, y) -> {
            Number res = new Number();
            res.setA((x.getA() + y.getA()) + (x.getA() + y.getA()) * i);
            res.setB((x.getA() + y.getA()) + (x.getA() + y.getA()) * i);
            return res;
        };
        CalculationOperation comblexSubtract = (x, y) -> {
            Number res = new Number();
            res.setA((x.getA() - y.getA()) + (x.getA() - y.getA()) * i);
            res.setB((x.getA() - y.getA()) + (x.getA() - y.getA()) * i);
            return res;
        };
        CalculationOperation comblexMultiply = (x, y) -> {
            Number res = new Number();
            res.setA((x.getA() - y.getA()) + (x.getB() + y.getB()) * i);
            res.setB((x.getA() - y.getA()) + (x.getB() + y.getB()) * i);
            return res;
        };
        CalculationOperation comblexDivide = (x, y) -> {
            Number res = new Number();
            res.setA(((x.getA() + x.getB() * i) * (y.getA() - y.getB() * i)) / ((y.getA() + y.getB() * i) * (y.getA() - y.getB() * i)));
            res.setB(((x.getA() + x.getB() * i) * (y.getA() - y.getB() * i)) / ((y.getA() + y.getB() * i) * (y.getA() - y.getB() * i)));
            return res;
        };
//------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int eingabe = 0;
        int operationNumber = 0;
        System.out.println("Calculators------------------------------------------------------");
        Number numberA = new Number();
        Number numberB = new Number();
        try {
            System.out.println("Choose Calculator");
            System.out.println("1 - Rational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit Program");
            eingabe = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Number x a:");
            numberA.setA(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter Number x b:");
            numberA.setB(Integer.parseInt(sc.nextLine()));

            System.out.println("Enter Number x a:");
            numberB.setA(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter Number x b:");
            numberB.setB(Integer.parseInt(sc.nextLine()));

            System.out.println("Choose Operation");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Enter numbers again");
            operationNumber = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Geben Sie eine gültige Zahl ein");
        }
        if (eingabe == 1) {
            RationalCalculator rCalc = new RationalCalculator(rationalAdd, rationalSubtract, rationalMultiply, rationalDivide);
            if (operationNumber == 1) {
                System.out.println("Solution A: " + rCalc.add(numberA, numberB).getA());
                System.out.println("Solution B: " + rCalc.add(numberA, numberB).getB());
            } else if (operationNumber == 2) {
                System.out.println("Solution: " + rCalc.subtract(numberA, numberB));
            } else if (operationNumber == 3) {
                System.out.println("Solution: " + rCalc.multiply(numberA, numberB));
            } else if (operationNumber == 4) {
                System.out.println("Solution: " + rCalc.divide(numberA, numberB));
            } else if (operationNumber == 5) {

            } else {
                System.out.println("Geben Sie eine gültige Zahl ein");
            }
        } else if (eingabe == 2) {
            VectorCalculator vCalc = new VectorCalculator(vectorAdd, vectorSubtract, vectorMultiply, vectorDivide);
            RationalCalculator rCalc = new RationalCalculator(rationalAdd, rationalSubtract, rationalMultiply, rationalDivide);
            if (operationNumber == 1) {
                System.out.println("Solution: " + vCalc.add(numberA, numberB));
            } else if (operationNumber == 2) {
                System.out.println("Solution: " + vCalc.subtract(numberA, numberB));
            } else if (operationNumber == 3) {
                System.out.println("Solution: " + vCalc.multiply(numberA, numberB));
            } else if (operationNumber == 4) {
                System.out.println("Solution: " + vCalc.divide(numberA, numberB));
            } else if (operationNumber == 5) {

            } else {
                System.out.println("Geben Sie eine gültige Zahl ein");
            }
        } else if (eingabe == 3) {
            ComplexCalculator cCalc = new ComplexCalculator(comblexAdd, comblexSubtract, comblexMultiply, comblexDivide);
        } else if (eingabe == 4) {

        }
    }

}
